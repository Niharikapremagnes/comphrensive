package com.ca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ca.entity.Tourist;
import com.ca.repository.TouristRepository;

@Service
public class TouristServiceImpl implements TouristService {
	@Autowired
	private TouristRepository trepo;

	@Override
	public List<Tourist> getTourists() {
		return trepo.findByOrderByFirstnameDesc();
	}

	@Override
	public Tourist createTourist(Tourist tourist) {
		return trepo.save(tourist);
	}

}
