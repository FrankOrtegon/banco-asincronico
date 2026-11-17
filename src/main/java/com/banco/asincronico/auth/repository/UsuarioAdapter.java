package com.banco.asincronico.auth.adapter;

import com.banco.asincronico.auth.model.Usuario;
import com.banco.asincronico.auth.repository.UsuarioRepository;
import org.springframework.stereotype.Component;

@Component
public class UsuarioAdapter {

    private final UsuarioRepository usuarioRepository;

    public UsuarioAdapter(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
