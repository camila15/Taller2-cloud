package co.edu.poli.bookings.service;


import co.edu.poli.bookings.domain.bookings;
import co.edu.poli.bookings.repository.bookingsrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class bookingsservice {

    @Autowired
    private bookingsrepository bookingrepository;

    public bookingsservice (bookingsrepository  bookingrepository) {
        this.bookingrepository = bookingrepository;
    }

    public bookings adicionarbookings(bookings booking)

    {
        return bookingrepository.save(booking);
    }

    public List<bookings> obtenerbookings()
    {
        return bookingrepository.findAll();
    }

    public void obtenerbookingsid(Long id)
    {
        bookingrepository.getById(id);
    }

    public void obtenerbookingsuserid(Long userid)
    {
        bookingrepository.getById(userid);
    }


    public void eliminarbookings(Long id)
    {
        bookingrepository.deleteById(id);
    }
}
