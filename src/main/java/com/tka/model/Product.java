package com.tka.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Product {

	@Id
	int pid;
	String name;
	String description;
	double price;
	String imgUrl;
	
	
	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}


	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(String name, String description, double price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
}
