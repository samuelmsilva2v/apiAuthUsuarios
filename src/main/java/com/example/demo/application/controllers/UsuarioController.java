package com.example.demo.application.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.models.dtos.AutenticarUsuarioRequestDto;
import com.example.demo.domain.models.dtos.CriarUsuarioRequestDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

	@PostMapping("criar")
	public String criar(@RequestBody @Valid CriarUsuarioRequestDto dto) {
		return "Usuário cadastrado com sucesso!";
	}
	
	@PostMapping("autenticar")
	public String autenticar(@RequestBody @Valid AutenticarUsuarioRequestDto dto) {
		return "Usuário autenticado com sucesso!";
	}
}
