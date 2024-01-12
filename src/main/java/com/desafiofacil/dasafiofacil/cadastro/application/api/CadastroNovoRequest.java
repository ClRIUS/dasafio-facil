package com.desafiofacil.dasafiofacil.cadastro.application.api;

import com.desafiofacil.dasafiofacil.cadastro.domain.Endereco;
import com.desafiofacil.dasafiofacil.cadastro.domain.Sexo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class CadastroNovoRequest {
    @NotNull
    private String cpf;
    @NotBlank
    private String nome;
    private Sexo sexo;
    private Endereco endereco;
}
