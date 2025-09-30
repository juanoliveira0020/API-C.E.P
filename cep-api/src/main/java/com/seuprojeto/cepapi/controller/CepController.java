package com.seuprojeto.cepapi.controller;

import com.seuprojeto.cepapi.model.Endereco;
import com.seuprojeto.cepapi.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cep")
public class CepController {

    @Autowired
    private CepService cepService;

    @GetMapping("/{cep}")
    public Endereco getEndereco(@PathVariable String cep) {
        return cepService.buscarEnderecoPorCep(cep);
    }
}
