package com.tka.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tka.model.Product;
import com.tka.model.ProductOrder;
import com.tka.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	List<Product> products ;
	
	@Autowired
	OrderService orderService ;
	
	@GetMapping("/orders-page")
	public String showAllOrders(Model model) {
	    List<ProductOrder> orderList = orderService.getAllList(); // fetch all orders
	    Map<Integer, List<Product>> orderProductsMap = new HashMap<>();

	    for (ProductOrder order : orderList) {
	     //   List<Product> products = orderService.getProductsByOrderId(order.getOrderid());
	        orderProductsMap.put(order.getOrderid(), products);
	    }

	    model.addAttribute("orderList", orderList);
	    model.addAttribute("orderProductsMap", orderProductsMap);

	    return "orders"; // JSP name
	}

	
}
