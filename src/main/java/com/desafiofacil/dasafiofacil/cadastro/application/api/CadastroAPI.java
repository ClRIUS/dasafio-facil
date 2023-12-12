package com.desafiofacil.dasafiofacil.cadastro.application.api;

import jakarta.persistence.Id;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/cadastro")
public interface CadastroAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    void postNovoCadastro(@PathVariable Id cpf);

    @PatchMapping("/altera/{cpf}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void alteraCadastro(@PathVariable Id cpf);

    @GetMapping("/{cpf}")
    @ResponseStatus(code = HttpStatus.OK)
    void deletaCadastro(@PathVariable Id cpf);

    @DeleteMapping("/{cpf}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletaTarefa(@PathVariable Id cpf);

}
