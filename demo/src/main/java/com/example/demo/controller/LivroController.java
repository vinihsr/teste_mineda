package com.example.demo.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Livro;
import com.example.demo.services.LivroService;

@RestController
@CrossOrigin
@RequestMapping(value = "/livro")
public class LivroController {

    @Autowired
    public LivroService serviceLi;

    @GetMapping
    public List<Livro> buscarLivros() {
        return serviceLi.buscLivros();
    }

    @PostMapping
    public Livro novoLivro(@RequestBody Livro livro) {
        return serviceLi.novo(livro);
    }

    @GetMapping(value = "/{titulo}/{lancamento}")
    public List<Livro> buscarLivrosPorTituloELancamento(
            @PathVariable("titulo") String titulo,
            @PathVariable("lancamento") Date lancamento) {
        return serviceLi.buscarPorTituloELancamento(titulo, lancamento);
    }
}
