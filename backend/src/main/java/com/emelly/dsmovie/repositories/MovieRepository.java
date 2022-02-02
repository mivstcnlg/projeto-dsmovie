package com.emelly.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emelly.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
