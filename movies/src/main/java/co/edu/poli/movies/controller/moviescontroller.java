package co.edu.poli.movies.controller;


import co.edu.poli.movies.domain.movies;
import co.edu.poli.movies.service.moviesservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")

@Validated
@RestController
@RequestMapping(value ="movie")

public class moviescontroller {

    @Autowired
    private moviesservice movieservice;

    @PostMapping
    public movies adicionarmovies(@RequestBody movies movie) {

        return movieservice.adicionarmovies(movie);
    }

    @GetMapping
    public List<movies> obtenermovies() {

        return movieservice.obtenermovies();

    }

    @GetMapping("/{id}")
    public void obtenermoviesid(@PathVariable("id") Long id) {

        movieservice.obtenermoviesid(id);
    }


    @DeleteMapping("/{id}")
    public void eliminarmovies(@PathVariable("id") Long id) {

        movieservice.eliminarmovies(id);
    }


}
