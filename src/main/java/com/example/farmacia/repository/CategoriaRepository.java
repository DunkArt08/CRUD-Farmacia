package com.example.farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.farmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long>{

	
}
