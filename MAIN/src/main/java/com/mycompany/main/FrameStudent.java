/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Tai-E758
 */
public class FrameStudent extends javax.swing.JFrame {

    private ManageStudent stManager = new ManageStudent();
    private StudentTableModel stModel = new StudentTableModel();
    private StudentInfo info = new StudentInfo();
    private FeeInfo fee = new FeeInfo();

    /**
     * Creates new form FrameStudent
     */
    public FrameStudent() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SortComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        month = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        major = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnSeeProfile = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Windows 7 Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search");
        jLabel2.setPreferredSize(new java.awt.Dimension(75, 25));
        jPanel1.add(jLabel2);

        search.setPreferredSize(new java.awt.Dimension(250, 25));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        jPanel1.add(search);

        jLabel1.setFont(new java.awt.Font("Windows 7 Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sort");
        jLabel1.setPreferredSize(new java.awt.Dimension(75, 25));
        jPanel1.add(jLabel1);

        SortComboBox.setFont(new java.awt.Font("Windows 7 Segoe UI", 0, 14)); // NOI18N
        SortComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending ID", "Descending ID", "Ascending Name", "Descending Name" }));
        SortComboBox.setPreferredSize(new java.awt.Dimension(150, 25));
        SortComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(SortComboBox);

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Major", "Email"
            }
        ));
        jScrollPane1.setViewportView(studentTable);

        jLabel3.setFont(new java.awt.Font("Windows 7 Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Student ID");
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel3.add(jLabel3);

        id.setPreferredSize(new java.awt.Dimension(175, 25));
        jPanel3.add(id);

        jLabel4.setFont(new java.awt.Font("Windows 7 Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Student Name");
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel4.add(jLabel4);

        name.setPreferredSize(new java.awt.Dimension(175, 25));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel4.add(name);

        jLabel5.setFont(new java.awt.Font("Windows 7 Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Gender");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel5.add(jLabel5);

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Windows 7 Segoe UI", 0, 14)); // NOI18N
        male.setText("Male");
        male.setPreferredSize(new java.awt.Dimension(80, 25));
        jPanel5.add(male);

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Windows 7 Segoe UI", 0, 14)); // NOI18N
        female.setText("Female");
        female.setPreferredSize(new java.awt.Dimension(80, 25));
        jPanel5.add(female);

        jLabel6.setFont(new java.awt.Font("Windows 7 Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Date of Birth");
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel6.add(jLabel6);

        day.setPreferredSize(new java.awt.Dimension(50, 25));
        jPanel6.add(day);

        month.setPreferredSize(new java.awt.Dimension(50, 25));
        jPanel6.add(month);

        year.setPreferredSize(new java.awt.Dimension(65, 25));
        jPanel6.add(year);

        jLabel7.setFont(new java.awt.Font("Windows 7 Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Address");
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel7.add(jLabel7);

        address.setPreferredSize(new java.awt.Dimension(175, 25));
        jPanel7.add(address);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Email");
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel8.add(jLabel8);

        email.setPreferredSize(new java.awt.Dimension(175, 25));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel8.add(email);

        jLabel9.setFont(new java.awt.Font("Windows 7 Segoe UI", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Major");
        jLabel9.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel9.add(jLabel9);

        major.setPreferredSize(new java.awt.Dimension(175, 25));
        jPanel9.add(major);

        btnAdd.setBackground(new java.awt.Color(0, 197, 255));
        btnAdd.setFont(new java.awt.Font("Windows 7 Segoe UI", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.setPreferredSize(new java.awt.Dimension(100, 25));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel11.add(btnAdd);

        btnUpdate.setBackground(new java.awt.Color(0, 128, 0));
        btnUpdate.setFont(new java.awt.Font("Windows 7 Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setPreferredSize(new java.awt.Dimension(100, 25));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel11.add(btnUpdate);

        btnClear.setBackground(new java.awt.Color(192, 192, 192));
        btnClear.setFont(new java.awt.Font("Windows 7 Segoe UI", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.setPreferredSize(new java.awt.Dimension(100, 25));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel11.add(btnClear);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(206, 0, 0));
        jLabel10.setText("Student Management");
        jPanel12.add(jLabel10);

        btnDelete.setBackground(new java.awt.Color(206, 0, 0));
        btnDelete.setFont(new java.awt.Font("Windows 7 Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setPreferredSize(new java.awt.Dimension(100, 25));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel10.add(btnDelete);

        btnRefresh.setBackground(new java.awt.Color(192, 192, 192));
        btnRefresh.setFont(new java.awt.Font("Windows 7 Segoe UI", 1, 14)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.setPreferredSize(new java.awt.Dimension(100, 25));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel10.add(btnRefresh);

        btnSeeProfile.setBackground(new java.awt.Color(0, 197, 255));
        btnSeeProfile.setFont(new java.awt.Font("Windows 7 Segoe UI", 1, 14)); // NOI18N
        btnSeeProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnSeeProfile.setText("See Profile");
        btnSeeProfile.setPreferredSize(new java.awt.Dimension(125, 25));
        btnSeeProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeProfileActionPerformed(evt);
            }
        });
        jPanel10.add(btnSeeProfile);

        btnCalculate.setBackground(new java.awt.Color(255, 215, 0));
        btnCalculate.setFont(new java.awt.Font("Windows 7 Segoe UI", 1, 14)); // NOI18N
        btnCalculate.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculate.setText("Calculate Tuition");
        btnCalculate.setPreferredSize(new java.awt.Dimension(150, 25));
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        jPanel10.add(btnCalculate);

        btnSave.setBackground(new java.awt.Color(0, 0, 255));
        btnSave.setFont(new java.awt.Font("Windows 7 Segoe UI", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setPreferredSize(new java.awt.Dimension(100, 25));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel10.add(btnSave);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (checkInfo()) {
            if (isValidDate()) {
                if (male.isSelected()) {
                    Student st1 = new Student(id.getText(), name.getText(), "Male", birthdayStudent(), address.getText(), email.getText(), major.getText());
                    if (stManager.addStudent(st1) == true) {
                        JOptionPane.showMessageDialog(null, "Student Added Successfully", "Notification", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Student Is Already On The List", "Notification", JOptionPane.ERROR_MESSAGE);
                    }
                    clearInfo();
                    refreshTable();
                } else if (female.isSelected()) {
                    Student st1 = new Student(id.getText(), name.getText(), "Female", birthdayStudent(), address.getText(), email.getText(), major.getText());
                    if (stManager.addStudent(st1) == true) {
                        JOptionPane.showMessageDialog(null, "Student Added Successfully", "Notification", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Student Is Already On The List", "Notification", JOptionPane.ERROR_MESSAGE);
                    }
                    clearInfo();
                    refreshTable();
                }
            } else {
                JOptionPane.showMessageDialog(null, "You Need To Enter A Suitable Date of Birth", "Notification", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "You Need To Fill In All The Necessary Information", "Notification", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearInfo();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        refreshTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = studentTable.getSelectedRow();
        Object[] options = {"Yes", "No"};

        if (selectedRow != -1) {
            int askDeleteRow = JOptionPane.showOptionDialog(null, "Are You Sure You Want To Delete This Student Information?", "CONFIRM?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
            if (askDeleteRow == JOptionPane.YES_OPTION) {
                stManager.deleteStudent((String) studentTable.getValueAt(selectedRow, 0));
                refreshTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No Student Was Selected", "Notification", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int selected = studentTable.getSelectedRow();
        Object[] options = {"Yes", "No"};

        if (selected != -1) {
            int answer = JOptionPane.showOptionDialog(null, "Are You Sure You Want To Update This Student Information?", "CONFIRM?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
            if (answer == JOptionPane.YES_OPTION) {
                var idt = id.getText();
                var namet = name.getText();
                var gender = "";
                if (male.isSelected()) {
                    gender = "male";
                } else {
                    gender = "female";
                }
                var dob = birthdayStudent();
                var addresst = address.getText();
                var emailt = email.getText();
                var majort = major.getText();
                Student s = new Student(idt, namet, gender, dob, addresst, emailt, majort);
                stManager.deleteStudent((String) studentTable.getValueAt(selected, 0));
                stManager.addStudent(s);
                fillInTable();
                JOptionPane.showMessageDialog(this, "Edit Successfully");
                clearInfo();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Choose Row You Want To Update");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSeeProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeProfileActionPerformed
        int selected = studentTable.getSelectedRow();
        if (selected != -1) {
            String id = (String) studentTable.getValueAt(selected, 0);
            for (int i = 0; i < stManager.getListStudent().size(); i++) {
                if (stManager.getListStudent().get(i).getId().equals(id)) {
                    var current = stManager.getListStudent().get(i);
                    info.setTextField(
                            "ID: " + current.getId() + " \n"
                            + "Name: " + current.getName() + " \n"
                            + "Gender: " + current.getGender() + "\n"
                            + "Day of birth: " + current.getDateOfBirth() + "\n"
                            + "Address: " + current.getAddress() + "\n"
                            + "Email: " + current.getEmail() + "\n"
                            + "Major: " + current.getMajor() + "\n"
                    );
                    if (current.getCourseOfStu() != null) {
                        String s = "";
                        String gio = "";
                        s = s + "Name: " + current.getName() + " \n";
                        for (int j = 0; j < current.getCourseOfStu().size(); j++) {
                            //s = s + "Name: " + current.getName() + " \n" +
                            if (current.getCourseOfStu().get(j).getTime().equals("7h30 - 9h30")) {
                                gio = "from 7.30 to 9.30";
                            } else if (current.getCourseOfStu().get(j).getTime().equals("9h30 - 11h30")) {
                                gio = "from 9.30 to 11.30";
                            } else if (current.getCourseOfStu().get(j).getTime().equals("12h30 - 14h30")) {
                                gio = "from 12.30 to 14.30";
                            } else {
                                gio = "from 14.30 to 16.30";
                            }
                            s = s + current.getCourseOfStu().get(j).getName() + " on " + current.getCourseOfStu().get(j).getDay() + " " + gio + "\n";
                        }
                        info.setTextCourse(s);
                    }
                    info.setVisible(true);
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select student you want to see information");
        }
    }//GEN-LAST:event_btnSeeProfileActionPerformed

    private void SortComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortComboBoxActionPerformed
        if (SortComboBox.getSelectedItem().toString().equals("Ascending ID")) {
            stManager.sortByIDAscending();
        } else if (SortComboBox.getSelectedItem().toString().equals("Descending ID")) {
            stManager.sortByIDDescending();
        } else if (SortComboBox.getSelectedItem().toString().equals("Ascending Name")) {
            stManager.sortbyNameAscending();
        } else if (SortComboBox.getSelectedItem().toString().equals("Descending Name")) {
            stManager.sortbyNameDescending();
        }

        clearTable();
        fillInTable();
    }//GEN-LAST:event_SortComboBoxActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        String searchTxt = search.getText().toLowerCase();
        stModel.setRowCount(0);

        stManager.getListStudent().stream().filter(student -> student.getName().toLowerCase().contains(searchTxt) || student.getId().contains(searchTxt) || student.getMajor().toLowerCase().contains(searchTxt)).forEach(filteredStudent -> {
            stModel.addRow(new Object[]{filteredStudent.getId(), filteredStudent.getName(), filteredStudent.getMajor(), filteredStudent.getEmail()});
        });
    }//GEN-LAST:event_searchKeyReleased

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        int selected = studentTable.getSelectedRow();
        if (selected != -1) {
            int sum = 0;
            String idStudent = (String) studentTable.getValueAt(selected, 0);
            for (int i = 0; i < stManager.getListStudent().size(); i++) {
                if (stManager.getListStudent().get(i).getId().equals(idStudent)) {
                    var currentStudent = stManager.getListStudent().get(i);
                    fee.fillInFeeTable(currentStudent);
                    fee.setVisible(true);
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        stManager.WriteFileStudents();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameStudent().setVisible(true);
            }
        });
    }

    public boolean checkInfo() {
        return !(id.getText().isEmpty() || name.getText().isEmpty() || (!male.isSelected() && !female.isSelected()) || (day.getText().isEmpty() || month.getText().isEmpty() || year.getText().isEmpty()) || address.getText().isEmpty() || email.getText().isEmpty() || major.getText().isEmpty());
    }

    public boolean isValidDate() {
        int D = Integer.parseInt(day.getText());
        int M = Integer.parseInt(month.getText());
        int Y = Integer.parseInt(year.getText());

        try {
            if (D < 1 || D > 31) {
                return false;
            }

            if (M < 1 || M > 12) {
                return false;
            }

            if (Y < 1970 || Y > 2038) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String birthdayStudent() {
        int D = Integer.parseInt(day.getText());
        int M = Integer.parseInt(month.getText());
        int Y = Integer.parseInt(year.getText());

        String Day;
        if (D < 10) {
            Day = "0" + D;
        } else {
            Day = Integer.toString(D);
        }
        String Month;
        if (M < 10) {
            Month = "0" + M;
        } else {
            Month = Integer.toString(M);
        }
        String DoB = Day + "/" + Month + "/" + Y;
        return DoB;
    }

    public void clearInfo() {
        id.setText("");
        name.setText("");
        male.setSelected(false);
        female.setSelected(false);
        day.setText("");
        month.setText("");
        year.setText("");
        address.setText("");
        email.setText("");
        major.setText("");
    }

    public void fillInTable() {
        stModel.setRowCount(0);
        for (Student s : stManager.getListStudent()) {
            String[] rowStudentInfo = {s.getId(), s.getName(), s.getMajor(), s.getEmail()};
            stModel.addRow(rowStudentInfo);
        }
        studentTable.setModel(stModel);
    }

    public void clearTable() {
        if (stModel != null) {
            stModel.setRowCount(0);
        }
    }

    public void refreshTable() {
        clearTable();
        fillInTable();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SortComboBox;
    private javax.swing.JTextField address;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSeeProfile;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField day;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField major;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField month;
    private javax.swing.JTextField name;
    private javax.swing.JTextField search;
    private javax.swing.JTable studentTable;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}