package com.revature.models;

import javax.persistence.*;

@Entity
@Table(name="flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "f_id", updatable = false)
    private int id;

    @Column(name = "departure_date_time")
    private long departureDateTime;

    @Column(name = "arrival_date_time")
    private long arrivalDateTime;

    @Column(name = "price_per_ticket")
    private float pricePerTicket;

    @Column(name = "v_cost")
    private float vendorCost;

    @Column(name = "tickets_available")
    private int ticketsAvailable;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "departure_spaceport_id")
    private Spaceport departureSpaceportId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "arrival_spaceport_id")
    private Spaceport arrivalSpaceportId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "v_id")
    private Vendor vendorId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ss_id")
    private Spaceship spaceshipId;

    public Flight() {
    }

    public Flight(int id, long departureDateTime, long arrivalDateTime, float pricePerTicket, float vendorCost, int ticketsAvailable, int departureSpaceportId, int arrivalSpaceportId, int vendorId, int spaceshipId) {
        this.id = id;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.pricePerTicket = pricePerTicket;
        this.vendorCost = vendorCost;
        this.ticketsAvailable = ticketsAvailable;
        this.departureSpaceportId = departureSpaceportId;
        this.arrivalSpaceportId = arrivalSpaceportId;
        this.vendorId = vendorId;
        this.spaceshipId = spaceshipId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(long departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public long getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(long arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public float getPricePerTicket() {
        return pricePerTicket;
    }

    public void setPricePerTicket(float pricePerTicket) {
        this.pricePerTicket = pricePerTicket;
    }

    public float getVendorCost() {
        return vendorCost;
    }

    public void setVendorCost(float vendorCost) {
        this.vendorCost = vendorCost;
    }

    public int getTicketsAvailable() {
        return ticketsAvailable;
    }

    public void setTicketsAvailable(int ticketsAvailable) {
        this.ticketsAvailable = ticketsAvailable;
    }

    public int getDepartureSpaceportID() {
        return departureSpaceportId;
    }

    public void setDepartureSpaceportID(int departureSpaceportID) {
        this.departureSpaceportId = departureSpaceportId;
    }

    public int getArrivalSpaceportID() {
        return arrivalSpaceportId;
    }

    public void setArrivalSpaceportId(int arrivalSpaceportId) {
        this.arrivalSpaceportId = arrivalSpaceportId;
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public int getSpaceshipId() {
        return spaceshipId;
    }

    public void setSpaceshipId(int spaceshipID) {
        this.spaceshipId = spaceshipId;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", departureDateTime=" + departureDateTime +
                ", arrivalDateTime=" + arrivalDateTime +
                ", pricePerTicket=" + pricePerTicket +
                ", vendorCost=" + vendorCost +
                ", ticketsAvailable=" + ticketsAvailable +
                ", departureSpaceportId=" + departureSpaceportId +
                ", arrivalSpaceportId=" + arrivalSpaceportId +
                ", vendorId=" + vendorId +
                ", spaceshipId=" + spaceshipId +
                '}';
    }
}
