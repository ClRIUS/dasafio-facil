package com.desafiofacil.dasafiofacil.cadastro.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {
    private String logradouro;
    private String cep;
    private String numero;
    private String cidade;
}
