package com.example.FlightSearchAPI.service;

import com.example.FlightSearchAPI.entity.Airport;
import com.example.FlightSearchAPI.repository.AirportRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService {
    private final AirportRepository airportRepository;

    public AirportService(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }

    public Airport getAirportById(Long id) {
        return airportRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Airport not found with id: " + id));
    }

    public Airport createAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    public Airport updateAirport(Long id, Airport newAirport) {
        Airport existingAirport = airportRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Airport not found with id: " + id));


        return airportRepository.save(existingAirport);
    }

    public boolean deleteAirport(Long id) {
        airportRepository.deleteById(id);
        return false;
    }
}