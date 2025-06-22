package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.CustomerDao;
import com.tka.model.Customer;

@Service
public class CustomerServiceImp implements CustomerService{

	@Autowired
	CustomerDao dao;
	
	@Override
	public List<Customer> getAllList() {
		return dao.findAll();
	}

	@Override
	public Customer getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
