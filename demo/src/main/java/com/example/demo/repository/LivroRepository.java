package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Livro;

import java.sql.Date;
import java.util.List;
import java.util.Optional;


public interface LivroRepository extends JpaRepository<Livro ,Long>  {
    
    @Query("SELECT l FROM Livro l WHERE LOWER(l.titulo) LIKE LOWER(concat('%',:titulo,'%')) AND l.lancamento > :lancamento")
    List<Livro> buscarPorTituloELancamento(
            @Param("titulo") String titulo,
            @Param("lancamento") Date lancamento);

    Optional<Livro> findByTituloAndEdicao(String titulo, Integer edicao);
}