package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BookingModel;
import com.example.demo.repository.BookingRepo;

@Service
public class BookingService {

	@Autowired
	BookingRepo br;
	
	//AddBooking
	public BookingModel addbookinginfo(BookingModel bm)
	{
		return br.save(bm);
	}
	
	//displayBookings
	public List<BookingModel> showbookinginfo()
	{
		return br.findAll();
	}
	
	
}
