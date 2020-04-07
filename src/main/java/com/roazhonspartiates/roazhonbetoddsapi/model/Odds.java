package com.roazhonspartiates.roazhonbetoddsapi.model;

import javax.persistence.*;

@Entity
@Table(name = "odds")
public class Odds {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String home;
    private String visitor;
    private String dateDebut;
    private String odds1;
    private String oddsN;
    private String odds2;

    public Odds() {
    }



}
