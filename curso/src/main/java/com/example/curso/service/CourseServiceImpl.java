package com.example.curso.service;

import com.diaz.common.user.MicroserviceCommonService.models.entity.Course;
import com.diaz.commons.service.StudentServiceImpl;

import com.example.curso.repository.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl extends StudentServiceImpl<Course, CourseRepository> implements CourseService {
}
