package com.co.Diaz.MicroserviciosUsuarios.Service;

import com.co.Diaz.MicroserviciosUsuarios.entity.Student;
import com.diaz.commons.service.CommonService;

import java.util.Optional;

public interface StudentService extends CommonService<Student> {

    public Student save(Student student);

    public void deleteById(Long id);
}
