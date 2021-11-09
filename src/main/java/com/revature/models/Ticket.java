package com.revature.models;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	@Column(name = "t_id")
	private int ticketId;
	
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
	
	@ManyToOne
	@JoinColumn(name = "f_id")
	private Flight flight;
	
	
	public Ticket() {
		super();
	}
	

	public Ticket(int ticketId, int passportNo, String expiryDate, int checkedBag, int carryOnBag, String meal,
			String cabinClass, Flight flight) {
		super();
		this.ticketId = ticketId;
		this.passportNo = passportNo;
		this.expiryDate = expiryDate;
		this.checkedBag = checkedBag;
		this.carryOnBag = carryOnBag;
		this.meal = meal;
		this.cabinClass = cabinClass;
		this.flight = flight;
	}
	
	public Ticket(int passportNo, String expiryDate, int checkedBag, int carryOnBag, String meal,
			String cabinClass, Flight flight) {
		super();
		this.passportNo = passportNo;
		this.expiryDate = expiryDate;
		this.checkedBag = checkedBag;
		this.carryOnBag = carryOnBag;
		this.meal = meal;
		this.cabinClass = cabinClass;
		this.flight = flight;
	}


	public Ticket(int passportNo, String expiryDate, int checkedBag, int carryOnBag, String meal, String cabinClass) {
		super();
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
		return "Ticket [ticketId=" + ticketId + ", passportNo=" + passportNo + ", expiryDate=" + expiryDate
				+ ", checkedBag=" + checkedBag + ", carryOnBag=" + carryOnBag + ", meal=" + meal + ", cabinClass="
				+ cabinClass + ", flight=" + flight + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(cabinClass, carryOnBag, checkedBag, expiryDate, meal, passportNo, ticketId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return Objects.equals(cabinClass, other.cabinClass) && carryOnBag == other.carryOnBag
				&& checkedBag == other.checkedBag && Objects.equals(expiryDate, other.expiryDate)
				&& Objects.equals(meal, other.meal) && passportNo == other.passportNo && ticketId == other.ticketId;
	}
	
}
