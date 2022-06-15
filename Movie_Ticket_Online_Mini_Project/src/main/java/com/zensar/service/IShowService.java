package com.zensar.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.Movie;
import com.zensar.bean.Show;
import com.zensar.db.IShowDAO;

@Service
public class IShowService {

	@Autowired
	IShowDAO showDao;

	// ADD SERVICE
	public Show addShow(Show show) {
		return this.showDao.save(show);
	}

	// UPDATE SERVICE
	public Show updateShow(Show show) {
		return this.showDao.save(show);
	}

	// DELETE SERVICE
	public boolean removeShow(Show show) {
		showDao.delete(show);
		return true;
	}

	// GET SERVICES
	public Show viewShow(int showId) {
		Optional<Show> optional = showDao.findById(showId);
		if (optional.isPresent())
			return optional.get();
		return null;
	}

	public List<Show> viewAllShow() {
		return this.showDao.findAll();
	}

	public List<Show> viewMovieList(int theatreId) {
		return null;
	}

	public List<Movie> viewMovieList(LocalDate date) {
		// return this.showDao.getAllBymovieDate(date);
		return null;
	}

}