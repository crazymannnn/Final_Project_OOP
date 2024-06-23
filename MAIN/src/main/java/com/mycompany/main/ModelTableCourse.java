/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class ModelTableCourse extends DefaultTableModel {

    public ModelTableCourse() {
        this.addColumn("ID");
        this.addColumn("NAME");
        this.addColumn("FEE");
        this.addColumn("DAY");
        this.addColumn("TIME");
    }
    
}
