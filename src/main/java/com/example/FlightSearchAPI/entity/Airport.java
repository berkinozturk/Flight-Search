package com.example.FlightSearchAPI.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "airports")
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;


    public Airport(Long id, String city) {
        this.id = id;
        this.city = city;
    }


}
