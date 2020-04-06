package com.roazhonspartiates.roazhonbetoddsapi.odds;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OddsScore {

    List<String> h2h;
    List<String> h2h_lay;
}
