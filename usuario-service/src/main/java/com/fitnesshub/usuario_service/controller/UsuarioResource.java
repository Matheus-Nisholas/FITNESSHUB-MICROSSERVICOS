package com.fitnesshub.usuario_service.controller;

import com.fitnesshub.usuario_service.entity.Usuario;
import com.fitnesshub.usuario_service.repository.UsuarioRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

import java.util.List;

/**
 * Endpoint REST para operações com usuários.
 */
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
    public Response salvar(@Valid Usuario usuario) {
        usuarioRepository.persist(usuario);
        return Response.status(Status.CREATED).entity(usuario).build();
    }
}
