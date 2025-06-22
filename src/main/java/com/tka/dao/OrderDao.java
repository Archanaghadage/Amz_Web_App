package com.tka.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.model.ProductOrder;

public interface OrderDao extends JpaRepository<ProductOrder, Integer>  {

}
