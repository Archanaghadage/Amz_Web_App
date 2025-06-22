package com.tka.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tka.model.Product;
import com.tka.model.ProductOrder;
import com.tka.service.OrderService;
import com.tka.service.ProductService;

@Controller
public class CartController {

	List<Product> productCartList;

	@Autowired
	ProductService productService;

	@Autowired
	OrderService orderService;

	@Autowired
	ProductOrder order;

	@PostMapping("/add-to-cart")
	public String addMultipleToCart(
			@RequestParam(value = "selectedProducts", required = false) List<Integer> productIds, Model model) {
		productCartList = new ArrayList<>();
		List<Product> productList = productService.getAllList(); // all products --> selectedids

		for (Product product : productList) { // N --all priducts X selected ids products [1,3 ...]
			// product --> list
			for (Integer selectedId : productIds) {
				if (product.getPid() == selectedId)
					productCartList.add(product);
			}
		}
		// productCartList --> order generate
		// Generate order --> save
		order.setTotalBill(productService.getTotalBill(productCartList));
		orderService.save(order);
		// Send to view
		model.addAttribute("order", order); // orderId , totalBill
		model.addAttribute("productCartList", productCartList);
		return "orders"; // JSP view
	}

}
