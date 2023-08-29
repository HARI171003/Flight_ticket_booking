package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BookingModel;
import com.example.demo.service.BookingService;

@RestController
public class BookingController {

	@Autowired
	BookingService bs;
	 @PostMapping("addbooking")
	 public BookingModel addBooking( @RequestBody BookingModel bm)
	 {
		 return bs.addbookinginfo(bm);
	 }
	 
	 @GetMapping("showbooking")
	 public List<BookingModel> displayBookings()
	 {
		 return bs.showbookinginfo();
	 }
}
