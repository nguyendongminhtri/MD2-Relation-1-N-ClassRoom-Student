package com.company.view;

import com.company.file.Path;

import java.io.IOException;

public class Main {
    public Main() throws IOException {
        System.out.println("1. CLASS ROOM MANAGE: ");
        System.out.println("2. STUDENT MANAGE: ");
        int chooseMenu = Path.scanner().nextInt();
        switch (chooseMenu){
            case 1:
                classRoomManage();
                break;
            case 2:
                studentManage();
                break;
        }
    }
    public void classRoomManage() throws IOException {
        ClassRoomView classRoomView = new ClassRoomView();
        System.out.println("1. Show List ClassRoom: ");
        System.out.println("2. Create ClassRoom: ");
        System.out.println("3. Detail ClassRoom: ");
        int chooseClassRoom = Path.scanner().nextInt();
        switch (chooseClassRoom){
            case 1:
                classRoomView.viewShowListClassRoom();
                break;
            case 2:
                classRoomView.createClassRoom();
                break;
            case 3:
                classRoomView.detailClassRoom();
                break;
        }
    }
    public void studentManage() throws IOException {
        StudentView studentView = new StudentView();
        System.out.println("1. Show List Student: ");
        System.out.println("2. Create Student: ");
        int chooseClassRoom = Path.scanner().nextInt();
        switch (chooseClassRoom){
            case 1:
                studentView.viewShowListStudent();
                break;
            case 2:
                studentView.viewCreateStudent();
                break;
        }
    }

    public static void main(String[] args) throws IOException {
	// write your code here
        new Main();
    }
}
