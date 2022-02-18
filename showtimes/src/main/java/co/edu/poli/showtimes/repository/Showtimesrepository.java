package co.edu.poli.showtimes.repository;


import co.edu.poli.showtimes.domain.Showtimes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Showtimesrepository extends JpaRepository<Showtimes,Long> {

}
