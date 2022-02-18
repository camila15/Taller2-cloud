package co.edu.poli.bookings.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
@Table(name="Tablabookings")
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Booking {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private Long id;


    @NotNull
    private Long userid;


    @NotNull
    private Long showtimeid;


    private String [] movies;
}
