package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tka.model.Product;
import com.tka.service.OrderService;
import com.tka.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService ;

	@Autowired
	OrderService orderService ;
	
	@GetMapping("/products-page")
	public String productsPage(Model model) {
		List <Product>productList =  productService.getAllList();
		model.addAttribute("productList",productList);
		return "products" ;  //jsp 
	}
	
	@GetMapping("/shopping-products")
	public String shoppingProductsPage(Model model) {
		List <Product>productList =  productService.getAllList();
		model.addAttribute("productList",productList);
		return "shoppingProducts" ;  //jsp 
	}
}
