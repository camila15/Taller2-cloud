package co.edu.poli.showtimes.controller;

import co.edu.poli.showtimes.domain.showtimes;
import co.edu.poli.showtimes.service.showtimesservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")

@Validated
@RestController
@RequestMapping(value ="showtime")

public class showtimescontroller {

    @Autowired
    private showtimesservice showtimeservice;

    @PostMapping
    public showtimes adicionarshowtimes(@RequestBody showtimes showtime) {

        return showtimeservice.adicionarshowtimes(showtime);
    }

    @GetMapping
    public List<showtimes> obtenershowtimes() {

        return showtimeservice.obtenershowtimes();

    }

    @GetMapping("/{id}")
    public void obtenershowtimesid(@PathVariable("id") Long id) {

        showtimeservice.obtenershowtimesid(id);
    }

    //falta el de actualizar



}
