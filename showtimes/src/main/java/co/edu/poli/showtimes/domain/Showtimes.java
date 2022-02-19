package co.edu.poli.showtimes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="Tablashowtimes")
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor

public class Showtimes {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private Long id;

    @NotNull(message = "El campo date no puede estar vacio")
    private Date date;

    private String [] movies;


}
