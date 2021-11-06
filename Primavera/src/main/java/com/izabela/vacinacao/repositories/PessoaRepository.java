package com.izabela.vacinacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.izabela.vacinacao.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}