package com.fitnesshub.usuario_service.controller;

import com.fitnesshub.usuario_service.entity.Usuario;
import com.fitnesshub.usuario_service.service.UsuarioService;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

/**
 * Recurso REST para operações com usuários.
 */
@Path("/usuarios")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioResource {

    @Inject
    UsuarioService usuarioService;

    /**
     * Retorna a lista de todos os usuários.
     * @return lista de usuários
     */
    @GET
    public Response listarUsuarios() {
        List<Usuario> usuarios = usuarioService.listarTodos();
        return Response.ok(usuarios).build();
    }

    /**
     * Cadastra um novo usuário.
     * @param usuario dados do novo usuário
     * @return resposta HTTP
     */
    @POST
    public Response criarUsuario(@Valid Usuario usuario) {
        usuarioService.salvar(usuario);
        return Response.status(Response.Status.CREATED).build();
    }
}
