package com.izabela.vacinacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.izabela.vacinacao.model.Imunizante;

public interface ImunizanteRepository extends JpaRepository<Imunizante, Long>{

}
