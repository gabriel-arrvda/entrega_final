package com.projects.entrega_final.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.entrega_final.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}