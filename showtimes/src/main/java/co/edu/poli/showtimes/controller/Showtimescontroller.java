package co.edu.poli.showtimes.controller;

import co.edu.poli.showtimes.DTO.ShowtimeDto;
import co.edu.poli.showtimes.domain.Showtimes;
import co.edu.poli.showtimes.service.Showtimesservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")

@Validated
@RestController
@RequestMapping(value ="showtime")

public class Showtimescontroller {

    @Autowired
    private Showtimesservice showtimeservice;

    @PostMapping
    public Showtimes adicionarshowtimes(@RequestBody ShowtimeDto showtime) {

        return showtimeservice.adicionarshowtimes(showtime);
    }

    @GetMapping
    public List<ShowtimeDto> obtenershowtimes() {

        return showtimeservice.obtenershowtimes();
    }

    @GetMapping("/{id}")
    public Showtimes obtenershowtimesid(@PathVariable("id") Long id) {

        return showtimeservice.obtenershowtimesid(id);
    }

    @PutMapping ("/{id}")

    public void actualizarshowtimes(@RequestBody ShowtimeDto showtime)
    {
        showtimeservice.adicionarshowtimes(showtime);
    }



}

