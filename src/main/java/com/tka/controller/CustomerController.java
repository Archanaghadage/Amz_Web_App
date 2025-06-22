package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tka.model.Customer;
import com.tka.model.Login;
import com.tka.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;

	String msg = "";

	@PostMapping("/verify-login")
	public String verifyLogin(@ModelAttribute Login login, Model model) {
		System.out.println("Login > " + login);
		List<Customer> customerList = customerService.getAllList();

		for (Customer customer : customerList) {
			System.out.println(customer.getName() + "--" + login.getUserId());
			System.out.println(customer.getPassword() + "--" + login.getPass());
			System.out.println("=============");
			if (customer.getName().equals(login.getUserId()) && customer.getPassword().equals(login.getPass())) {
				msg = login.getUserId() + "--> Login successful";
				break;
			} //
			else {
				msg = login.getUserId() + " --> Login failed -Plz sign Up";
			}
		}

		model.addAttribute("msg", msg);
		return "welcome";
	}

	@PostMapping("/register-customer")
	public String registerCustomer(@ModelAttribute Customer customer, Model model) {
		System.out.println("customer > " + customer);
		Customer saveCust = customerService.save(customer);

		if (saveCust != null) {
			msg = customer.getName() + "--> Register successful";
		} else {
			msg = customer.getName() + "--> Register failed";
		}

		model.addAttribute("msg", msg);
		return "welcome";

	}

}
