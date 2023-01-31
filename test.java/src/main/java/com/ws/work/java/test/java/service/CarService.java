package com.ws.work.java.test.java.service;

import com.ws.work.java.test.java.domain.Car;
import com.ws.work.java.test.java.domain.dto.ListAllCarsDTO;
import com.ws.work.java.test.java.domain.mapper.ListAllCarsMapper;
import com.ws.work.java.test.java.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    private final ModelService modelService;

    private final ListAllCarsMapper carsMapper = new ListAllCarsMapper();

    public CarService(CarRepository carRepository, ModelService modelService) {
        this.carRepository = carRepository;
        this.modelService = modelService;
    }

    public Car save(Car car) {
        car.setTimestampRegistry(new Timestamp(System.currentTimeMillis()));
        if(car.getModel() != null)
            car.setModel(modelService.findById(car.getModel().getId()));

        return carRepository.save(car);
    }


    public List<ListAllCarsDTO> listAllCars() {
        var cars = carRepository.findAll();
        return carsMapper.carsToListAllCars(cars);
    }

    public Optional<Car> findById(Long id) {
        return carRepository.findById(id);
    }

    public void delete(Car car) {
        carRepository.delete(car);
    }

}
