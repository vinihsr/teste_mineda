package com.example.demo.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.entity.Trabalho;
import com.example.demo.repository.TrabalhoRepository;

@Service
public class TrabalhoService {

    @Autowired
    private TrabalhoRepository repo;

    public List<Trabalho> buscTrabalhos() {
        return repo.findAll();
    }

    public Trabalho novo(Trabalho trabalho) {
        if(trabalho.getTitulo() == null ||
            trabalho.getTitulo().isBlank() ||
            trabalho.getGrupo() == null ||
            trabalho.getGrupo().isBlank()){
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "falta titulo ou grupo");
        }
        if(trabalho.getDataHoraEntrega() == null) {
            trabalho.setDataHoraEntrega(LocalDateTime.now());
        }
        return repo.save(trabalho);
    }


    public List<Trabalho> buscarPorTituloENOta(String titulo, Integer nota) {
        return repo.buscarPorTituloENota(titulo, nota);
    }
}
