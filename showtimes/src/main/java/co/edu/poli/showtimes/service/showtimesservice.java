package co.edu.poli.showtimes.service;


import co.edu.poli.showtimes.domain.showtimes;
import co.edu.poli.showtimes.repository.showtimesrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class showtimesservice {

    @Autowired
    private showtimesrepository showtimerepository;

    public showtimesservice (showtimesrepository  showtimerepository) {
        this.showtimerepository = showtimerepository;
    }

    public showtimes adicionarshowtimes(showtimes showtime)

    {
        return showtimerepository.save(showtime);
    }

    public List<showtimes> obtenershowtimes()
    {
        return showtimerepository.findAll();
    }

    public void obtenershowtimesid(Long id)
    {
        showtimerepository.getById(id);
    }

    public void actualizarshowtimes(Long id)
    {

    }
}
