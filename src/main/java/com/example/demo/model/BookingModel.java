package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BookingDetails")
public class BookingModel {

	@Id
	private int bookingId;
	private int flightId;
	private String fromCity;
	private String toCity;
	private String customerName;
	private String paymentStatus;
	private String bookingDate;
	private String travelDate;
	private long contactNumber;
	private int totalAmount;
	public BookingModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookingModel(int bookingId, int flightId, String fromCity, String toCity, String customerName,
			String paymentStatus, String bookingDate, String travelDate, long contactNumber, int totalAmount) {
		super();
		this.bookingId = bookingId;
		this.flightId = flightId;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.customerName = customerName;
		this.paymentStatus = paymentStatus;
		this.bookingDate = bookingDate;
		this.travelDate = travelDate;
		this.contactNumber = contactNumber;
		this.totalAmount = totalAmount;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFromCity() {
		return fromCity;
	}
	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}
	public String getToCity() {
		return toCity;
	}
	public void setToCity(String toCity) {
		this.toCity = toCity;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
}
