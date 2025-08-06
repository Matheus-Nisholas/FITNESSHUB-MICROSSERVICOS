package com.fitnesshub.usuario_service.repository;

import com.fitnesshub.usuario_service.entity.Usuario;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * Repositório da entidade Usuario com Panache.
 */
@ApplicationScoped
public class UsuarioRepository implements PanacheRepository<Usuario> {
}
