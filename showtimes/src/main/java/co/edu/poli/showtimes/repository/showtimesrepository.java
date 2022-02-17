package co.edu.poli.showtimes.repository;


import co.edu.poli.showtimes.domain.showtimes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface showtimesrepository  extends JpaRepository<showtimes,Long> {

}
