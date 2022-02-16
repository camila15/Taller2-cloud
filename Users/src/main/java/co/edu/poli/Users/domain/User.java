package co.edu.poli.Users.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="Tablauser")
@Data

public class User {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private Long id;

    @NotNull(message = "El campo nombre no puede estar vacio")
    @NotEmpty
    private String name;

    @NotNull(message = "El campo apellido no puede estar vacio")
    @NotEmpty
    private String lastname;

}
