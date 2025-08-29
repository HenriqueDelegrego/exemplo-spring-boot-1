package com.delegrego.exemplo_spring_boot_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.delegrego.exemplo_spring_boot_1.model.Produto;
import com.delegrego.exemplo_spring_boot_1.service.ProdutoService;

//Define esta classe como um controller REST, ou seja, que responde a requisições HTTP com JSON
@RestController

//Permite requisições de outras origens
@CrossOrigin
public class ProdutoController {

	// Injeta automaticamente uma instância de ProdutoService
	@Autowired
	ProdutoService servico;

	// Create
	@PostMapping("/produtos")
	public void inserirProduto(@RequestBody Produto p) {
		servico.inserirProduto(p);
	}

	// Read
	@GetMapping("/produtos")
	public List<Produto> listarProdutos() {
		return servico.listarProdutos();
	}

	// Update
	@PutMapping("/produtos")
	public void atualizarProduto(@RequestBody Produto p) {
		servico.atualizarProduto(p);
	}

	// Delete
	@DeleteMapping("/produtos/{id}")
	public void deletarProduto(@PathVariable int id) {
		servico.deletarProduto(id);
	}
}
