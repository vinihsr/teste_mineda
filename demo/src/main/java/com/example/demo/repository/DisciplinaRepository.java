package com.example.demo.repository;

import com.example.demo.entity.Disciplina;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {

    @Query("select c from Disciplina c where c.cargaHoraria > :carga")
    public List<Disciplina> buscarDisciplinasPorCarga(@Param("carga") Integer carga);
}