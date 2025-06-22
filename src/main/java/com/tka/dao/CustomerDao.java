package com.tka.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.model.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {
	// No need to define common CRUD methods — already available
}