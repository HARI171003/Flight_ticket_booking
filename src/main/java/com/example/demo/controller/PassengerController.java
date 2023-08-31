package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FlightModel;
import com.example.demo.model.PassengerModel;
import com.example.demo.service.PassengerService;

@RestController
public class PassengerController {

	@Autowired
	PassengerService ps;
	
	@GetMapping("showpassenger")
	public List<PassengerModel> getpassenger()
	{
		return ps.showpassenger();
	}
	
	@GetMapping("showpassengerqb/{id}")
	public List<PassengerModel> getbybooking(@PathVariable int id)
	{
		return ps.showbybooking(id);
		
	}
	
	@GetMapping("showpassengerqa/{id}")
	public List<PassengerModel> getbyage(@PathVariable int id)
	{
		return ps.showbyage(id);
		
	}
	
	@GetMapping("showpassengerqg/{name}")
	public List<PassengerModel> getbybooking(@PathVariable String name)
	{
		return ps.showbygender(name);
		
	}
	
	@GetMapping("showpassengerpage/{pgno}/{pgsize}")
	public List<PassengerModel> getbypage(@PathVariable int pgno,@PathVariable int pgsize)
	{
		return ps.showbypage(pgno, pgsize);
	}
	
	@GetMapping("showpassengerpage/{pgno}/{pgsize}/{name}")
	public List<PassengerModel> getbypagesoer(@PathVariable int pgno,@PathVariable int pgsize,@PathVariable String name)
	{
		return ps.showbypagesort(pgno, pgsize, name);
	}
	
	@GetMapping("showflightname/{id}")
	public FlightModel getflightname(@PathVariable int id)
	{
		return ps.getBookingid(id);
	}
	
}
