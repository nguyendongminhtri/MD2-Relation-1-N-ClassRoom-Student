package com.company.service.student;

import com.company.config.ConfigReadAndWriteFile;
import com.company.file.Path;
import com.company.model.Student;
import com.company.service.student.IStudentService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements IStudentService {
    public String PATH_STUDENT = Path.PATH+"student.txt";
    ConfigReadAndWriteFile<Student> configReadAndWriteFile = new ConfigReadAndWriteFile();
    List<Student> studentList = configReadAndWriteFile.readFromFile(PATH_STUDENT);

    @Override
    public List<Student> findAll() throws IOException {
        configReadAndWriteFile.writeToFile(PATH_STUDENT, studentList);
        return studentList;
    }
    @Override
    public void save(Student student) {
        studentList.add(student);
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public List<Student> findByClassRoomId(int id) {
        List<Student> studentListByClassRoomID = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getClassRoom().getId()==id){
                studentListByClassRoomID.add(studentList.get(i));
            }
        }
        return studentListByClassRoomID;
    }
}
