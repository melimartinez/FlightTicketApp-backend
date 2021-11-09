
package com.revature.controllers;

import com.revature.models.Flight;
import com.revature.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightController {

    @Autowired
    FlightService fs;

    //Crud Controllers

    @GetMapping("/flight/{id}")
    public Flight getFlight(@PathVariable("id") String id) {
        return fs.getFlight(Integer.parseInt(id));
    }

    @GetMapping("/flight")
    public List<Flight> getAllFlights() {
        return fs.getAllFlights();
    }

    @PostMapping(value = "/flight", consumes = "application/json", produces = "application/json")
    public Flight addFlight(@RequestBody Flight f) {
        return fs.addFlight(f);
    }

    @PutMapping(value = "/flight/{id}", consumes = "application/json", produces = "application/json")
    public Flight updateFlight(@PathVariable("id") String id, @RequestBody Flight change) {
        change.setId(Integer.parseInt(id));
        return fs.updateFlight(change);
    }

    @DeleteMapping("/flight/{id}")
    public boolean deleteFlight(@PathVariable("id") int id) {
        return fs.deleteFlight(id);
    }

    //Additional Controllers below as needed
    //
}
