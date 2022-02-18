package co.edu.poli.bookings.controller;

import co.edu.poli.bookings.DTO.BookingDto;
import co.edu.poli.bookings.domain.Booking;
import co.edu.poli.bookings.service.Bookingsservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")

@Validated
@RestController
@RequestMapping(value ="booking")

public class Bookingscontroller {

    @Autowired
    private Bookingsservice bookingservice;

    @PostMapping
    public Booking adicionarbookings(@RequestBody BookingDto booking) {

        return bookingservice.adicionarbookings(booking);
    }

    @GetMapping
    public List<BookingDto> obtenerbookings() {

        return bookingservice.obtenerbookings();

    }

    @GetMapping("/{id}")
    public Booking obtenerbookingsid(@PathVariable("id") Long id) {

       return bookingservice.obtenerbookingsid(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarbookings(@PathVariable("id") Long id) {

        bookingservice.eliminarbookings(id);
    }

    @GetMapping("/user/{userid}")
    public Booking obtenerbookingsuserid(@PathVariable("userid") Long userid) {

       return bookingservice.obtenerbookingsuserid(userid);
    }

}
