package com.revature.models;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "t_id", updatable = false)
	private int ticketId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "c_id")
	private Customer customerId;
	
	@Column(name = "passport_no")
	private int passportNo;
	
	@Column(name = "expiry_date")
	private String expiryDate;
	
	@Column(name = "checked_bag")
	private int checkedBag;
	
	@Column(name = "carry_on_bag")
	private int carryOnBag;
	
	@Column(name = "meal")
	private String meal;
	
	@Column(name = "cabin_class")
	private String cabinClass;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "f_id")
	private Flight flight;
	
	
	public Ticket() {
		super();
	}


	public Ticket(int ticketId, Customer customerId, int passportNo, String expiryDate, int checkedBag, int carryOnBag,
			String meal, String cabinClass, Flight flight) {
		super();
		this.ticketId = ticketId;
		this.customerId = customerId;
		this.passportNo = passportNo;
		this.expiryDate = expiryDate;
		this.checkedBag = checkedBag;
		this.carryOnBag = carryOnBag;
		this.meal = meal;
		this.cabinClass = cabinClass;
		this.flight = flight;
	}


	public Ticket(Customer customerId, int passportNo, String expiryDate, int checkedBag, int carryOnBag, String meal,
			String cabinClass, Flight flight) {
		super();
		this.customerId = customerId;
		this.passportNo = passportNo;
		this.expiryDate = expiryDate;
		this.checkedBag = checkedBag;
		this.carryOnBag = carryOnBag;
		this.meal = meal;
		this.cabinClass = cabinClass;
		this.flight = flight;
	}


	public Ticket(Customer customerId, int passportNo, String expiryDate, int checkedBag, int carryOnBag, String meal,
			String cabinClass) {
		super();
		this.customerId = customerId;
		this.passportNo = passportNo;
		this.expiryDate = expiryDate;
		this.checkedBag = checkedBag;
		this.carryOnBag = carryOnBag;
		this.meal = meal;
		this.cabinClass = cabinClass;
	}


	public int getTicketId() {
		return ticketId;
	}


	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}


	public Customer getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}


	public int getPassportNo() {
		return passportNo;
	}


	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}


	public String getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}


	public int getCheckedBag() {
		return checkedBag;
	}


	public void setCheckedBag(int checkedBag) {
		this.checkedBag = checkedBag;
	}


	public int getCarryOnBag() {
		return carryOnBag;
	}


	public void setCarryOnBag(int carryOnBag) {
		this.carryOnBag = carryOnBag;
	}


	public String getMeal() {
		return meal;
	}


	public void setMeal(String meal) {
		this.meal = meal;
	}


	public String getCabinClass() {
		return cabinClass;
	}


	public void setCabinClass(String cabinClass) {
		this.cabinClass = cabinClass;
	}


	public Flight getFlight() {
		return flight;
	}


	public void setFlight(Flight flight) {
		this.flight = flight;
	}


	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", customerId=" + customerId + ", passportNo=" + passportNo
				+ ", expiryDate=" + expiryDate + ", checkedBag=" + checkedBag + ", carryOnBag=" + carryOnBag + ", meal="
				+ meal + ", cabinClass=" + cabinClass + ", flight=" + flight + "]";
	}
	
}
