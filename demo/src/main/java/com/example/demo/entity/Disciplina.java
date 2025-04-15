package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tra_disciplina")
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dis_id")
    private Long id;

    @Column(name = "dis_nome", nullable = false, unique = true)
    private String nome;

    @Column(name = "dis_carga_horaria", nullable = false)
    private Integer cargaHoraria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}