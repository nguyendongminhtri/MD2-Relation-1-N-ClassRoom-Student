package com.company.view;

import com.company.controller.ClassRoomController;
import com.company.controller.StudentController;
import com.company.file.Path;
import com.company.model.ClassRoom;
import com.company.model.Student;

import java.io.IOException;
import java.util.List;

public class StudentView {
    StudentController studentController = new StudentController();
    List<Student> studentList = studentController.showListStudent();
    ClassRoomController classRoomController = new ClassRoomController();
    public StudentView() throws IOException {
    }

    public void viewCreateStudent() throws IOException {
        while (true){
            int id;
            if(studentList.size()==0){
                id =1;
            } else {
                id = studentList.get(studentList.size()-1).getId()+1;
            }
            System.out.println("Enter the name Student: ");
            String name = Path.scanner().nextLine();
            System.out.println("Enter the age Student: ");
            int age = Path.scanner().nextInt();
            System.out.println("Select ID of Class Room: ");
            int id_class_room = Path.scanner().nextInt();
            ClassRoom classRoom = classRoomController.detailClassRoom(id_class_room);
            Student student = new Student(id, name,age,classRoom);
            studentController.createStudent(student);
            System.out.println("Enter any Key to continue create - Enter QUIT to back MENU: ");
            String back = Path.scanner().next();
            if(back.equalsIgnoreCase("quit")){
                new Main();
            }
        }
    }
    public void viewShowListStudent(){
        System.out.println("----Student List---");
        System.out.println(studentList);
    }
}
