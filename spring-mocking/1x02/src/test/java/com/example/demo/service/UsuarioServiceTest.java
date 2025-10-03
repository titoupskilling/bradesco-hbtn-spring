package com.example.demo.service;


import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.Optional;


import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class UsuarioServiceTest {


    @Mock
    private UsuarioRepository UsuarioRepository;


    @InjectMocks
    private UsuarioService UsuarioService;


    @Test
    void deveRetornarUsuarioQuandoIdExistir() {
      assertEquals(true, new Usuario());
    }


    @Test
    void deveLancarExcecaoQuandoUsuarioNaoExistir() {
      assertThrows(new Exception(), new com.example.demo.model.Usuario());
    }
}