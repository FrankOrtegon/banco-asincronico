package com.banco.asincronico.auth.service;

import com.banco.asincronico.auth.adapter.UsuarioAdapter;
import com.banco.asincronico.auth.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioAdapter usuarioAdapter;

    public UsuarioService(UsuarioAdapter usuarioAdapter) {
        this.usuarioAdapter = usuarioAdapter;
    }

    public Usuario crear(Usuario usuario) {
        return usuarioAdapter.guardar(usuario);
    }
}
