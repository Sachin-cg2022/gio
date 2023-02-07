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

import com.example.demo.model.Rooms;
import com.example.demo.service.RoomsService;

@RestController
@RequestMapping("/roomscontroller")
public class RoomsController {
	
	@Autowired
	RoomsService roomsService;
	
	@GetMapping("/allrooms")
	public List<Rooms> allRooms(){
		return roomsService.allRooms();	
	}
	
	@PostMapping("/addrooms")
	public Rooms addRooms(@RequestBody Rooms rooms) {
		return roomsService.addRooms(rooms);	
	}
	
	@PutMapping("/updaterooms/{roomId}")
	public Rooms updateRooms(@RequestBody Rooms rooms,@PathVariable int roomId) {
		return roomsService.updateRooms(rooms,roomId);	
	}
	
	@DeleteMapping("/deleterooms/{roomId}")
	public String  deleteRooms(@PathVariable int roomId) {
		return roomsService.deleteRooms(roomId);
		
	}
	
}
