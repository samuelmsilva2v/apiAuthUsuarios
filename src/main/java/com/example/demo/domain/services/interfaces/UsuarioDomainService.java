package com.example.demo.domain.services.interfaces;

import com.example.demo.domain.models.dtos.AutenticarUsuarioRequestDto;
import com.example.demo.domain.models.dtos.CriarUsuarioRequestDto;

public interface UsuarioDomainService {

	public String criarUsuario(CriarUsuarioRequestDto dto);
	
	public String autenticarUsuario(AutenticarUsuarioRequestDto dto);
}
