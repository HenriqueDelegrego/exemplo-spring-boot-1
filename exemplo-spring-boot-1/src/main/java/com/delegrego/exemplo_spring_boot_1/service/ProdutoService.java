package com.delegrego.exemplo_spring_boot_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delegrego.exemplo_spring_boot_1.model.Produto;
import com.delegrego.exemplo_spring_boot_1.repo.ProdutoRepo;

//Indica que esta classe é um serviço do Spring (camada de lógica de negócio)
@Service
public class ProdutoService {
	
    // Injeta automaticamente a interface de repositório que acessa o banco de dados
	@Autowired
	ProdutoRepo repo;

	// Create
	public void inserirProduto(Produto p) {
		// Insere um produto no banco de dados
		repo.save(p);
	}

	// Read
	public List<Produto> listarProdutos() {
		// Lista todos os produtos
		return repo.findAll();
	}

	// Update
	public void atualizarProduto(Produto p) {
		// Atualiza um produto
		repo.save(p);
	}

	// Delete
	public void deletarProduto(int id) {
		// Deleta um produto a partir do id
		repo.deleteById(id);
	}

}
