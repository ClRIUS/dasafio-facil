package com.desafiofacil.dasafiofacil.cadastro.infra;

import com.desafiofacil.dasafiofacil.cadastro.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaInfraRepository extends JpaRepository<Pessoa, String> {

}
