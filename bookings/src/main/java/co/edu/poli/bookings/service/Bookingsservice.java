package co.edu.poli.bookings.service;


import co.edu.poli.bookings.DTO.BookingDto;
import co.edu.poli.bookings.domain.Booking;
import co.edu.poli.bookings.repository.Bookingsrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Bookingsservice {

    @Autowired
    private Bookingsrepository bookingrepository;

    public Bookingsservice(Bookingsrepository bookingrepository) {
        this.bookingrepository = bookingrepository;
    }

    public Booking adicionarbookings(BookingDto booking)

    {
        return bookingrepository.save(buildBooking(booking));
    }

    public List<BookingDto> obtenerbookings()
    {
         List<Booking>  obeterbooking= bookingrepository.findAll();
         List<BookingDto> array= new ArrayList<>();




        for (int i=0; i<obeterbooking.size();i++){

            array.add(buildBookingDto(obeterbooking.get(i)));

        }

        return array;


    }

    public Booking obtenerbookingsid(Long id)
    {
        return bookingrepository.findById(id).get();
    }

    public Booking obtenerbookingsuserid(Long userid)
    {
        List<Booking> obteneruserid= bookingrepository.findAll();
        for (int i=0; i<obteneruserid.size();i++){

            if(obteneruserid.get(i).getUserid().equals(userid))
            {
                return obteneruserid.get(i);
            }

        }

        return Booking.builder().build();
    }


    public void eliminarbookings(Long id)
    {
        bookingrepository.deleteById(id);
    }

    public Booking buildBooking(BookingDto bookingdto){

        return Booking.builder()
                .id(bookingdto.getId())
                .userid(bookingdto.getUserid())
                .showtimeid(bookingdto.getShowtimeid())
                .movies(bookingdto.getMovies()).build();
    }

    public BookingDto buildBookingDto(Booking booking)
    {
        return BookingDto.builder()
                .id(booking.getId())
                .userid(booking.getUserid())
                .showtimeid(booking.getShowtimeid())
                .movies(booking.getMovies()).build();

    }
}
