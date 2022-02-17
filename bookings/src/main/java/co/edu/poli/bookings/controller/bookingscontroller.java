package co.edu.poli.bookings.controller;

import co.edu.poli.bookings.domain.bookings;
import co.edu.poli.bookings.service.bookingsservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")

@Validated
@RestController
@RequestMapping(value ="booking")

public class bookingscontroller {

    @Autowired
    private bookingsservice bookingservice;

    @PostMapping
    public bookings adicionarbookings(@RequestBody bookings booking) {

        return bookingservice.adicionarbookings(booking);
    }

    @GetMapping
    public List<bookings> obtenerbookings() {

        return bookingservice.obtenerbookings();

    }

    @GetMapping("/{id}")
    public bookings obtenerbookingsid(@PathVariable("id") Long id) {

       return bookingservice.obtenerbookingsid(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarbookings(@PathVariable("id") Long id) {

        bookingservice.eliminarbookings(id);
    }

    @GetMapping("/user/{userid}")
    public bookings obtenerbookingsuserid(@PathVariable("userid") Long userid) {

       return bookingservice.obtenerbookingsuserid(userid);
    }

}
