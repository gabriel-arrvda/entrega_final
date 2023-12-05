package com.projects.entrega_final.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.entrega_final.modelo.Topico;
import java.util.List;


public interface TopicoRepository extends JpaRepository<Topico, Long> {
	List<Topico> findByCursoNome(String nomeCurso);
	

}
