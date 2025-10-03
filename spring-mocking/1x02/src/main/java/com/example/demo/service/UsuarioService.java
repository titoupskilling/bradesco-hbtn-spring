package com.example.demo.service;


import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;


@Service
public class UsuarioService {
    private final UsuarioRepository UsuarioRepository;


    @Autowired
    public UsuarioService(UsuarioRepository UsuarioRepository) {
        this.UsuarioRepository = UsuarioRepository;
    }


    public Usuario buscarUsuarioPorId(Long id) {
        return UsuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado"));
    }

    public Usuario salvarUsuario(Long id) {
        return UsuarioRepository.save(id)
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado"));
    }
}