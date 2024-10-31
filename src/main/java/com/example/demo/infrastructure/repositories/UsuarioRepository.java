package com.example.demo.infrastructure.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.models.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID>{

	boolean existsByEmail(String email);
	
	@Query("FROM Usuario u WHERE u.email = :email AND u.senha = :senha")
	Usuario find(@Param("email") String email, @Param("senha") String senha);
}
