package com.projects.entrega_final.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.projects.entrega_final.controller.dto.Usuariodto;
import com.projects.entrega_final.controller.form.Usuarioform;
import com.projects.entrega_final.modelo.Topico;
import com.projects.entrega_final.modelo.Usuario;
import com.projects.entrega_final.repository.UsuarioRepositorio;

@RestController
@CrossOrigin
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepositorio usuarioRepository;
	
	@GetMapping
	public List<Usuariodto> lista() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		return Usuariodto.converter(usuarios);
	}
	
	@PostMapping
	public ResponseEntity<Usuariodto> cadastrar(@RequestBody Usuarioform form, UriComponentsBuilder uriBuilder) {
		Usuario usuario = form.converter(usuarioRepository);
		usuarioRepository.save(usuario);
		
		URI uri = uriBuilder.path("/usuarios/{id}").buildAndExpand(usuario.getId()).toUri();
		return ResponseEntity.created(uri).body(new Usuariodto(usuario));
	}
}
