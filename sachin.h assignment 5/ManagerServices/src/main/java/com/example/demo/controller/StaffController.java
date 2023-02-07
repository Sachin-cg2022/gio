package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Staff;
import com.example.demo.service.StaffService;

@RestController
@RequestMapping("/staffcontroller")
public class StaffController {
 
	@Autowired
     private StaffService staffService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/allstaff")
	public List<Staff> allStaff(){
		return staffService.allStaff();
	}
	@PostMapping("/addstaff")
	 public Staff addStaff(@RequestBody Staff staff) {
		return staffService.addStaff(staff);	 
	 }
	 
	@PutMapping("/updatestaff/{code}")
	public Staff updateStaff(@RequestBody Staff staff,@PathVariable int code) {
		return staffService.updateStaff(staff,code);	
	}
	
	@DeleteMapping("/deletestaff/{code}")
	public String deleteStaff(@PathVariable int code) {
		return staffService.deleteStaff(code);	
	}
	@GetMapping("/searchroom")
    public List<Object> getSearch(){
        Object[] objects=restTemplate.getForObject("http://ReceptionistService/roomscontroller/allrooms",Object[].class);
        return Arrays.asList(objects);
    }
}
