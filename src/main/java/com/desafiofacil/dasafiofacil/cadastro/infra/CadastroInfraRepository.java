package com.desafiofacil.dasafiofacil.cadastro.infra;

import com.desafiofacil.dasafiofacil.cadastro.domain.Pessoa;
import com.desafiofacil.dasafiofacil.cadastro.repository.PessoaRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class CadastroInfraRepository implements PessoaRepository {

    private final PessoaInfraRepository pessoaInfraJpaRepository;

    @Override
    public Pessoa salva(Pessoa pessoa) {
        Pessoa pessoaSalva = pessoaInfraJpaRepository.save(pessoa);
        return pessoaSalva;
    }
}
