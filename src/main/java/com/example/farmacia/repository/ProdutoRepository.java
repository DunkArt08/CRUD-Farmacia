package com.example.farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
