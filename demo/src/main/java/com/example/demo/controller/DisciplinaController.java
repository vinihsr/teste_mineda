package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Disciplina;
import com.example.demo.services.DisciplinaService;


@RestController
@CrossOrigin
@RequestMapping(value = "/disciplina")
public class DisciplinaController {
    
    @Autowired
    public DisciplinaService serviceDisc;

    @GetMapping
    public List<Disciplina> buscarDisciplinas() {
        return serviceDisc.buscDisciplinas();
    }

    @GetMapping(value = "/{carga}")
    public List<Disciplina> getMethodName(@PathVariable Integer carga) {
        return serviceDisc.buscarDisciplinasPorCarga(carga);
    }
    
}
