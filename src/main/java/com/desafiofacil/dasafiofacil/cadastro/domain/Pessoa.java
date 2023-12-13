package com.desafiofacil.dasafiofacil.cadastro.domain;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pessoa {
    @Id
    @CPF
    private String cpf;
    @NotBlank
    private String nome;
    @NotBlank
    private String altura;
    @NotNull
    private LocalDate dataNascimento;
    @NotBlank
    @Embedded
    private List<Endereco> endereco;
    private Sexo sexo;

    private LocalDateTime dataHoraCadastro;
    private LocalDateTime dataHoraAlteracao;

    public Pessoa(String cpf, String nome, String altura, @NotNull LocalDate dataNascimento,
                  List<Endereco> endereco, Sexo sexo) {
        this.cpf = cpf;
        this.nome = nome;
        this.altura = altura;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.sexo = sexo;
        this.dataHoraCadastro = LocalDateTime.now();
    }
}
