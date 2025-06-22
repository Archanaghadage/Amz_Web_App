package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.ProductDao;
import com.tka.model.Product;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	ProductDao dao ;


	@Override
	public List<Product> getAllList() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return dao.save(product);
	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getTotalBill(List<Product> productCartList) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
