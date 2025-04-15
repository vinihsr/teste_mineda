package com.example.demo.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.entity.Livro;
import com.example.demo.repository.LivroRepository;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repoLivro;

    public List<Livro> buscLivros() {
        return repoLivro.findAll();
    }

    public Livro novo(Livro livro) {
        if (livro.getTitulo() == null || livro.getTitulo().isBlank()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "falta titulo");
        }

        if (livro.getLancamento() == null) {
            livro.setLancamento(Date.valueOf(LocalDate.now()));
        }
        

        if (livro.getEdicao() != null && livro.getEdicao() > 0 &&
            livro.getPaginas() != null && livro.getPaginas() > 50) {
            System.out.println("Livro com edição maior que zero e páginas maiores que 50.");
        }

        return repoLivro.save(livro);
    }


    public List<Livro> buscarPorTituloELancamento(String titulo, Date lancamento) {
        return repoLivro.buscarPorTituloELancamento(titulo, lancamento);
    }
}