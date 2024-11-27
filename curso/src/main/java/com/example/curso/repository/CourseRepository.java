package com.example.curso.repository;

import com.diaz.common.user.MicroserviceCommonService.models.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
