package net.guides.springboot2.crud.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "responsibilities")
public class Responsibility {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long deputyId;

    @NotBlank(message = "Необходимо добавить ссылку")
    private String link;

    private String description;
}
