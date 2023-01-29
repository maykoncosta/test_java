package com.ws.work.java.test.java.controller;

import java.util.List;
import java.util.Optional;

import com.ws.work.java.test.java.domain.Car;
import com.ws.work.java.test.java.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.
        NotBlank;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> findAll() {
        return carService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Car> findById(@PathVariable @NotBlank Long id) {
        return carService.findById(id);
    }

    @PostMapping
    public Car save(@RequestBody Car car) {
        return carService.save(car);
    }

    @PutMapping("/{id}")
    public Car update(@PathVariable @NotBlank Long id, @RequestBody Car car) {
        car.setId(id);
        return carService.save(car);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable @NotBlank Long id) {
        carService.findById(id)
                .ifPresent(carService::delete);
    }
}
