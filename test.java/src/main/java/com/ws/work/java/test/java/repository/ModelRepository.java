package com.ws.work.java.test.java.repository;

import com.ws.work.java.test.java.domain.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Long> {
}
