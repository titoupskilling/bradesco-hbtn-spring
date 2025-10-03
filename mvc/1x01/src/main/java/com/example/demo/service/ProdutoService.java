package com.example.demo.service;


import com.example.demo.model.Produto;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Service
public class ProdutoService {
    private List<Produto> produtos = new ArrayList<>();
    private Long contadorId = 1L;


    public List<Produto> listarProdutos() {
        // implemente aqui
    }


    public Produto adicionarProduto(Produto produto) {
        // implemente aqui
    }


    public Produto atualizarProduto(Long id, Produto produtoAtualizado) {
        // implemente aqui
    }


    public boolean deletarProduto(Long id) {
        // implemente aqui
    }
}