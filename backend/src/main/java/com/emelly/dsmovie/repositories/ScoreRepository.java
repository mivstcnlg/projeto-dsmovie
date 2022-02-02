package com.emelly.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emelly.dsmovie.entities.Score;
import com.emelly.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
