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

    public bookings obtenerbookingsid(Long id)
    {
        return bookingrepository.findById(id).get();
    }

    public bookings obtenerbookingsuserid(Long userid)
    {
        List<bookings> obteneruserid= bookingrepository.findAll();
        for (int i=0; i<obteneruserid.size();i++){

            if(obteneruserid.get(i).getUserid().equals(userid))
            {
                return obteneruserid.get(i);
            }

        }

        return new bookings();
    }


    public void eliminarbookings(Long id)
    {
        bookingrepository.deleteById(id);
    }
}
