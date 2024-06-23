/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import static com.mycompany.main.ManageStudent.listStudent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ADMIN
 */
public class ManageCourse {
    static ArrayList<Course> courses = new ArrayList<>();
    static HashMap<String, Course> courseMap = new HashMap<>();
    public ManageCourse() {
    }
    
    public boolean addCourse(Course course) {
        for (var c : courses) {
            if (c.getId().equals(course.getId())) {
                return false;
            }
        }
        courses.add(course);
        courseMap.put(course.getId(), course);
        return true;
    }
    
    public HashMap<String, Course> getCourseMap() {
        return courseMap;
    }
    
    public void deleteCourse(String id) {
        for (int i  = 0; i < courses.size(); i++) {
            if (courses.get(i).getId().equals(id)) {
                courses.remove(courses.get(i));
                break;
            }
        }
    }

    public Course findCourseByName(String courseName) {
        for (Course c : courses) {
            if (c.getName().equals(courseName)) {
                return c;
            }
        }
        return null;
    }
    
    public ArrayList<Course> getListCourse() {
        return courses;
    }
    
    public ArrayList<Student> getListOfStudent(Course course) {
        return course.getStuOfCourse();
    }
    
    public void WriteFileCourses() {
        try {
            FileOutputStream f = new FileOutputStream("C:\\java file\\courses.save");
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            for (var c : courses) {
                oStream.writeObject(c);
            }
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error write file");
        }
    }
}
