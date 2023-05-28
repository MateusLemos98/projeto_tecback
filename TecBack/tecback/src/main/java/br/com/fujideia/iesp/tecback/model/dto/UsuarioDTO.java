package br.com.fujideia.iesp.tecback.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

    private int id;
    private String login;


    private Integer anoNascimento;

    private String nome;

}
