package com.delegrego.exemplo_spring_boot_1.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.delegrego.exemplo_spring_boot_1.model.Produto;


// O primeiro parâmetro é a entidade (Produto), o segundo é o tipo do ID (Integer)
public interface ProdutoRepo extends JpaRepository<Produto, Integer> {

}
