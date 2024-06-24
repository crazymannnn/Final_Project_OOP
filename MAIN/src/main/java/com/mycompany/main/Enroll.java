/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author ADMIN
 */
public class Enroll {
    
    ManageCourse mCourse = new ManageCourse();
    ManageStudent mStudent = new ManageStudent();
    
    public Enroll() {
    }
    
    public ManageCourse getmCourse() {
        return mCourse;
    }
    
    public void setmCourse(ManageCourse mCourse) {
        this.mCourse = mCourse;
    }
    
    public ManageStudent getmStudent() {
        return mStudent;
    }
    
    public void setmStudent(ManageStudent mStudent) {
        this.mStudent = mStudent;
    }
    
    public boolean studentEnroll(Student student, Course course) {
        if (/*mStudent.getListStudent().contains(student) && */student.getCourseOfStu().size() > 0) {
            /*if (checkDay(student, course)) {
                student.addCourse(course);
                course.addStudent(student);
                return true;
            } else {
                if (checkTime(student, course)) {
                    student.addCourse(course);
                    course.addStudent(student);
                    return true;
                }
            }*/
            if (checkTime(student, course)) {
                student.addCourse(course);
                course.addStudent(student);
                return true;
            }
        } else {
            student.addCourse(course);
            course.addStudent(student);
            return true;
        }
        return false;
    }
    
    public boolean checkDay(Student student, Course course) {
        for (int i = 0; i < student.getCourseOfStu().size(); i++) {
            if (student.getCourseOfStu().get(i).getDay().equals(course.getDay())) {
                return false;
            }
        }
        return true;
    }
    
    public boolean checkTime(Student student, Course course) {
        if (!checkDay(student, course)) {
            for (int i = 0; i < student.getCourseOfStu().size(); i++) {
                if (student.getCourseOfStu().get(i).getTime().equals(course.getTime()) && student.getCourseOfStu().get(i).getDay().equals(course.getDay())) {
                    return false;
                }
            }
        }
        return true;
    }
}
