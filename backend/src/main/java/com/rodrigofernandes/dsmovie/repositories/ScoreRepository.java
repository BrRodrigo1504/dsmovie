package com.rodrigofernandes.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigofernandes.dsmovie.entities.Score;
import com.rodrigofernandes.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}