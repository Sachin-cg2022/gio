package com.cg.employeeproducer.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.employeeproducer.bean.Employee;

@RestController
public class EmployeeController
{
  @GetMapping(value = "/getEmployee")
  public List<Employee> getEmployeeList() {
    List<Employee> employees=new ArrayList<>();
    Employee s1=new Employee(1,"sachin");
    Employee s2=new Employee(2,"sachin");
    Employee s3=new Employee(3,"sachin");
    employees.add(s1);
    employees.add(s2);
    employees.add(s3);
    return employees;
  }
}
