package com.tka.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tka.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
	// No need to define common CRUD methods — already available
}