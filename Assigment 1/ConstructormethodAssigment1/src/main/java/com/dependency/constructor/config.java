package com.dependency.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
	@Autowired
	private Employee employee;
	@Bean
	public void test() {
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpId());
	}
}
