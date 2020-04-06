package com.roazhonspartiates.roazhonbetoddsapi.odds;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OddsData {
    String sport_key;
    String sport_nice;
    List<String> teams;
    Date commence_time;
    String home_team;
    List<OddsSites> sites;
    Integer sites_count;

    public String getSport_key() {
        return sport_key;
    }

    public void setSport_key(String sport_key) {
        this.sport_key = sport_key;
    }

    public String getSport_nice() {
        return sport_nice;
    }

    public void setSport_nice(String sport_nice) {
        this.sport_nice = sport_nice;
    }

    public List<String> getTeams() {
        return teams;
    }

    public void setTeams(List<String> teams) {
        this.teams = teams;
    }

    public Date getCommence_time() {
        return commence_time;
    }

    public void setCommence_time(Date commence_time) {
        this.commence_time = commence_time;
    }

    public String getHome_team() {
        return home_team;
    }

    public void setHome_team(String home_team) {
        this.home_team = home_team;
    }

    public List<OddsSites> getSites() {
        return sites;
    }

    public void setSites(List<OddsSites> sites) {
        this.sites = sites;
    }

    public Integer getSites_count() {
        return sites_count;
    }

    public void setSites_count(Integer sites_count) {
        this.sites_count = sites_count;
    }
}
