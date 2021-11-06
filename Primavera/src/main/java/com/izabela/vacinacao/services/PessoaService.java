package com.izabela.vacinacao.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.izabela.vacinacao.model.Pessoa;
import com.izabela.vacinacao.repositories.PessoaRepository;

@Service
public class PessoaService {
	@Autowired
	private PessoaRepository repository;
	
	public List<Pessoa> findALL(){
        return repository.findAll();
    }
    public Pessoa findById(Long id) {
        Optional<Pessoa> obj = repository.findById(id);
        return obj.get();
    }
    public Pessoa insert(Pessoa pessoa) {
        return repository.save(pessoa);
    }

}
