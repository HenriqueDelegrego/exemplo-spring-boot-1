package com.delegrego.exemplo_spring_boot_1.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Indica que esta classe é uma entidade JPA
@Entity

// Define o nome da tabela no banco de dados que esta entidade representa
@Table (name = "produto")
public class Produto {

    // Define o campo 'id' como a chave primária da tabela
	@Id
	
    // Mapeia o campo 'id' para a coluna 'id' no banco de dados
	@Column(name = "id")
	private int id;

	@Column(name = "nm_produto")
	private String nomeProduto;

	@Column(name = "preco")
	private double preco;

    // Construtor padrão (necessário para o JPA)
	public Produto() {

	}

	public Produto(int id, String nomeProduto, double preco) {
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
