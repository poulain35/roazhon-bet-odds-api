package com.roazhonspartiates.roazhonbetoddsapi.odds;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Odds {
    Boolean success;
    List<OddsData> data;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<OddsData> getData() {
        return data;
    }

    public void setData(List<OddsData> data) {
        this.data = data;
    }
}
