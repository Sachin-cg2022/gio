package com.dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionFieldApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DependencyInjectionFieldApplication.class, args);
		Student s=context.getBean(Student.class);
		s.details();
	}

}
