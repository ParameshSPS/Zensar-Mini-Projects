package com.zensar.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seats")
public class Seat {

	@Id
	private int seadId;
	private String seatNumber;
	private String type;
	private double price;

	
	public Seat() {
		super();
	}

	public Seat(int seadId, String seatNumber, String type, double price) {
		super();
		this.seadId = seadId;
		this.seatNumber = seatNumber;
		this.type = type;
		this.price = price;
	}

	public int getSeadId() {
		return seadId;
	}

	public void setSeadId(int seadId) {
		this.seadId = seadId;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Seat [seadId=" + seadId + ", seatNumber=" + seatNumber + ", type=" + type + ", price=" + price + "]";
	}

}