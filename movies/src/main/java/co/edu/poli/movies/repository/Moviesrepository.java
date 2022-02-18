package co.edu.poli.movies.repository;


import co.edu.poli.movies.domain.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Moviesrepository extends JpaRepository<Movies,Long> {
}
