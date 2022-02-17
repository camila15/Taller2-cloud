package co.edu.poli.movies.repository;


import co.edu.poli.movies.domain.movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface moviesrepository extends JpaRepository<movies,Long> {
}
