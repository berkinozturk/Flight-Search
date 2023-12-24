package com.example.FlightSearchAPI.repository;

import com.example.FlightSearchAPI.entity.Flight;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

}
