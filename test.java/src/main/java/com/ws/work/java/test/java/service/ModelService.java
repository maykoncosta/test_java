package com.ws.work.java.test.java.service;

import com.ws.work.java.test.java.domain.Model;
import com.ws.work.java.test.java.repository.ModelRepository;
import com.ws.work.java.test.java.service.exceptions.ModelNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService {
    private final ModelRepository ModelRepository;

    public ModelService(ModelRepository ModelRepository) {
        this.ModelRepository = ModelRepository;
    }

    public Model save(Model Model) {
        return ModelRepository.save(Model);
    }

    public Model findById(Long id) {
        return ModelRepository.findById(id).orElseThrow(() -> new ModelNotFoundException(id));
    }

    public List<Model> findAll() {
        return ModelRepository.findAll();
    }

    public void deleteById(Long id) {
        ModelRepository.deleteById(id);
    }
}
