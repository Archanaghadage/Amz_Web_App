package com.tka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String homePage() {
		return "home" ;  
	}
	@GetMapping("/login-page")
	public String loginPage() {
		return "login" ;  
	}
	@GetMapping("/register-page")
	public String registerPage() {
		return "register" ;  
	}
	
	@GetMapping("/carts-page")
	public String cartsPage() {
		return "carts" ;  
	}
	 
	@GetMapping("/logout-page")
	public String logoutPage() {
		return "logout" ;  
	}
}
