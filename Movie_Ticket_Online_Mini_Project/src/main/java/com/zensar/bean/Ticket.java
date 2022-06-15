package com.zensar.bean;

import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tickets")
public class Ticket {

	@Id
	private int ticketId;
	private int noOfSeats;
	@ElementCollection
	private List<Seat> seatNumber;
	@OneToOne
	@MapsId
	@JoinColumn(name = "bookingId")
	private TicketBooking bookingRef;
	private boolean ticketStatus;

	
	public Ticket() {
		super();
	}

	public Ticket(int ticketId, int noOfSeats, List<Seat> seatNumber, TicketBooking bookingRef, boolean ticketStatus) {
		super();
		this.ticketId = ticketId;
		this.noOfSeats = noOfSeats;
		this.seatNumber = seatNumber;
		this.bookingRef = bookingRef;
		this.ticketStatus = ticketStatus;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public List<Seat> getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(List<Seat> seatNumber) {
		this.seatNumber = seatNumber;
	}

	public TicketBooking getBookingRef() {
		return bookingRef;
	}

	public void setBookingRef(TicketBooking bookingRef) {
		this.bookingRef = bookingRef;
	}

	public boolean isTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", noOfSeats=" + noOfSeats + ", seatNumber=" + seatNumber
				+ ", bookingRef=" + bookingRef + ", ticketStatus=" + ticketStatus + "]";
	}

}