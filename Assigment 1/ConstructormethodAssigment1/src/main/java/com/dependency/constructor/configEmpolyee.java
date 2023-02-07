package com.dependency.constructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configEmpolyee {
	@Bean
	public String empName() {
		 
		return "Sachin";
	}
	@Bean
	public int empId() {
		return 46194516;
				
	}
}
