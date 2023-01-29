package com.ws.work.java.test.java.controller;

import java.util.List;
import java.util.Optional;

import com.ws.work.java.test.java.domain.Car;
import com.ws.work.java.test.java.domain.dto.ListAllCarsDTO;
import com.ws.work.java.test.java.service.CarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.
        NotBlank;

@RestController
@RequestMapping("/api/cars")
@Api(value = "Car Management System")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @ApiOperation(value = "Get all cars", notes = "Returns all cars")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved"),
            @ApiResponse(code = 404, message = "Not found - The list of cars was not found")
    })
    @GetMapping
    public ResponseEntity<List<ListAllCarsDTO>> listAllCars() {
        var carsList =  carService.listAllCars();
        return new ResponseEntity<>(carsList, HttpStatus.OK);
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
