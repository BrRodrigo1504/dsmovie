package com.rodrigofernandes.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigofernandes.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
