# Flight Search API

FlightSearchAPI is a Spring Boot application that provides an API for managing flight information.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup](#setup)
- [Usage](#usage)
- [Endpoints](#endpoints)


## Introduction

FlightSearchAPI is designed to handle various operations related to flights, including CRUD functionalities (Create, Read, Update, Delete) and searching for flights based on different criteria such as departure airport, arrival airport, and date/time.

## Features

- **CRUD Operations:** Perform basic CRUD operations on flight entities.
- **Flight Search:** Search for flights based on departure airport, arrival airport, and date/time criteria.
- **API Endpoints:** Provides RESTful API endpoints for interacting with flight data.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL (or your preferred database)
- Other dependencies as per the project requirements
- Swagger
- OAuth2

## Setup

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/your-username/FlightSearchAPI.git


2. **Database Configuration:**

Configure your database settings in the application.properties or application.yml file.

3. **Build and Run:**

Build the project using Maven or your preferred build tool.
Run the application using your IDE or by executing the generated JAR file.

## Usage

<p>Once the application is up and running, you can interact with it using the provided API endpoints. Here are some examples:</p>

<ul>
  <li>Retrieve all flights: <code>GET /flights</code></li>
  <li>Retrieve a specific flight by ID: <code>GET /flights/{id}</code></li>
  <li>Create a new flight: <code>POST /flights</code></li>
  <li>Update an existing flight: <code>PUT /flights/{id}</code></li>
  <li>Delete a flight: <code>DELETE /flights/{id}</code></li>
  <li>Search for flights based on criteria: <code>GET /flights/search</code></li>
</ul>

## Endpoints

<table>
  <tr>
    <th>Endpoint</th>
    <th>Description</th>
    <th>Request Type</th>
  </tr>
  <tr>
    <td><code>GET /flights</code></td>
    <td>Retrieve all flights</td>
    <td>GET</td>
  </tr>
  <tr>
    <td><code>GET /flights/{id}</code></td>
    <td>Retrieve a specific flight by ID</td>
    <td>GET</td>
  </tr>
  <tr>
    <td><code>POST /flights</code></td>
    <td>Create a new flight</td>
    <td>POST</td>
  </tr>
  <tr>
    <td><code>PUT /flights/{id}</code></td>
    <td>Update an existing flight</td>
    <td>PUT</td>
  </tr>
  <tr>
    <td><code>DELETE /flights/{id}</code></td>
    <td>Delete a flight</td>
    <td>DELETE</td>
  </tr>
  <tr>
    <td><code>GET /flights/search</code></td>
    <td>Search for flights based on criteria</td>
    <td>GET</td>
  </tr>
</table>
