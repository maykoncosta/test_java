package com.ws.work.java.test.java.domain.mapper;

import com.ws.work.java.test.java.domain.Car;
import com.ws.work.java.test.java.domain.dto.ListAllCarsDTO;

import java.util.List;
import java.util.stream.Collectors;

public class ListAllCarsMapper {
    public List<ListAllCarsDTO> carsToListAllCars(List<Car> cars){
        return cars.stream().map(car -> new ListAllCarsDTO(car.getId(),
                car.getModel().getBrand().getId(),
                car.getModel().getBrand().getNameBrand(),
                car.getModel().getName(),
                car.getYear(),
                car.getFuel(),
                car.getNumberDoors(),
                car.getModel().getFipeValue(),
                car.getColor(),
                car.getTimestampRegistry().toLocalDateTime()
                )).collect(Collectors.toList());
    }

}
