package com.diaz.commons.controller;

import com.diaz.commons.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CommonController<E, S extends CommonService<E>> {

    @Autowired
    protected S service;

    @Value("${config.balanaceador.test}")
    protected String balanceadorTest;

    @GetMapping("/balanceador-test")
    public ResponseEntity<?> balanceadorTest() {
        Map<String, Object> response = new HashMap<>();
        response.put("balanceador", balanceadorTest);
        response.put("alumno", service.findAll());
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/listar")
    public ResponseEntity<?> listarAlumno() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> ver(@PathVariable Long id) {
        Optional<E> ob = service.findById(id);
        if (ob.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Elemento no encontrado");
        }
        return ResponseEntity.ok().body(ob.get());
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody E entity) {
        E entityDb = service.save(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(entityDb);
    }
}
