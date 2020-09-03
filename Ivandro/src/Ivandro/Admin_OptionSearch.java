/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivandroassignment;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author hp
 */
public class Admin_OptionSearch extends javax.swing.JFrame {

    /**
     * Creates new form Admin_OptionSearch
     */
    public Admin_OptionSearch() {
        initComponents();
    currentDate(); // Function for the system date and time
    }
    // Sets the time and date in the System
    public void currentDate (){
        
        Calendar cal =new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        jlabelDate.setText(day+"/"+(month+1) +"/"+year);
        
        //Time
      
        
        int minutes = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        
        jLabelTime.setText(hour+":"+(minutes));
       
    }
    private void close() {
        WindowEvent closewindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closewindow);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonSearchStudents = new javax.swing.JButton();
        jButtonSearchLecturers = new javax.swing.JButton();
        jButtonGoBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelAdminMenu = new javax.swing.JLabel();
        jlabelDate = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Select an option : ");

        jButtonSearchStudents.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonSearchStudents.setText("Students");
        jButtonSearchStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchStudentsActionPerformed(evt);
            }
        });

        jButtonSearchLecturers.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonSearchLecturers.setText("Lecturers");
        jButtonSearchLecturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchLecturersActionPerformed(evt);
            }
        });

        jButtonGoBack.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonGoBack.setText("Go Back");
        jButtonGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoBackActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        jLabelAdminMenu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelAdminMenu.setText("Search");

        jlabelDate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlabelDate.setText("Date");

        jLabelTime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelTime.setText("Time");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabelAdminMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(jlabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlabelDate)
                        .addComponent(jLabelTime))
                    .addComponent(jLabelAdminMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jButtonSearchStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSearchLecturers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGoBack)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jButtonSearchStudents)
                .addGap(39, 39, 39)
                .addComponent(jButtonSearchLecturers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jButtonGoBack)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchStudentsActionPerformed
        // TODO add your handling code here:
        close();
        Admin_SearchRecords openwindow = new Admin_SearchRecords();
        openwindow.setVisible(true);
    }//GEN-LAST:event_jButtonSearchStudentsActionPerformed

    private void jButtonSearchLecturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchLecturersActionPerformed
        // TODO add your handling code here:
        close();
        Admin_SearchLecturer openwindow = new Admin_SearchLecturer();
        openwindow.setVisible(true);
    }//GEN-LAST:event_jButtonSearchLecturersActionPerformed

    private void jButtonGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoBackActionPerformed
        // TODO add your handling code here:
        // Allows the program to go back to the previous window
        close();
        Admin_Menu goback = new Admin_Menu();
        goback.setVisible(true);
    }//GEN-LAST:event_jButtonGoBackActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_OptionSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_OptionSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_OptionSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_OptionSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_OptionSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGoBack;
    private javax.swing.JButton jButtonSearchLecturers;
    private javax.swing.JButton jButtonSearchStudents;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAdminMenu;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlabelDate;
    // End of variables declaration//GEN-END:variables
}
