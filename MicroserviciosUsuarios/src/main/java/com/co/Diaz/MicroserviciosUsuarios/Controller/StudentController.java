package com.co.Diaz.MicroserviciosUsuarios.Controller;

import com.co.Diaz.MicroserviciosUsuarios.Service.StudentService;
import com.diaz.common.user.MicroserviceCommonService.models.entity.Student;
import com.diaz.commons.controller.CommonController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class StudentController extends CommonController<Student, StudentService> {


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

    @Value("${config.balanaceador.test}")
    private String balanceador;

    @GetMapping("/balanceador-test")
    public ResponseEntity<?> balanceadorTest() {
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("balanceador", balanceador);
        response.put("students", service.findAll());

        return ResponseEntity.ok().body(response);
    }






}
