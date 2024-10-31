package com.example.demo.infrastructure.components;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.example.demo.domain.models.entities.Usuario;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtTokenComponent {

	public String generateToken(Usuario usuario) {

		var dataAtual = new Date();

		return Jwts.builder().setSubject(usuario.getEmail()).setNotBefore(dataAtual)
				.setExpiration(new Date(dataAtual.getTime() + 900000))
				.signWith(SignatureAlgorithm.HS256, "51dee78e-9d64-4596-95c3-a242b67a8261").compact();
	}
}
