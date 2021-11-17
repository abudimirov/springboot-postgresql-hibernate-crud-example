package net.guides.springboot2.crud.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Имя - обязательное поле")
    private String name;

    @NotBlank(message = "Фамилия - обязательное поле")
    private String surname;

    private String middleName;
}
