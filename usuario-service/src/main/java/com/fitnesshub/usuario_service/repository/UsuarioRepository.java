package com.fitnesshub.usuario_service.repository;

import com.fitnesshub.usuario_service.entity.Usuario;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * Repositório do usuário com operações base do Panache.
 */
@ApplicationScoped
public class UsuarioRepository implements PanacheRepository<Usuario> {
    // Métodos adicionais podem ser adicionados aqui
}
