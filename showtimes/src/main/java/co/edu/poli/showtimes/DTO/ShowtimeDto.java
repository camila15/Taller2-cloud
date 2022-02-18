package co.edu.poli.showtimes.DTO;


import lombok.Data;

import java.util.Date;

@Data

public class ShowtimeDto {

    private Long id;
    private Date date;
    private String [] movies;

}
