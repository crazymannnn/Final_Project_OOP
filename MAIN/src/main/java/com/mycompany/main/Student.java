/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tai-E758
 */
public class Student {

    static Scanner obj = new Scanner(System.in);

    private String id;
    private String name;
    private String gender;
    private String dateOfBirth;
    private String address;
    private String email;
    private String major;
    private ArrayList<Course> courseOfStu = new ArrayList<>();

    public Student() {

    }

    public static Scanner getObj() {
        return obj;
    }

    public static void setObj(Scanner obj) {
        Student.obj = obj;
    }
    
    public Student(String id, String name, String gender, String dateOfBirth, String address, String email, String major) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.email = email;
        this.major = major;
    }

    public ArrayList<Course> getCourseOfStu() {
        return courseOfStu;
    }

    /*public void setCourseOfStu(ArrayList<Course> courseOfStu) {
        this.courseOfStu = courseOfStu;
    }*/
    

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getMajor() {
        return major;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public void addCourse(Course course) {
        courseOfStu.add(course);
    }
}
