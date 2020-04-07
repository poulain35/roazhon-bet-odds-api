package com.roazhonspartiates.roazhonbetoddsapi.service;


import com.roazhonspartiates.roazhonbetoddsapi.model.Odds;
import java.util.List;

public interface IOddsService {

    List<Odds> findAll();

    List<Odds> putOdds(List<Odds> odds);
}

