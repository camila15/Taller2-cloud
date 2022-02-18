package co.edu.poli.showtimes.service;


import co.edu.poli.showtimes.DTO.ShowtimeDto;
import co.edu.poli.showtimes.domain.Showtimes;
import co.edu.poli.showtimes.repository.Showtimesrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class Showtimesservice {

    @Autowired
    private Showtimesrepository showtimerepository;

    public Showtimesservice(Showtimesrepository showtimerepository) {
        this.showtimerepository = showtimerepository;
    }

    public Showtimes adicionarshowtimes(ShowtimeDto showtime)

    {
        return showtimerepository.save(buildShowtimes(showtime));
    }

    public List<Showtimes> obtenershowtimes()
    {
        return showtimerepository.findAll();
    }

    public Showtimes obtenershowtimesid(Long id)
    {
        return showtimerepository.findById(id).get();
    }

    public Showtimes buildShowtimes(ShowtimeDto showtimedto){

            return Showtimes.builder()
                    .id(showtimedto.getId())
                    .date(showtimedto.getDate())
                    .movies(showtimedto.getMovies()).build();

    }


}
