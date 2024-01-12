package com.desafiofacil.dasafiofacil.cadastro.application.api;

import com.desafiofacil.dasafiofacil.cadastro.domain.Endereco;
import com.desafiofacil.dasafiofacil.cadastro.domain.Pessoa;
import com.desafiofacil.dasafiofacil.cadastro.domain.Sexo;
import lombok.Value;

import java.time.LocalDate;
@Value
public class CadastroNovoResponse {
    private final String cpf;
    private final String nome;
    private final LocalDate dataNascimento;
    private final Endereco endereco;
    private final Sexo sexo;

    public CadastroNovoResponse(Pessoa pessoa) {
        this.cpf = pessoa.getCpf();
        this.nome = pessoa.getNome();
        this.dataNascimento = pessoa.getDataNascimento();
        this.endereco = pessoa.getEndereco();
        this.sexo = pessoa.getSexo();
    }
}
