package com.desafiofacil.dasafiofacil.cadastro.service;

import com.desafiofacil.dasafiofacil.cadastro.application.api.CadastroNovoRequest;
import com.desafiofacil.dasafiofacil.cadastro.application.api.CadastroNovoResponse;
import com.desafiofacil.dasafiofacil.cadastro.domain.Pessoa;
import com.desafiofacil.dasafiofacil.cadastro.repository.PessoaRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class CadastroApplicationService implements CadastroService{
    private final PessoaRepository pessoaRepository;

    @Override
    public CadastroNovoResponse criaNovoCadastro(CadastroNovoRequest cadastroNovo) {
        log.info("[inicia] CadastroApplicationService - criaNovoCadastro");
        var pessoa = pessoaRepository.salva(new Pessoa(cadastroNovo));
        log.info("[finaliza] CadastroApplicationService - criaNovoCadastro");
        return new CadastroNovoResponse(pessoa);
    }
}
