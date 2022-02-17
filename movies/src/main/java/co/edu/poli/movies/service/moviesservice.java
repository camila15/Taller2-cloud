package co.edu.poli.movies.service;

import co.edu.poli.movies.domain.movies;
import co.edu.poli.movies.repository.moviesrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class moviesservice {

    @Autowired
    private moviesrepository movierepository;

    public moviesservice (moviesrepository  movierepository) {
        this.movierepository = movierepository;
    }

    public movies adicionarmovies(movies movie)

    {
        return movierepository.save(movie);
    }

    public List<movies> obtenermovies()
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
}

