package com.ws.work.java.test.java.repositorie;

import com.ws.work.java.test.java.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepositorie extends JpaRepository<Car, Long> {
}
