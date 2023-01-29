package com.ws.work.java.test.java.repository;

import com.ws.work.java.test.java.domain.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
