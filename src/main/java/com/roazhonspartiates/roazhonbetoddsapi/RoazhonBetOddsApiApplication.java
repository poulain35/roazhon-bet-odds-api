package com.roazhonspartiates.roazhonbetoddsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RoazhonBetOddsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoazhonBetOddsApiApplication.class, args);
	}

}
