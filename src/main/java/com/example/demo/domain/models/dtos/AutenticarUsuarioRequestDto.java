package com.example.demo.domain.models.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AutenticarUsuarioRequestDto {

	@Email(message = "Por favor, informe um endereço de e-mail válido.")
	@NotBlank(message = "Por favor, informe o e-mail do usuário.")
	private String email;

	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", 
			message = "A senha deve ter no mínimo 8 caracteres, incluindo uma letra maiúscula, uma letra minúscula, um número e um caractere especial.")
	@NotBlank(message = "Por favor, informe a senha do usuário.")
	private String senha;
}
