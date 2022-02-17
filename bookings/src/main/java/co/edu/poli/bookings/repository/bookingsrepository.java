package co.edu.poli.bookings.repository;


import co.edu.poli.bookings.domain.bookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bookingsrepository extends JpaRepository<bookings,Long> {
}
