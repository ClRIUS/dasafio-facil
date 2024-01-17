package com.desafiofacil.dasafiofacil.cadastro.application.api;

import com.desafiofacil.dasafiofacil.cadastro.service.CadastroService;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
public class CadastrosController implements CadastroAPI{
    private final CadastroService cadastroService;

    @Override
    public CadastroNovoResponse postNovoCadastro(CadastroNovoRequest cadastroNovoRequest) {
        log.info("[inicia] CadastrosController - postNovoCadastro");
        CadastroNovoResponse cadastroCriado = cadastroService.criaNovoCadastro(cadastroNovoRequest) ;
        log.info("[finaliza] CadastrosController - postNovoCadastro");
        return cadastroCriado;
    }

    @Override
    public void alteraCadastro(String cpf, AlteraCadastroRequest alteraCadastro) {

    }

    @Override
    public void buscaCadastro(Id cpf) {

    }

    @Override
    public void deletaCadastro(Id cpf) {

    }
}
