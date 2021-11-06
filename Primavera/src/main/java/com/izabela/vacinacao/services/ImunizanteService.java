package com.izabela.vacinacao.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.izabela.vacinacao.model.Imunizante;
import com.izabela.vacinacao.repositories.ImunizanteRepository;

@Service
public class ImunizanteService {
	@Autowired
	private ImunizanteRepository repository;
	
	public List<Imunizante> findALL(){
        return repository.findAll();
    }
    public Imunizante findById(Long id) {
        Optional<Imunizante> obj = repository.findById(id);
        return obj.get();
    }
    public Imunizante insert(Imunizante imunizante) {
        return repository.save(imunizante);
    }
}
