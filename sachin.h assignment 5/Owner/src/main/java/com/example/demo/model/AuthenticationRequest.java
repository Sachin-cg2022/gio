package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class AuthenticationRequest {
	@Id
	private String username;
	private String password;
	public AuthenticationRequest() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AuthenticationRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
}