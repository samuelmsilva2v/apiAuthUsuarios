package com.example.demo.domain.models.dtos;

import lombok.Data;

@Data
public class CriarUsuarioRequestDto {

	private String nome;
	private String email;
	private String senha;
}
