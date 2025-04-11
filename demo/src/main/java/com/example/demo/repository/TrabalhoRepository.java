package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Trabalho;
import java.util.List;


public interface TrabalhoRepository extends JpaRepository<Trabalho ,Long>  {

    public List<Trabalho> findByTituloContainsAndNotaGreaterThan(String titulo, Integer nota);
    
    @Query("select t from Trabalho t where t.titulo like %?1% and t.nota > ?2")
    public List<Trabalho> buscarPorTituloENota(String titulo, Integer nota);

}