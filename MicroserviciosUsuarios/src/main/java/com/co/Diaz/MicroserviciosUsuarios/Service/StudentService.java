package com.co.Diaz.MicroserviciosUsuarios.Service;

import com.diaz.commons.service.CommonService;
import com.diaz.common.user.MicroserviceCommonService.models.entity.Student;

public interface StudentService extends CommonService<Student> {

    public Student save(Student student);
    public void deleteById(Long id);

}
