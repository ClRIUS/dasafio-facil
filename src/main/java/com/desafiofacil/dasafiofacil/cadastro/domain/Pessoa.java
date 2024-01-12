package com.desafiofacil.dasafiofacil.cadastro.domain;

import com.desafiofacil.dasafiofacil.cadastro.application.api.CadastroNovoRequest;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pessoa {
    @Id
    @CPF
    private String cpf;
    @NotBlank
    private String nome;
    private LocalDate dataNascimento;
    @Embedded
    private Endereco endereco;
    private Sexo sexo;

    private LocalDateTime dataHoraCadastro;
    private LocalDateTime dataHoraAlteracao;

    public Pessoa(CadastroNovoRequest cadastroNovoRequest) {
        this.cpf = cadastroNovoRequest.getCpf();
        this.nome = cadastroNovoRequest.getNome();
        this.sexo = cadastroNovoRequest.getSexo();
        this.endereco = cadastroNovoRequest.getEndereco();
        this.dataHoraCadastro = LocalDateTime.now();
    }
}
