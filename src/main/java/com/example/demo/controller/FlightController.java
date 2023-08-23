package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FlightModel;
import com.example.demo.service.FlightService;

@RestController
public class FlightController {

	@Autowired
	FlightService fs;
	
	@PostMapping("add")
	public FlightModel addflight(@RequestBody FlightModel fm)
	{
		return fs.addinfo(fm);
	}
	
	@PostMapping("addall")
	public List<FlightModel> addFlights(@RequestBody List<FlightModel> fm)
	{
		return  (List<FlightModel>) fs.addninfo(fm);
	}
	
	@GetMapping("show")
	public List<FlightModel> displayFlights()
	{
		return fs.showinfo();
	}
	
	@GetMapping("show/{id}")
	public Optional<FlightModel> displayFlight(@PathVariable int id)
	{
		return fs.showid(id);
	}
	@DeleteMapping("deleteall")
	public String removeFlights()
	{
          fs.deleteinfo();
		return "ALl Flights are Successfully Deleted";
	}
	@PutMapping("update")
	public FlightModel modify(@RequestBody FlightModel fm)
	{
		return fs.changeinfo(fm);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteById(@PathVariable int id)
	{
		fs.deletepvid(id);
		return "Successfully deleted row with id:"+Integer.toString(id);
	}
	
	
}
