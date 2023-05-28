package br.com.fujideia.iesp.tecback.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_pagamento")
public class Pagamento {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "ds_cartao", length =500)
    private Integer cartao;
    private Integer numCartao;
    private Integer validade;
    private Integer cvc;
    private String titular;

    private Integer cartaoPrePago;
    private Integer parceiros;

}
