package com.roazhonspartiates.roazhonbetoddsapi.repository;
import com.roazhonspartiates.roazhonbetoddsapi.model.Odds;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OddsRepository extends CrudRepository<Odds, Long> {

}

