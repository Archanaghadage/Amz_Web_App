package com.tka.model;

import org.springframework.stereotype.Component;

@Component
public class Login {
	private String userId;
	private String pass;

	public Login() {
		// TODO Auto-generated constructor stub
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Login [userId=" + userId + ", pass=" + pass + "]";
	}

}
