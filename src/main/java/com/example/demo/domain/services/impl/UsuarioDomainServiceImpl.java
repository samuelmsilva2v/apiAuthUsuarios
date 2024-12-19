package com.example.demo.domain.services.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.models.dtos.AutenticarUsuarioRequestDto;
import com.example.demo.domain.models.dtos.CriarUsuarioRequestDto;
import com.example.demo.domain.models.entities.Usuario;
import com.example.demo.domain.services.interfaces.UsuarioDomainService;
import com.example.demo.infrastructure.components.JwtTokenComponent;
import com.example.demo.infrastructure.components.MessageProducerComponent;
import com.example.demo.infrastructure.helpers.CryptoHelper;
import com.example.demo.infrastructure.repositories.UsuarioRepository;

@Service
public class UsuarioDomainServiceImpl implements UsuarioDomainService {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Autowired
	JwtTokenComponent jwtTokenComponent;

	@Autowired
	MessageProducerComponent messageProducerComponent;

	@Override
	public String criarUsuario(CriarUsuarioRequestDto dto) {

		var usuario = new Usuario();

		usuario.setId(UUID.randomUUID());
		usuario.setNome(dto.getNome());
		usuario.setEmail(dto.getEmail());
		usuario.setSenha(CryptoHelper.SHA256Encrypt(dto.getSenha()));

		if (usuarioRepository.existsByEmail(usuario.getEmail())) {
			throw new IllegalArgumentException("O e-mail informado já está cadastrado, tente outro.");
		} else {
			usuarioRepository.save(usuario);
			
			try {
				messageProducerComponent.send(usuario);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			return "Usuário cadastrado com sucesso!";
		}

	}

	@Override
	public String autenticarUsuario(AutenticarUsuarioRequestDto dto) {

		var usuario = usuarioRepository.find(dto.getEmail(), CryptoHelper.SHA256Encrypt(dto.getSenha()));

		if (usuario != null) {
			return jwtTokenComponent.generateToken(usuario);
		} else {
			throw new IllegalArgumentException("Acesso negado. Cadastro não encontrado.");
		}

	}

}
