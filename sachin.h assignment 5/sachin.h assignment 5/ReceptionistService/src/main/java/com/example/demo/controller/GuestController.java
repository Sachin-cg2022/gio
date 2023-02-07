package com.example.demo.controller;

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

import com.example.demo.model.Guest;
import com.example.demo.service.GuestService;

@RestController
@RequestMapping("/guest")
public class GuestController {

	@Autowired
	private GuestService guestService;
	
	@GetMapping("/allguests")
	public List<Guest> allGuest(){
		return guestService.allGuest();
		
	}
	
	@PostMapping("/addguest")
	public Guest addGuest(@RequestBody Guest guest) {
		return guestService.addGuest(guest);
		
	}
	
	@PutMapping("/updateguest/{memberCode}")
	public Guest updateGuest( @RequestBody Guest guest, @PathVariable int memberCode ) {
		return guestService.updateGuest(guest,memberCode);
		
	}
	
	@DeleteMapping("/deleteguest/{memberCode}")
	public String deleteGuest(@PathVariable int memberCode) {
		return guestService.deleteGuest(memberCode);
		
	}
	
	
}
