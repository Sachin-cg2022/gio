package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Rooms {
    
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int roomId;
	private String floor;
	private String type;
	private String price;
	private String bookingStatus;
	
	public Rooms(){
		
	}
	public Rooms(int roomId, String floor, String type, String price, String bookingStatus) {
		super();
		this.roomId = roomId;
		this.floor = floor;
		this.type = type;
		this.price = price;
		this.bookingStatus = bookingStatus;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	@Override
	public String toString() {
		return "Rooms [roomId=" + roomId + ", floor=" + floor + ", type=" + type + ", price=" + price
				+ ", bookingStatus=" + bookingStatus + "]";
	}
	
		
}
