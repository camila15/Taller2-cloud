package co.edu.poli.movies.service;

import co.edu.poli.movies.DTO.MoviesDto;
import co.edu.poli.movies.domain.Movies;
import co.edu.poli.movies.repository.Moviesrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class Moviesservice {

    @Autowired
    private Moviesrepository movierepository;

    public Moviesservice(Moviesrepository movierepository) {
        this.movierepository = movierepository;
    }

    public Movies adicionarmovies(MoviesDto movie)

    {
        return movierepository.save(buildMovie(movie));
    }

    public List<Movies> obtenermovies()
    {
        return movierepository.findAll();
    }

    public void obtenermoviesid(Long id)
    {
        movierepository.getById(id);
    }

    public void eliminarmovies(Long id)
    {
        movierepository.deleteById(id);
    }

    public Movies buildMovie(MoviesDto moviedto){

        return Movies.builder()
                .id(moviedto.getId())
                .title(moviedto.getTitle())
                .director(moviedto.getDirector())
                .raiting(moviedto.getRaiting()).build();
    }
}

