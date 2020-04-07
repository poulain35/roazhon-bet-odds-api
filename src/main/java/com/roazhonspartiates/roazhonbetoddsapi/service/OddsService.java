package com.roazhonspartiates.roazhonbetoddsapi.service;


import com.roazhonspartiates.roazhonbetoddsapi.model.Odds;
import com.roazhonspartiates.roazhonbetoddsapi.repository.OddsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OddsService implements IOddsService {

    @Autowired
    private OddsRepository repository;

    @Override
    public List<Odds> findAll() {

        return (List<Odds>) repository.findAll();
    }

    @Override
    public List<Odds> putOdds(List<Odds> odds) {

        return (List<Odds>) repository.saveAll(odds);
    }
}
