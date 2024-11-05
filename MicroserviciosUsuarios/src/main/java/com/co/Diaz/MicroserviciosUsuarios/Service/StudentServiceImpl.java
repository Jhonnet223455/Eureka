package com.co.Diaz.MicroserviciosUsuarios.Service;

import com.co.Diaz.MicroserviciosUsuarios.Repository.StudentRepository;
import com.co.Diaz.MicroserviciosUsuarios.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository dao;

    @Override
    @Transactional
    public Iterable<Student> findAll() {
        return dao.findAll();
    }

    @Override
    @Transactional
    public Optional<Student> findById(Long id) {
        return dao.findById(id);

    }

    @Override
    @Transactional
    public Student save(Student student) {
        return
                dao.save(student);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {

        dao.deleteById(id);
    }


}
