package com.ca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ca.entity.Tourist;

@Repository
public interface TouristRepository extends JpaRepository<Tourist, Long> {

	List<Tourist> findByOrderByFirstnameDesc();

}
