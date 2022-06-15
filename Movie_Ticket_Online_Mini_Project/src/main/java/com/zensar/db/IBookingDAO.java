package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.zensar.bean.TicketBooking;

@Repository
public interface IBookingDAO extends JpaRepository<TicketBooking, Integer> {

}