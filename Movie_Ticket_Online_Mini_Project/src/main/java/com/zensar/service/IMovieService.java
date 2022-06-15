package com.zensar.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.Movie;
import com.zensar.db.IMovieDAO;

@Service
public class IMovieService {
	@Autowired
	IMovieDAO movieDao;

	// ADD SERVICE
	public Movie addMovie(Movie movie) {
		return this.movieDao.save(movie);
	}

	// UPDATE SERVICE
	public Movie updateMovie(Movie movie) {
		return this.movieDao.save(movie);
	}

	// DELETE SEVICE
	public boolean removeMovie(int movieid) {
		movieDao.deleteById(movieid);
		return true;
	}

	// GET SERVICES
	public Movie viewMovie(int movieId) {
		Optional<Movie> optional = movieDao.findById(movieId);
		if (optional.isPresent())
			return optional.get();
		return null;
	}

	public List<Movie> viewMovieList() {
		return this.movieDao.findAll();
	}

	public List<Movie> viewMovieList(int theatreid) {
		return null;

	}

	public List<Movie> viewMovieList(LocalDate date) {
		return null;
	}

}