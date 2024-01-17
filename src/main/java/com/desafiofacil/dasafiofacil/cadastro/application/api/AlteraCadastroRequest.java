package com.desafiofacil.dasafiofacil.cadastro.application.api;

import com.desafiofacil.dasafiofacil.cadastro.domain.Endereco;
import com.desafiofacil.dasafiofacil.cadastro.domain.Sexo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AlteraCadastroRequest {
    @NotNull
    private String cpf;
    @NotBlank
    private String nome;
    private Sexo sexo;
    @Valid
    private Endereco endereco;
}
