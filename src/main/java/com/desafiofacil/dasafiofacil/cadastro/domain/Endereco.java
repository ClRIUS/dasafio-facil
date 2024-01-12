package com.desafiofacil.dasafiofacil.cadastro.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
public class Endereco {
    private String logradouro;
    private String cep;
    private String numero;
    private String cidade;
}
