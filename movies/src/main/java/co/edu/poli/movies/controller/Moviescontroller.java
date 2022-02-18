package co.edu.poli.movies.controller;


import co.edu.poli.movies.DTO.MoviesDto;
import co.edu.poli.movies.domain.Movies;
import co.edu.poli.movies.service.Moviesservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")

@Validated
@RestController
@RequestMapping(value ="movie")

public class Moviescontroller {

    @Autowired
    private Moviesservice movieservice;

    @PostMapping
    public Movies adicionarmovies(@RequestBody MoviesDto movie) {

        return movieservice.adicionarmovies(movie);
    }

    @GetMapping
    public List<MoviesDto> obtenermovies() {

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
