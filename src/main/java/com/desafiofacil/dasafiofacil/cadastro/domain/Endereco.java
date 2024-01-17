package com.desafiofacil.dasafiofacil.cadastro.domain;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
public class Endereco {
    @NotBlank
    private String logradouro;
    private String cep;
    @NotBlank
    private String numero;
    @NotBlank
    private String cidade;
}
