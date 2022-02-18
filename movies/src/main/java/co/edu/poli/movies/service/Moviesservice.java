package co.edu.poli.movies.service;

import co.edu.poli.movies.DTO.MoviesDto;
import co.edu.poli.movies.domain.Movies;
import co.edu.poli.movies.repository.Moviesrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<MoviesDto> obtenermovies()
    {
        List<Movies>  obtenermovies= movierepository.findAll();
        List<MoviesDto> array= new ArrayList<>();




        for (int i=0; i<obtenermovies.size();i++){

            array.add(buildMoviesDto(obtenermovies.get(i)));

        }

        return array;

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



    public MoviesDto buildMoviesDto(Movies movies)
    {
        return MoviesDto.builder()
                .id(movies.getId())
                .title(movies.getTitle())
                .director(movies.getDirector())
                .raiting(movies.getRaiting()).build();

    }
}

