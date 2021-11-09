package com.revature.services;

import com.revature.models.Spaceport;

import java.util.List;

public interface SpaceportService {

    // CRUD operations
    public Spaceport getSpaceport(int id);
    public List<Spaceport> getAllSpaceports();
    public Spaceport addSpaceport(Spaceport sp);
    public  Spaceport updateSpaceport(Spaceport change);
    public boolean deleteSpaceport(int id);



//    public Flight getFlight(int id);
//    public List<Flight> getAllFlights();
//    public Flight addFlight(Flight f);
//    public Flight updateFlight(Flight change);
//    public boolean deleteFlight(int id);
}
