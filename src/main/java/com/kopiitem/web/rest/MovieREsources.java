package com.kopiitem.web.rest;

import com.kopiitem.domain.Movie;
import com.kopiitem.repository.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by DonnyLies on 7/17/2016.
 */

@RestController
@RequestMapping("/api")
public class MovieResources {

    private final Logger log = LoggerFactory.getLogger(MovieResources.class);

    @Autowired
    private MovieRepository movieRepository;


    @RequestMapping(value = "/movies",
            method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Movie> createMovie(@RequestBody Iterable<Movie> movie) throws URISyntaxException {
        log.debug("REST request to save User : {}", movie);
        return movieRepository.save(movie);
    }
}
