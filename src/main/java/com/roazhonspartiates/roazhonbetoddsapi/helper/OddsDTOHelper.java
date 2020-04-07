package com.roazhonspartiates.roazhonbetoddsapi.helper;

import com.roazhonspartiates.roazhonbetoddsapi.client.odds.OddsClientData;
import com.roazhonspartiates.roazhonbetoddsapi.model.Odds;

import java.util.ArrayList;
import java.util.List;

public class OddsDTOHelper {

    public List<Odds> toDTO(List<OddsClientData> oddsClientData) {
        List<Odds> oddsList = new ArrayList<>();

        for (OddsClientData data : oddsClientData) {
            Odds odds = new Odds();

            //odds.set();

            oddsList.add(odds);
        }

        return oddsList;
    }
}
