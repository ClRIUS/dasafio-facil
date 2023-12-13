package com.desafiofacil.dasafiofacil.cadastro.application.api;

import com.desafiofacil.dasafiofacil.cadastro.domain.Sexo;
import jakarta.persistence.Id;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;

@Value
public class CadastroNovoRequest {
    @Id
    @CPF
    private String cpf;
    private String nome;
    private Sexo sexo;
}
