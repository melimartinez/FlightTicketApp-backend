package com.revature.models;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="spaceship")
public class Spaceship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ss_id")
    private int ssId;

    @Column(name = "type_of_spaceship")
    private String typeOfSpaceship;

    @Column(name = "ss_name")
    private String ssName;

    @Column(name = "num_seats")
    private int numSeats;
    
    
	public Spaceship() {
		super();
	}
	

	public Spaceship(int ssId, String typeOfSpaceship, String ssName, int numSeats) {
		super();
		this.ssId = ssId;
		this.typeOfSpaceship = typeOfSpaceship;
		this.ssName = ssName;
		this.numSeats = numSeats;
	}


	public int getSsId() {
		return ssId;
	}

	public void setSsId(int ssId) {
		this.ssId = ssId;
	}

	public String getTypeOfSpaceship() {
		return typeOfSpaceship;
	}

	public void setTypeOfSpaceship(String typeOfSpaceship) {
		this.typeOfSpaceship = typeOfSpaceship;
	}

	public String getSsName() {
		return ssName;
	}

	public void setSsName(String ssName) {
		this.ssName = ssName;
	}

	public int getNumSeats() {
		return numSeats;
	}

	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}


	@Override
	public String toString() {
		return "Spaceship [ssId=" + ssId + ", typeOfSpaceship=" + typeOfSpaceship + ", ssName=" + ssName + ", numSeats="
				+ numSeats + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(numSeats, ssId, ssName, typeOfSpaceship);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Spaceship other = (Spaceship) obj;
		return numSeats == other.numSeats && ssId == other.ssId && Objects.equals(ssName, other.ssName)
				&& Objects.equals(typeOfSpaceship, other.typeOfSpaceship);
	}
    
    

}
