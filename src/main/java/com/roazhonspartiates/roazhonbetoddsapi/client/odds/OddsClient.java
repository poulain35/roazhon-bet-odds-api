package com.roazhonspartiates.roazhonbetoddsapi.client.odds;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OddsClient {
    Boolean success;
    List<OddsClientData> data;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<OddsClientData> getData() {
        return data;
    }

    public void setData(List<OddsClientData> data) {
        this.data = data;
    }
}
