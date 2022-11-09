package com.ca.service;

import java.util.List;

import com.ca.entity.Tourist;

public interface TouristService {
	List<Tourist> getTourists();
	Tourist createTourist(Tourist tourist);
}
