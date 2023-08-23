package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.BookingModel;

public interface BookingRepo extends JpaRepository<BookingModel, Integer>{

}
