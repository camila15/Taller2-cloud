package co.edu.poli.bookings.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
@Table(name="Tablabookings")
@Data

public class bookings {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private Long id;


    @NotNull
    private Long userid;


    @NotNull
    private Long showtimeid;


    private String [] movies;
}
