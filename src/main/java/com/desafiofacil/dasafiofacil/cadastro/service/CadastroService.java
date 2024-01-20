package com.desafiofacil.dasafiofacil.cadastro.service;

import com.desafiofacil.dasafiofacil.cadastro.application.api.CadastroNovoRequest;
import com.desafiofacil.dasafiofacil.cadastro.application.api.CadastroNovoResponse;

import java.util.Optional;

public interface CadastroService {
    CadastroNovoResponse criaNovoCadastro(CadastroNovoRequest cadastroNovo);

    Optional<Object> getPessoaByCpf(String cpf);
}
