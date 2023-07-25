package com.spring.hortifruti.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.hortifruti.model.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

	Produto findById(int idProduto);
}
