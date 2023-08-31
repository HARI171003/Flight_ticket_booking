package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.FlightModel;
import com.example.demo.model.PassengerModel;
import com.example.demo.repository.BookingRepo;
import com.example.demo.repository.FlightRepo;
import com.example.demo.repository.PassengerRepo;

@Service
public class PassengerService {

	
	@Autowired
	PassengerRepo pr;
	
	@Autowired
	BookingRepo brr;
	
	@Autowired
	FlightRepo frr;
	
	//showPassenger
	public  List<PassengerModel> showpassenger()
	{
		return pr.findAll();
	}
	
	//show passenger by bookingid
	public List<PassengerModel> showbybooking(int id)
	{
		return pr.displaybybooking(id);
	}
	
	//show passenger by age
		public List<PassengerModel> showbyage(int id)
		{
			return pr.displaybyage(id);
		}
		
	
	//show passenger by gender
		public List<PassengerModel> showbygender(String name)
		{
			return pr.displaybygender(name);
			}
	
	//pagination
		public List<PassengerModel> showbypage (int pgno,int pgsize)
		{
			Page<PassengerModel> p = pr.findAll(PageRequest.of(pgno, pgsize));
			return p.getContent();
		}
	
		//pagination and sorting
				public List<PassengerModel> showbypagesort (int pgno,int pgsize,String s)
				{
					Page<PassengerModel> p = pr.findAll(PageRequest.of(pgno, pgsize,Sort.by(Sort.Direction.ASC,s)));
					return p.getContent();
				}
				
			// display flight by passengerid
//				public FlightModel showflightName(int id)
//				{
//					return pr.displayFlightById(id);
//				}
//		
				//gey bookingid
				public  FlightModel getBookingid(int id)
				{
				    int x= pr.getbookingid(id);
//				    return x;
				    int y= brr.getFlightid(x);
//				    return y;
				    FlightModel z=frr.getdetails(y);
					return z;
				    
					
				}
				
}
