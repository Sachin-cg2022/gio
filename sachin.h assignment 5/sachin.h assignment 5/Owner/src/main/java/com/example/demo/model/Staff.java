package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Staff {
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	
	private int code;
	private String employeeName;
	private String employeeAddress;
	private double salary;
	private int age;
	private String occupation;
	private String emailID;
	public Staff() {
		super();
	}
	public Staff(int code, String employeeName, String employeeAddress, double salary, int age, String occupation,
			String emailID) {
		super();
		this.code = code;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.salary = salary;
		this.age = age;
		this.occupation = occupation;
		this.emailID = emailID;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	@Override
	public String toString() {
		return "Staff [code=" + code + ", employeeName=" + employeeName + ", employeeAddress=" + employeeAddress
				+ ", salary=" + salary + ", age=" + age + ", occupation=" + occupation + ", emailID=" + emailID + "]";
	}
	
	
	
}




