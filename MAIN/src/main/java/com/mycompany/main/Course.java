/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Course {
    private String id;
    private String name;
    private int fee;
    private String day;
    private String time;
    private ArrayList<Student> stuOfCourse = new ArrayList<>();

    public Course() {
    }

    public Course(String id, String name, int fee, String day, String time) {
        this.id = id;
        this.name = name;
        this.fee = fee;
        this.day = day;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Student> getStuOfCourse() {
        return stuOfCourse;
    }

    /*public void setStuOfCourse(ArrayList<Student> stuOfCourse) {
        this.stuOfCourse = stuOfCourse;
    }*/
    

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void addStudent(Student student) {
        stuOfCourse.add(student);
    }
}
