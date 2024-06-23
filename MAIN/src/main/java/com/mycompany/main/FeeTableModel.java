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
public class FeeTableModel extends DefaultTableModel {

    public FeeTableModel() {
        this.addColumn("Course ID");
        this.addColumn("Course Name");
        this.addColumn("Course Fee");
    }
    
}
