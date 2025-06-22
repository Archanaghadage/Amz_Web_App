package com.tka.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tka.model.Product;

public interface ProductService {

	List<Product> getAllList();
	
	Product getById(int id);
	
	Product save(Product product);
	
	void delete(int id);

	double getTotalBill(List<Product> productCartList);
}
