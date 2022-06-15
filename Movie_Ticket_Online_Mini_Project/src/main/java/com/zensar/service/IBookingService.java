package com.zensar.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.TicketBooking;
import com.zensar.db.IBookingDAO;

@Service
public class IBookingService {

	@Autowired
	IBookingDAO bookingdao;

	// ADD SERVICE
	public TicketBooking addBooking(TicketBooking booking) {
		return this.bookingdao.save(booking);
	}

	// UPDATE SERVICE
	public TicketBooking updateBooking(TicketBooking booking) {
		return this.bookingdao.saveAndFlush(booking);
	}

	// DELETE SERVICE
	@SuppressWarnings("deprecation")
	public TicketBooking cancelBooking(int ticketId) {
		TicketBooking b = bookingdao.getOne(ticketId);
		bookingdao.delete(b);
		return b;
	}

	// GET SERVICES
	public Optional<TicketBooking> showAllBooking(int movieId) {
		return this.bookingdao.findById(movieId);
	}

	public List<TicketBooking> showAllBookings(LocalDate date) {
		return null;
	}

	public List<TicketBooking> showBookingList() {
		List<TicketBooking> b = bookingdao.findAll();
		return b;
	}

	public Optional<TicketBooking> showBookingList(int showId) {
		return this.bookingdao.findById(showId);
	}

}