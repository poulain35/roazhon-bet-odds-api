package com.roazhonspartiates.roazhonbetoddsapi;

import com.roazhonspartiates.roazhonbetoddsapi.client.odds.OddsClient;
import com.roazhonspartiates.roazhonbetoddsapi.client.odds.OddsClientService;
import com.roazhonspartiates.roazhonbetoddsapi.client.odds.OddsClientServiceImpl;
import com.roazhonspartiates.roazhonbetoddsapi.helper.OddsDTOHelper;
import com.roazhonspartiates.roazhonbetoddsapi.model.Odds;
import com.roazhonspartiates.roazhonbetoddsapi.service.OddsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
public class ScheduledTasks {
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    private OddsService oddsService;

    @Scheduled(fixedRate = 2000)
    public void scheduleTaskWithFixedRate() throws Exception {
        logger.info("Fixed Rate Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()) );

        logger.info("Récupération des odds API");
        OddsClientService oddsClientService = new OddsClientServiceImpl();
        OddsClient oddsClient = oddsClientService.getOdds();

        logger.info("Formattage des odds");
        OddsDTOHelper oddsHelper = new OddsDTOHelper();
        List<Odds> oddsList = oddsHelper.toDTO(oddsClient.getData());

        logger.info("Insertion en base des odds");
        oddsService.putOdds(oddsList);

        logger.info("Fin du traitement des odds");
    }

    /*
    @Scheduled(fixedDelay = 2000)
    public void scheduleTaskWithFixedDelay() {
        logger.info("Fixed Delay Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ex) {
            logger.error("Ran into an error {}", ex);
            throw new IllegalStateException(ex);
        }
    }

    @Scheduled(fixedRate = 2000, initialDelay = 5000)
    public void scheduleTaskWithInitialDelay() {
        logger.info("Fixed Rate Task with Initial Delay :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
    }

    @Scheduled(cron = "0 * * * * ?")
    public void scheduleTaskWithCronExpression() {
        logger.info("Cron Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
    }
    */
}
