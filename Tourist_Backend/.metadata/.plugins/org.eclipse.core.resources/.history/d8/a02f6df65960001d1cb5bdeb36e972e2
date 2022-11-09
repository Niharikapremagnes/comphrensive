package com.ca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ca.entity.Tourist;
import com.ca.service.TouristServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/ca")
public class TouristController {
	
	@Autowired
	private TouristServiceImpl ts;
	
	
	@GetMapping("/tourists")
	public List<Tourist> getTourists() {
		return ts.getTourists();
	}
	
	 @PostMapping("/tourists")
	 public Tourist createTourist(@RequestBody Tourist tourist) {
	    	return ts.createTourist(tourist);
	  }
}
