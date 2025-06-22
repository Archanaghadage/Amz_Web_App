package com.tka.service;

import java.util.List;

import com.tka.model.Customer;

public interface CustomerService {

	List<Customer> getAllList(); // abstract

	Customer getById(int id); // abstract

	Customer save(Customer customer); // abstract

	void delete(int id); // abstract

}
