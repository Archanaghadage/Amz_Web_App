package com.tka.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class ProductOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int orderid;
	double totalBill;
	
	// ProductsList -- Mapping 

	public ProductOrder() {
		// TODO Auto-generated constructor stub
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}


	public double getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", totalBill=" + totalBill + "]";
	}

	 
}