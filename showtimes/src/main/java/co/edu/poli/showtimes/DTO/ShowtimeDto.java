package co.edu.poli.showtimes.DTO;


import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder(toBuilder = true)

public class ShowtimeDto {

    private Long id;
    private Date date;
    private String [] movies;

}
