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
public class BookingRooms {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codes;
	private int numberOfChildren;
	private int numberOfAdults;
	private String check_in_date;
	private String check_out_date;
	private String status;
	private int NumberOfNights;
	private int guestMemberCode;
	private int bookingRoomId;
	
	public BookingRooms() {
		// TODO Auto-generated constructor stub
	}

	public BookingRooms(int codes, int numberOfChildren, int numberOfAdults, String check_in_date,
			String check_out_date, String status, int numberOfNights, int guestMemberCode, int bookingRoomId) {
		super();
		this.codes = codes;
		this.numberOfChildren = numberOfChildren;
		this.numberOfAdults = numberOfAdults;
		this.check_in_date = check_in_date;
		this.check_out_date = check_out_date;
		this.status = status;
		NumberOfNights = numberOfNights;
		this.guestMemberCode = guestMemberCode;
		this.bookingRoomId = bookingRoomId;
	}

	public int getCodes() {
		return codes;
	}

	public void setCodes(int codes) {
		this.codes = codes;
	}

	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	public int getNumberOfAdults() {
		return numberOfAdults;
	}

	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	public String getCheck_in_date() {
		return check_in_date;
	}

	public void setCheck_in_date(String check_in_date) {
		this.check_in_date = check_in_date;
	}

	public String getCheck_out_date() {
		return check_out_date;
	}

	public void setCheck_out_date(String check_out_date) {
		this.check_out_date = check_out_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getNumberOfNights() {
		return NumberOfNights;
	}

	public void setNumberOfNights(int numberOfNights) {
		NumberOfNights = numberOfNights;
	}

	public int getGuestMemberCode() {
		return guestMemberCode;
	}

	public void setGuestMemberCode(int guestMemberCode) {
		this.guestMemberCode = guestMemberCode;
	}

	public int getBookingRoomId() {
		return bookingRoomId;
	}

	public void setBookingRoomId(int bookingRoomId) {
		this.bookingRoomId = bookingRoomId;
	}

	@Override
	public String toString() {
		return "BookingRooms [codes=" + codes + ", numberOfChildren=" + numberOfChildren + ", numberOfAdults="
				+ numberOfAdults + ", check_in_date=" + check_in_date + ", check_out_date=" + check_out_date
				+ ", status=" + status + ", NumberOfNights=" + NumberOfNights + ", guestMemberCode=" + guestMemberCode
				+ ", bookingRoomId=" + bookingRoomId + "]";
	}
}
