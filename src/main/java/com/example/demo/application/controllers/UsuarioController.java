package com.example.demo.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.models.dtos.AutenticarUsuarioRequestDto;
import com.example.demo.domain.models.dtos.CriarUsuarioRequestDto;
import com.example.demo.domain.services.interfaces.UsuarioDomainService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
	
	@Autowired
	UsuarioDomainService usuarioDomainService;

	@PostMapping("criar")
	public String criar(@RequestBody @Valid CriarUsuarioRequestDto dto) {
		return usuarioDomainService.criarUsuario(dto);
	}
	
	@PostMapping("autenticar")
	public String autenticar(@RequestBody @Valid AutenticarUsuarioRequestDto dto) {
		return usuarioDomainService.autenticarUsuario(dto);
	}
}
