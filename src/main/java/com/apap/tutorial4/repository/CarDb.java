package com.apap.tutorial4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apap.tutorial4.model.CarModel;

@Repository
public interface CarDb extends JpaRepository<CarModel, Long>{
	CarModel findByType(String type);
}
