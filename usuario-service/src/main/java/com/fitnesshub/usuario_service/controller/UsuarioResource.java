package com.fitnesshub.usuario_service.controller;

import com.fitnesshub.usuario_service.entity.Usuario;
import com.fitnesshub.usuario_service.repository.UsuarioRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/usuarios")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioResource {

    @Inject
    UsuarioRepository usuarioRepository;

    @GET
    public List<Usuario> listar() {
        return usuarioRepository.listAll();
    }

    @POST
    @Transactional
    public Usuario salvar(Usuario usuario) {
        usuarioRepository.persist(usuario);
        return usuario;
    }
}
