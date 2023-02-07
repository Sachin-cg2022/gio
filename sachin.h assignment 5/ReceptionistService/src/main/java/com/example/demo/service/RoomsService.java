package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Rooms;
import com.example.demo.repository.RoomsRepository;

@Service
public class RoomsService {
 
	@Autowired
	RoomsRepository roomsRepository;

	public List<Rooms> allRooms() {
		return roomsRepository.findAll();
	}

	public Rooms addRooms(Rooms rooms) {
		return roomsRepository.save(rooms);
	}

	public Rooms updateRooms(Rooms rooms, int roomId) {
		return roomsRepository.save(rooms);
	}

	public String deleteRooms(int roomId) {
		roomsRepository.deleteById(roomId);
		return "deleterooms is successfully";
	}
}
