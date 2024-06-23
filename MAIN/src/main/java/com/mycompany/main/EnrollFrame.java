/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.main;

import javax.swing.JOptionPane;

/**
 *
 * @author Tai-E758
 */
public class EnrollFrame extends javax.swing.JFrame {

    Enroll enroll = new Enroll();
    ManageCourse mCourse = new ManageCourse();
    ModelTableCourse modelCourse = new ModelTableCourse();
    CourseInfo courseInfo = new CourseInfo();

    /**
     * Creates new form EnrollFrame1
     */
    public EnrollFrame() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        EnrollTableCourse = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        studentID = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        courseID = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnEnroll = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        searchCourse = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        EnrollTableCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "FEE", "DAY", "TIME"
            }
        ));
        jScrollPane1.setViewportView(EnrollTableCourse);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(206, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Available Course List");
        jLabel1.setPreferredSize(new java.awt.Dimension(450, 50));
        jPanel1.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Enter Student's ID");
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 25));
        jPanel2.add(jLabel2);

        studentID.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel2.add(studentID);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Enter Course's ID");
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 25));
        jPanel3.add(jLabel3);

        courseID.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel3.add(courseID);

        btnEnroll.setBackground(new java.awt.Color(0, 197, 255));
        btnEnroll.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnEnroll.setForeground(new java.awt.Color(255, 255, 255));
        btnEnroll.setText("Enroll");
        btnEnroll.setPreferredSize(new java.awt.Dimension(200, 50));
        btnEnroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnrollActionPerformed(evt);
            }
        });
        jPanel4.add(btnEnroll);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Search Course ID");
        jLabel4.setPreferredSize(new java.awt.Dimension(125, 25));
        jPanel5.add(jLabel4);

        searchCourse.setPreferredSize(new java.awt.Dimension(200, 30));
        searchCourse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchCourseKeyReleased(evt);
            }
        });
        jPanel5.add(searchCourse);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnrollActionPerformed
        var idS = studentID.getText();
        var idC = courseID.getText();
        var student = enroll.getmStudent().getStudentMap().get(idS);
        var course = enroll.getmCourse().getCourseMap().get(idC);
        if (enroll.getmStudent().getStudentMap().get(idS) != null && enroll.getmCourse().getCourseMap().get(idC) != null) {
            if (enroll.studentEnroll(enroll.getmStudent().getStudentMap().get(idS), enroll.getmCourse().getCourseMap().get(idC))) {
                JOptionPane.showMessageDialog(this, "Add new course success");
            } else {
                JOptionPane.showMessageDialog(this, "You have other class that have the same schedule with this class");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Your student ID or your course ID is not exist in database. Please check again!");
        }
    }//GEN-LAST:event_btnEnrollActionPerformed

    private void searchCourseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchCourseKeyReleased
        String searchTxt = searchCourse.getText().toLowerCase();
        modelCourse.setRowCount(0);

        mCourse.getListCourse().stream().filter(course -> course.getId().toLowerCase().contains(searchTxt) || course.getName().toLowerCase().contains(searchTxt)).forEach(filteredCourse -> {
            modelCourse.addRow(new Object[]{filteredCourse.getId(), filteredCourse.getName(), filteredCourse.getFee(), filteredCourse.getDay(), filteredCourse.getTime()});
        });
    }//GEN-LAST:event_searchCourseKeyReleased

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
            java.util.logging.Logger.getLogger(EnrollFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnrollFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnrollFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnrollFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnrollFrame().setVisible(true);
            }
        });
    }

    public void fillInCourseTable() {
        modelCourse.setRowCount(0);
        for (Course c : mCourse.getListCourse()) {
            Object[] rowData = {c.getId(), c.getName(), c.getFee(), c.getDay(), c.getTime()};
            modelCourse.addRow(rowData);
        }
        EnrollTableCourse.setModel(modelCourse);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EnrollTableCourse;
    private javax.swing.JButton btnEnroll;
    private javax.swing.JTextField courseID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchCourse;
    private javax.swing.JTextField studentID;
    // End of variables declaration//GEN-END:variables
}
