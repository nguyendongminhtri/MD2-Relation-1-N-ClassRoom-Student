package com.company.controller;

import com.company.model.Student;
import com.company.service.student.StudentServiceImpl;
import com.company.view.Main;

import java.io.IOException;
import java.util.List;

public class StudentController {
    StudentServiceImpl studentService = new StudentServiceImpl();
    public List<Student> showListStudent() throws IOException {
        return studentService.findAll();
    }
    public void createStudent(Student student) throws IOException {
        studentService.save(student);
        showListStudent();
    }
    public List<Student> getListStudentByClassRoomId(int id){
       return studentService.findByClassRoomId(id);
    }
}
