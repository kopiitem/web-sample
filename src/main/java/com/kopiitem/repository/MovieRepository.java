package com.kopiitem.repository;

import com.kopiitem.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by DonnyLies on 7/17/2016.
 */
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
