package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_favoritos")
public class Favoritos {
    @Id
    @GeneratedValue
    private String id;

    @ManyToOne
    private Usuario usuario;
}
