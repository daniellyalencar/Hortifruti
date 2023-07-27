package com.spring.hortifruti.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.hortifruti.model.Fornecedor;
import com.spring.hortifruti.model.Produto;

@Repository
public interface FornecedorRepository extends CrudRepository<Fornecedor, Integer>{
	
	Fornecedor findById(int idFornecedor);

}
