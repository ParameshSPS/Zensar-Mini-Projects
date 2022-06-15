package com.zensar.controller;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.zensar.bean.Movie;
import com.zensar.service.IMovieService;

@RestController
public class IMovieController {

	@Autowired
	IMovieService movieService;

	// ADD MOVIE
	@PostMapping(value = "/addMovie")
	public Movie add(@RequestBody Movie movie) {
		return this.movieService.addMovie(movie);
	}

	// UPDATE MOVIE
	@PutMapping(value = "/updateMovie")
	public Movie update(@RequestBody Movie movie) {
		return this.movieService.updateMovie(movie);
	}

	// DELETE MOVIE BY MOVIE ID
	@DeleteMapping(value = "/deleteMovie/{mid}")
	public boolean delete(@PathVariable(name = "mid") int movieid) {
		return this.movieService.removeMovie(movieid);
	}

	// GET MOVIE BY MOVIE ID
	@GetMapping(value = "/get/{mid}")
	public Movie read1(@PathVariable(name = "mid") int movieId) {
		return this.movieService.viewMovie(movieId);
	}

	// GET ALL MOVIES
	@GetMapping(value = "/getMovies")
	public List<Movie> read2() {
		return this.movieService.viewMovieList();
	}

	// GET MOVIE LIST BY THEATRE ID
	@GetMapping(value = "/getTheatre/{tid}")
	public List<Movie> read3(@PathVariable(name = "tid") int theatreid) {
		return this.movieService.viewMovieList(theatreid);
	}

	// GET MOVIE LIST BY DATE
	@GetMapping(value = "/getMoviesonDate/{d}")
	public List<Movie> read4(@PathVariable(name = "d") LocalDate date) {
		return this.movieService.viewMovieList(date);
	}

}