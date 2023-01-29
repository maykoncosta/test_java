package com.ws.work.java.test.java.repository;

import com.ws.work.java.test.java.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
