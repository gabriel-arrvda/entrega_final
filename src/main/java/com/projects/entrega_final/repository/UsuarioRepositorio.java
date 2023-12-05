package com.projects.entrega_final.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.entrega_final.modelo.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
	
}
