package com.ws.work.java.test.java.service;

import com.ws.work.java.test.java.domain.Brand;
import com.ws.work.java.test.java.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BrandService {
    @Autowired
    private BrandRepository brandRepository;

    public List<Brand> findAll() {
        return brandRepository.findAll();
    }

    public Optional<Brand> findById(Long id) {
        return brandRepository.findById(id);
    }

    public Brand save(Brand marca) {
        return brandRepository.save(marca);
    }

    public void deleteById(Long id) {
        brandRepository.deleteById(id);
    }
}
