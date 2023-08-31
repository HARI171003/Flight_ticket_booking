package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//import com.example.demo.model.BookingModel;
import com.example.demo.model.FlightModel;
import com.example.demo.model.PassengerModel;

public interface PassengerRepo extends JpaRepository<PassengerModel, Long>{

	@Query(value="select * from passenger_details where fk_passenger_id=:s",nativeQuery = true)
	public List<PassengerModel> displaybybooking(@Param("s") int id);
	
	@Query(value="select * from passenger_details where gender=:s",nativeQuery = true)
	public List<PassengerModel> displaybygender(@Param("s") String name);
	
	@Query(value="select * from passenger_details where age>=:s",nativeQuery = true)
	public List<PassengerModel> displaybyage(@Param("s") int id);
	
	@Query(value = "SELECT * FROM flight_details f WHERE f.flight_id = (SELECT b.flight_id FROM booking_details b " +
                                 "WHERE b.booking_id = (SELECT fk_passenger_id FROM passenger_details " +
                                                       "WHERE passenger_id = :s))",
    nativeQuery = true)
public FlightModel displayFlightById(@Param("s") int id);
	
	@Query(value="select fk_passenger_id from passenger_details where passenger_id=:s",nativeQuery = true)
	public int getbookingid(@Param("s") int id);

	
}
