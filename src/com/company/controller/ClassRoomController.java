package com.company.controller;

import com.company.model.ClassRoom;
import com.company.service.classroom.ClassRoomServiceImpl;

import java.io.IOException;
import java.util.List;

public class ClassRoomController {
    ClassRoomServiceImpl classRoomService = new ClassRoomServiceImpl();
    public List<ClassRoom> showListClassRoom() throws IOException {
        return classRoomService.findAll();
    }
    public void createClassRoom(ClassRoom classRoom) throws IOException {
        classRoomService.save(classRoom);
        showListClassRoom();
    }
    public ClassRoom detailClassRoom(int id){
       return classRoomService.findById(id);
    }

}
