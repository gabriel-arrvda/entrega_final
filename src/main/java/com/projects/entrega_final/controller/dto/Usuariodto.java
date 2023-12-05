package com.projects.entrega_final.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.projects.entrega_final.modelo.Usuario;

public class Usuariodto {
	
	private String matricula;
	private String nome;
	private String curso;
	private String email;
	private String senha;
	
	
	public Usuariodto(Usuario usuario) {
		super();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.senha = usuario.getSenha();
	}

	public String getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}
	
	public static List<Usuariodto> converter(List<Usuario> usuarios) {
		return usuarios.stream().map(Usuariodto::new).collect(Collectors.toList());
	}
	
}

