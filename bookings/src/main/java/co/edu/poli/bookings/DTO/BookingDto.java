package co.edu.poli.bookings.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)

public class BookingDto {

    private Long id;
    private Long userid;
    private Long showtimeid;
    private String [] movies;
}
