package co.edu.poli.bookings.repository;


import co.edu.poli.bookings.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bookingsrepository extends JpaRepository<Booking,Long> {
}
