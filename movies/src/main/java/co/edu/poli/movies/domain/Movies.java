package co.edu.poli.movies.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="Tablamovies")
@Data
@Builder(toBuilder = true)


public class Movies {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private Long id;

    @NotNull(message = "El campo titulo no puede estar vacio")
    @NotEmpty
    private String title;

    @NotNull(message = "El campo director no puede estar vacio")
    @NotEmpty
    private String director;

    @Size(min=1, max=5)
    @Column(unique = true, updatable = false)
    @NotEmpty(message = "El campo raiting no puede estar vacio")
    private String raiting ;
}
