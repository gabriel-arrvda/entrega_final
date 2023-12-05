package com.projects.entrega_final.controller.form;

import com.projects.entrega_final.modelo.Curso;
import com.projects.entrega_final.modelo.Topico;
import com.projects.entrega_final.modelo.Usuario;
import com.projects.entrega_final.repository.UsuarioRepositorio;

public class Usuarioform {
	
	private String nome;
    private String email;
	private String senha;
	
    public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Usuario converter(UsuarioRepositorio usuarioRepository) {
		
		return new Usuario(nome, email, senha);
	}
}
