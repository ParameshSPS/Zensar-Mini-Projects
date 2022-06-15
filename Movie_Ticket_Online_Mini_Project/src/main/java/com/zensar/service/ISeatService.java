package com.zensar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.Seat;
import com.zensar.db.ISeatDAO;

@Service
public class ISeatService {

	@Autowired
	ISeatDAO dao;

	// BOOKSEAT SERVICE
	public Seat bookSeat(Seat seat) {
		return this.dao.save(seat);
	}

	// CANCEL SEAT SERRVICE
	public boolean cancalSeatBooking(Seat seat) {
		this.dao.delete(seat);
		return true;
	}

	// BLOCK SEAT SERVICE
	public Seat blockSeat(Seat seat) {
		return this.dao.save(seat);
	}
}