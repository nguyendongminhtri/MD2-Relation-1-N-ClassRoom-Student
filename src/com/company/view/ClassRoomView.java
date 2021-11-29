package com.company.view;

import com.company.controller.ClassRoomController;
import com.company.controller.StudentController;
import com.company.file.Path;
import com.company.model.ClassRoom;
import com.company.model.Student;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.io.IOException;
import java.util.List;

public class ClassRoomView {
    ClassRoomController classRoomController = new ClassRoomController();
    StudentController studentController = new StudentController();
    List<ClassRoom> classRoomList = classRoomController.showListClassRoom();
    public ClassRoomView() throws IOException {
    }
    public void viewShowListClassRoom() throws IOException {
        System.out.println(classRoomList);
        System.out.println("Enter QUIT to back MENU: ");
        String back = Path.scanner().nextLine();
        if(back.equalsIgnoreCase("quit")){
            new Main();
        }
    }
    public void createClassRoom() throws IOException {
        while (true){
            int id;
            if(classRoomList.size()==0){
                id =1;
            } else {
                id = classRoomList.get(classRoomList.size()-1).getId()+1;
            }
            System.out.println("Enter the name Class Room: ");
            String name = Path.scanner().nextLine();
            ClassRoom classRoom = new ClassRoom(id, name);
            classRoomController.createClassRoom(classRoom);
            System.out.println("Enter any Key to continue create - Enter QUIT to back MENU: ");
            String back = Path.scanner().next();
            if(back.equalsIgnoreCase("quit")){
                new Main();
            }
        }
    }
    public void detailClassRoom() throws IOException {
        while (true){
            System.out.println("Enter id Class Room: ");
            int id_class_room  = Path.scanner().nextInt();
            System.out.println("CLASS: "+classRoomController.detailClassRoom(id_class_room).getName());
            System.out.println("LIST STUDENT OF CLASS: "+studentController.getListStudentByClassRoomId(id_class_room));
            System.out.println("Enter any Key to continue create - Enter QUIT to back MENU: ");
            String back = Path.scanner().next();
            if(back.equalsIgnoreCase("quit")){
                new Main();
            }
        }
    }
}
