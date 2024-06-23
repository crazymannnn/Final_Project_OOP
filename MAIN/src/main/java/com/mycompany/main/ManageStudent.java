/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Tai-E758
 */
public class ManageStudent {

    static Scanner obj = new Scanner(System.in);

    static ArrayList<Student> listStudent = new ArrayList<>();
    static HashMap<String, Student> studentMap = new HashMap<>();

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }
    
    public HashMap<String, Student> getStudentMap() {
        return studentMap;
    }

    public boolean addStudent(Student s1) {
        for (Student st : listStudent) {
            if (st.getId().equals(s1.getId())) {
                return false;
            }
        }
        listStudent.add(s1);
        studentMap.put(s1.getId(), s1);
        return true;
    }

    public void deleteStudent(String sID) {
        for (Student st : listStudent) {
            if (st.getId().equals(sID)) {
                listStudent.remove(st);
                break;
            }
        }
    }
    
    public ArrayList<Course> getListCourseOfStudent(Student student) {
        return student.getCourseOfStu();
    }

    public void sortByIDAscending() {
        listStudent.sort((s1, s2) -> {
            var compare = s1.getId().compareTo(s2.getId());
            return compare;
        });
    }

    public void sortByIDDescending() {
        listStudent.sort((s1, s2) -> {
            var compare = s2.getId().compareTo(s1.getId());
            return compare;
        });
    }

    public void sortbyNameAscending() {
        listStudent.sort((s1, s2) -> {
            String name1 = s1.getName().substring(s1.getName().lastIndexOf(" ") + 1);
            String name2 = s2.getName().substring(s2.getName().lastIndexOf(" ") + 1);
            var compare = name1.compareTo(name2);
            return compare;
        });
    }

    public void sortbyNameDescending() {
        listStudent.sort((s1, s2) -> {
            String name1 = s1.getName().substring(s1.getName().lastIndexOf(" ") + 1);
            String name2 = s2.getName().substring(s2.getName().lastIndexOf(" ") + 1);
            var compare = name2.compareTo(name1);
            return compare;
        });
    }
    
    public void WriteFileStudents() {
        try {
            FileOutputStream f = new FileOutputStream("C:\\java file\\students.save");
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            for (var s : listStudent) {
                oStream.writeObject(s);
            }
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error write file");
        }
    }
}
