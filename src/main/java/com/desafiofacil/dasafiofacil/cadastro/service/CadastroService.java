package com.desafiofacil.dasafiofacil.cadastro.service;

import com.desafiofacil.dasafiofacil.cadastro.application.api.CadastroNovoRequest;
import com.desafiofacil.dasafiofacil.cadastro.application.api.CadastroNovoResponse;

public interface CadastroService {
    CadastroNovoResponse criaNovoCadastro(CadastroNovoRequest cadastroNovo);
}
