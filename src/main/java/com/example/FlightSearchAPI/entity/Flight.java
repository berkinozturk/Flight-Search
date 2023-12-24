package com.example.FlightSearchAPI.entity;


import jakarta.persistence.*;


import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "departure_airport_id")
    private String departureAirportId;

    @Column(name = "arrival_airport_id")
    private String arrivalAirportId;

    @Column(name = "departure_datetime")
    private LocalDateTime departureDateTime;

    @Column(name = "return_datetime")
    private LocalDateTime returnDateTime;

    private BigDecimal price;

    public Flight(Long id, String departureAirportId, String arrivalAirportId, LocalDateTime departureDateTime, LocalDateTime returnDateTime, BigDecimal price) {
        this.id = id;
        this.departureAirportId = departureAirportId;
        this.arrivalAirportId = arrivalAirportId;
        this.departureDateTime = departureDateTime;
        this.returnDateTime = returnDateTime;
        this.price = price;
    }
    
}
