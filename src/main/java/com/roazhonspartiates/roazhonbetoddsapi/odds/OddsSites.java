package com.roazhonspartiates.roazhonbetoddsapi.odds;

import java.util.Date;

public class OddsSites {

    String site_key;
    String site_nice;
    Date last_update;
    OddsScore odds;

    public String getSite_key() {
        return site_key;
    }

    public void setSite_key(String site_key) {
        this.site_key = site_key;
    }

    public String getSite_nice() {
        return site_nice;
    }

    public void setSite_nice(String site_nice) {
        this.site_nice = site_nice;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    public OddsScore getOdds() {
        return odds;
    }

    public void setOdds(OddsScore odds) {
        this.odds = odds;
    }
}
