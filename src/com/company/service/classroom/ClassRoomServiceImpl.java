package com.company.service.classroom;

import com.company.config.ConfigReadAndWriteFile;
import com.company.file.Path;
import com.company.model.ClassRoom;

import java.io.IOException;
import java.util.List;

public class ClassRoomServiceImpl implements IClassRoomService{
    public String PATH_CLASS_ROOM = Path.PATH+"class_room.txt";
    ConfigReadAndWriteFile<ClassRoom> configReadAndWriteFile = new ConfigReadAndWriteFile();
    List<ClassRoom> classRoomList = configReadAndWriteFile.readFromFile(PATH_CLASS_ROOM);
    @Override
    public List<ClassRoom> findAll() throws IOException {
        configReadAndWriteFile.writeToFile(PATH_CLASS_ROOM, classRoomList);
        return classRoomList;
    }

    @Override
    public void save(ClassRoom classRoom) {
        classRoomList.add(classRoom);
    }

    @Override
    public ClassRoom findById(int id) {
        for (int i = 0; i < classRoomList.size(); i++) {
            if(id == classRoomList.get(i).getId()){
                return classRoomList.get(i);
            }
        }
        return null;
    }
}
