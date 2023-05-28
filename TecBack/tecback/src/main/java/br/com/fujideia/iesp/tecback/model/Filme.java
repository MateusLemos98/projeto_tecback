package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "tb_filme")
public class Filme {

    @Id
    @GeneratedValue
    private Integer id;
    private String titulo;
    private LocalDate lancamento;
    private String duracao;
    private String indicacao;
    private Integer classificacao;


    @Column(name = "ds_sinopse", length = 500)
    private String sinopse;


}
