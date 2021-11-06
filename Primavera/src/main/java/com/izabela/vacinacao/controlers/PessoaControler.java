package com.izabela.vacinacao.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.izabela.vacinacao.model.Pessoa;
import com.izabela.vacinacao.services.PessoaService;

@RestController
public class PessoaControler {
	@Autowired
	private PessoaService service;
	
	@GetMapping("/pessoa")
    public List<Pessoa> findAll(){
        return this.service.findALL();
    }

    @GetMapping("/pessoa/{id}")
    public Pessoa findById(@PathVariable("id") Long id) {
        return this.service.findById(id);
    }

    @PostMapping("/pessoa")
    public Pessoa save(@RequestBody Pessoa pessoa) {

        return this.service.insert(pessoa);
    }
}
