package com.dependency.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
private int empId;
private String empName;
@Autowired
public Employee(int empId, String empName) {
	super();
	this.empId = empId;
	this.empName = empName;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}

}
