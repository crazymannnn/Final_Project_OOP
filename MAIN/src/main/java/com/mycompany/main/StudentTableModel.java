/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tai-E758
 */
public class StudentTableModel extends DefaultTableModel {

    public StudentTableModel() {
        this.addColumn("ID");
        this.addColumn("Name");
        this.addColumn("Major");
        this.addColumn("Email");
    }
}
