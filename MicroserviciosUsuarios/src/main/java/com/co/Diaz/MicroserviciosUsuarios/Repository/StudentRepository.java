package com.co.Diaz.MicroserviciosUsuarios.Repository;

import com.co.Diaz.MicroserviciosUsuarios.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository<Student, Long> {



}
