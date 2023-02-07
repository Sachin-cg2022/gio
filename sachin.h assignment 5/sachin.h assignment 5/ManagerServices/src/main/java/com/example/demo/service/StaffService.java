package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Staff;
import com.example.demo.repository.StaffRepository;

@Service
public class StaffService {

	@Autowired
	StaffRepository staffRepository;

	public List<Staff> allStaff() {
		
		return staffRepository.findAll() ;
	}

	public Staff addStaff(Staff staff) {
		
		return staffRepository.save(staff) ;
	}

	public Staff updateStaff(Staff staff, int code) {
			return staffRepository.save(staff);
	}

	public String deleteStaff(int code) {
		staffRepository.deleteById(code);
				return "deletestaff is successfully" ;
	}
	
}
