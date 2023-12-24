package com.example.FlightSearchAPI.entity;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "airports")
public class Airport implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "airport_id")
    private Long id;

    private String city;


    public Airport(Long id, String city) {
        this.id = id;
        this.city = city;
    }

    public Airport() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
