package com.example.demo.domain.models.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	private UUID id;
	
	@Column(name = "nome",  length = 150, nullable = false)
	private String nome;
	
	@Column(name = "email",  length = 50, nullable = false, unique = true)
	private String email;
	
	@Column(name = "senha",  length = 100, nullable = false)
	private String senha;
}
