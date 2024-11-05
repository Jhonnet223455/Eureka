package com.co.Diaz.MicroserviciosUsuarios.Controller;

import com.co.Diaz.MicroserviciosUsuarios.Service.StudentService;
import com.co.Diaz.MicroserviciosUsuarios.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/")
    public ResponseEntity<?> view(@PathVariable Long id) {
        Optional<Student> ob = service.findById(id);
        if (ob.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(ob.get());
    }

    @PostMapping
    public ResponseEntity<?> create(Student student) {
        Student studentdb = service.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(studentdb);
    }

    @PutMapping
    public ResponseEntity<?> edit(@RequestBody Student student, @PathVariable Long id) {
        Optional<Student> ob = service.findById(id);
        if (ob.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        Student studentdb = ob.get();
        studentdb.setName(student.getName());
        studentdb.setLastName(student.getLastName());
        studentdb.setEmail(student.getEmail());
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(studentdb));
    }


}
