package com.co.Diaz.MicroserviciosUsuarios.Repository;

import com.diaz.common.user.MicroserviceCommonService.models.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
    // Métodos personalizados, si son necesarios
}
