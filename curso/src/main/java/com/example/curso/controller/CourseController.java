package com.example.curso.controller;

import com.diaz.commons.controller.CommonController;
import com.example.curso.models.entity.Course;
import com.example.curso.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CourseController extends CommonController<Course, CourseService> {

    @PutMapping
    public ResponseEntity<?> edit(@RequestBody Course course, @PathVariable Long id) {
        Optional<Course> ob = service.findById(id);
        if (ob.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        Course Coursedb = ob.get();
        Coursedb.setName(course.getName());
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(Coursedb));
    }
}
