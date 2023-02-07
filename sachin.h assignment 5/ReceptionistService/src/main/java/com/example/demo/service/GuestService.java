package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Guest;
import com.example.demo.repository.GuestRepository;

@Service
public class GuestService {

	@Autowired
	private GuestRepository guestRepository;

	public List<Guest> allGuest() {
		
		return guestRepository.findAll();
	}

	public Guest addGuest(Guest guest) {
		
		return guestRepository.save(guest);
	}

	public Guest updateGuest(Guest guest, int memberCode) {
		return guestRepository.save(guest);
	}

	public String deleteGuest(int memberCode) {
		guestRepository.deleteById(memberCode);
		return "Delete Guest is Successfully";
	}
}
