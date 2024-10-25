package com.example.demo.application.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

	@PostMapping("criar")
	public void criar() {
		// TODO
	}
	
	@PostMapping("autenticar")
	public void autenticar() {
		// TODO
	}
}
