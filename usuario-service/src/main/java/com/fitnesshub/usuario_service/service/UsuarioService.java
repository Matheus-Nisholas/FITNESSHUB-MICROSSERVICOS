package com.fitnesshub.usuario_service.service;

import com.fitnesshub.usuario_service.entity.Usuario;
import com.fitnesshub.usuario_service.repository.UsuarioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;

/**
 * Camada de serviço responsável pela lógica de negócio da entidade Usuario.
 */
@ApplicationScoped
public class UsuarioService {

    @Inject
    UsuarioRepository usuarioRepository;

    /**
     * Retorna todos os usuários cadastrados.
     * @return lista de usuários
     */
    public List<Usuario> listarTodos() {
        return usuarioRepository.listAll();
    }

    /**
     * Cadastra um novo usuário no sistema.
     * @param usuario dados do novo usuário
     */
    public void salvar(Usuario usuario) {
        usuarioRepository.persist(usuario);
    }
}
