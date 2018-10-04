package com.apap.tutorial4.service;
import java.util.Optional;

import com.apap.tutorial4.model.CarModel;

public interface CarService {
	void addCar(CarModel car);
	void deleteCar(Long carId);
	Optional<CarModel> getCarDetailById(Long id);
	void updateCar(Long carId, CarModel car);
}
