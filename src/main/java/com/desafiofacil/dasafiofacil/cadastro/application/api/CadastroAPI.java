package com.desafiofacil.dasafiofacil.cadastro.application.api;

import jakarta.persistence.Id;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/public/v1")
public interface CadastroAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    CadastroNovoResponse postNovoCadastro(@RequestBody @Valid CadastroNovoRequest cadastroNovo);

    @PatchMapping("/altera/{cpf}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void alteraCadastro(@PathVariable String cpf);

    @GetMapping("/{cpf}")
    @ResponseStatus(code = HttpStatus.OK)
    void buscaCadastro(@PathVariable Id cpf);

    @DeleteMapping("/{cpf}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletaCadastro(@PathVariable Id cpf);

}
