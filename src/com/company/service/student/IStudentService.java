package com.company.service.student;

import com.company.model.Student;
import com.company.service.IService;

import java.io.IOException;
import java.util.List;

public interface IStudentService extends IService<Student> {
    List<Student> findByClassRoomId(int id);
}
