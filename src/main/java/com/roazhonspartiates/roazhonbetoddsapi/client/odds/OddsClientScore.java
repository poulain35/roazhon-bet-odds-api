package com.roazhonspartiates.roazhonbetoddsapi.client.odds;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OddsClientScore {

    List<String> h2h;
    List<String> h2h_lay;
}
