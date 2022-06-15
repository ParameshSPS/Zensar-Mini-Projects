package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.zensar.bean.Movie;

@Repository
public interface IMovieDAO extends JpaRepository<Movie, Integer> {

}