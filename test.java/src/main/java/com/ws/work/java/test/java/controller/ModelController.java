package com.ws.work.java.test.java.controller;

import com.ws.work.java.test.java.domain.Model;
import com.ws.work.java.test.java.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/models")
public class ModelController {

    @Autowired 
    private final ModelService modelService;

    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    @PostMapping
    public ResponseEntity<Model> create(@RequestBody Model Model) {
        Model newModel = modelService.save(Model);
        return ResponseEntity.status(HttpStatus.CREATED).body(newModel);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Model> findById(@PathVariable Long id) {
        Model Model = modelService.findById(id);
        return ResponseEntity.ok(Model);
    }

    @GetMapping
    public ResponseEntity<List<Model>> findAll() {
        List<Model> Models = modelService.findAll();
        return ResponseEntity.ok(Models);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Model> update(@PathVariable Long id, @RequestBody Model Model) {
        Model updatedModel = modelService.save(Model);
        return ResponseEntity.ok(updatedModel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        modelService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
