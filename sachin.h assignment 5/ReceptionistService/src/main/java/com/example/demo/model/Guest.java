package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Guest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int memberCode;
	private long phoneNumber;
	private String company;
	private String name;
	private String email;
	private String gender;
	private String address;
	
	public Guest() {
		
	}

	public Guest(int memberCode, long phoneNumber, String company, String name, String email, String gender,
			String address) {
		super();
		this.memberCode = memberCode;
		this.phoneNumber = phoneNumber;
		this.company = company;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.address = address;
	}

	public int getMemberCode() {
		return memberCode;
	}

	public void setMemberCode(int memberCode) {
		this.memberCode = memberCode;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Guest [memberCode=" + memberCode + ", phoneNumber=" + phoneNumber + ", company=" + company + ", name="
				+ name + ", email=" + email + ", gender=" + gender + ", address=" + address + "]";
	}
	

}
