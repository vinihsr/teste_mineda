package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Disciplina;
import com.example.demo.repository.DisciplinaRepository;

@Service
public class DisciplinaService {
    

    @Autowired
    private DisciplinaRepository Disrepo;

    public List<Disciplina> buscDisciplinas() {
        return Disrepo.findAll();
    }

    public List<Disciplina> buscarDisciplinasPorCarga(Integer carga) {
        return Disrepo.buscarDisciplinasPorCarga(carga);
    }
}
