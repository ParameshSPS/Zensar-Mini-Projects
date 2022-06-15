package com.zensar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.zensar.bean.Seat;
import com.zensar.service.ISeatService;

@RestController
public class ISeatController {

	@Autowired
	ISeatService service;

	// SEAT BOOKING
	@PostMapping(value = "/seatbooking/bookseat")
	public Seat f1(@RequestBody Seat seat) {
		return this.service.bookSeat(seat);
	}

	// CANCEL SEAT
	@DeleteMapping(value = "/seatbooking/cancelseatbooking")
	public boolean f2(@RequestBody Seat seat) {
		return this.service.cancalSeatBooking(seat);
	}

	// BLOCK SEAT
	@PutMapping(value = "/seatbooking/blockseat")
	public Seat f3(@RequestBody Seat seat) {
		return this.service.blockSeat(seat);
	}

}