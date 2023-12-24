package com.example.FlightSearchAPI.service;

import com.example.FlightSearchAPI.entity.Flight;
import com.example.FlightSearchAPI.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class FlightDataFetchService {

    private final FlightRepository flightRepository;

    @Autowired
    public FlightDataFetchService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Scheduled(cron = "0 0 1 * * *")
    public void fetchDataAndStoreToDatabase() {

        Flight mockFlight = createMockFlightData();
        flightRepository.save(mockFlight);
    }

    private Flight createMockFlightData() {
        return new Flight(
                null,
                "IST",
                "JFK",
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(6),
                BigDecimal.valueOf(250.00)
        );
    }
}
