package com.ws.work.java.test.java.controller;

import com.ws.work.java.test.java.domain.Brand;
import com.ws.work.java.test.java.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/brands")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping
    public List<Brand> findAll() {
        return brandService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Brand> findById(@PathVariable Long id) {
        return brandService.findById(id);
    }

    @PostMapping
    public Brand save(@RequestBody Brand Brand) {
        return brandService.save(Brand);
    }

    @PutMapping("/{id}")
    public Brand update(@PathVariable Long id, @RequestBody Brand Brand) {
        Brand.setId(id);
        return brandService.save(Brand);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        brandService.deleteById(id);
    }
}
