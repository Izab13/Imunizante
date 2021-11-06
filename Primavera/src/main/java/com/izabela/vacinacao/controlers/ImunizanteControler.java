package com.izabela.vacinacao.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.izabela.vacinacao.model.Imunizante;
import com.izabela.vacinacao.services.ImunizanteService;

@RestController
public class ImunizanteControler {
	@Autowired
	private ImunizanteService service;
	
	@GetMapping("/imunizante")
    public List<Imunizante> findAll(){
        return this.service.findALL();
    }

    @GetMapping("/imunizante/{id}")
    public Imunizante findById(@PathVariable("id") Long id) {
        return this.service.findById(id);
    }

    @PostMapping("/imunizante")
    public Imunizante save(@RequestBody Imunizante imunizante) {

        return this.service.insert(imunizante);
    }
}
