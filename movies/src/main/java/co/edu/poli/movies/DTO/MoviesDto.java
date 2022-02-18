package co.edu.poli.movies.DTO;

import lombok.Builder;
import lombok.Data;


@Data
@Builder(toBuilder = true)

public class MoviesDto {


    private Long id;
    private String title;
    private String director;
    private String raiting ;

}
