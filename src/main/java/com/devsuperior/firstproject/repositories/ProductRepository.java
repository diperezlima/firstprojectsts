package com.devsuperior.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.firstproject.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
