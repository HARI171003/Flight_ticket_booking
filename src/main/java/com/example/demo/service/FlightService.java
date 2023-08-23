package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FlightModel;
import com.example.demo.repository.FlightRepo;

@Service
public class FlightService {

	@Autowired
	FlightRepo fr;
	
	// AddoneFlight
	public FlightModel addinfo(FlightModel fm)
	{
		return fr.save(fm);
	}
	
	public List<FlightModel> addninfo(List<FlightModel> fm)
	{
		return  (List<FlightModel>)fr.saveAll(fm);
	}
	//DisplayAllFlight
	public List<FlightModel> showinfo()
	{
		return fr.findAll();	
	}
	
	//DisplayById
	public Optional<FlightModel> showid(int id)
	{
		return fr.findById(id);
	}
	
	//updateFlight
	public FlightModel changeinfo(FlightModel fm)
	{
//
		return fr.saveAndFlush(fm);
	}
	//DeleteAllFLight
	public void deleteinfo()
	{
		fr.deleteAll();
	}
	
	//deleteFlightbyid
	 
	public void deletepvid(int id)
	{
		fr.deleteById(id);
	}
}
