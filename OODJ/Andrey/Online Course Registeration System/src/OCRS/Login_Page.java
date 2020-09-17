/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCRS;

import java.awt.Font;
import java.awt.font.TextAttribute;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author audrey
 */
public class Login_Page extends javax.swing.JFrame {

    /**
     * Creates new form Login_Page
     */
    public Login_Page() {
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

        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        WelcomeLabel = new javax.swing.JLabel();
        unLabel = new javax.swing.JLabel();
        usr_f = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        login_b = new javax.swing.JButton();
        pwd_f = new javax.swing.JPasswordField();
        reset_b = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        register_b = new javax.swing.JLabel();
        stud_r = new javax.swing.JRadioButton();
        admin_r = new javax.swing.JRadioButton();
        forgot_b = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WelcomeLabel.setFont(new java.awt.Font("Yuppy SC", 1, 18)); // NOI18N
        WelcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeLabel.setText("W E L C O M E");

        unLabel.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 14)); // NOI18N
        unLabel.setText("Username");

        jLabel1.setFont(new java.awt.Font("Malayalam Sangam MN", 0, 14)); // NOI18N
        jLabel1.setText("Password");

        login_b.setText("Login");
        login_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_bActionPerformed(evt);
            }
        });

        reset_b.setText("Reset");
        reset_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_bActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Shree Devanagari 714", 0, 11)); // NOI18N
        jLabel3.setText("*Please select your profile.");

        register_b.setText("Register");
        register_b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                register_bMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                register_bMouseEntered(evt);
            }
        });

        buttonGroup1.add(stud_r);
        stud_r.setText("Student");

        buttonGroup1.add(admin_r);
        admin_r.setText("Administrator");
        admin_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_rActionPerformed(evt);
            }
        });

        forgot_b.setText("Forgot Password");
        forgot_b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgot_bMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgot_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgot_bMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(WelcomeLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(login_b)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(reset_b))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(unLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(9, 9, 9)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(forgot_b)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(register_b))
                                        .addComponent(usr_f)
                                        .addComponent(pwd_f, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(stud_r)
                                .addGap(18, 18, 18)
                                .addComponent(admin_r)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(WelcomeLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stud_r)
                    .addComponent(admin_r))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unLabel)
                    .addComponent(usr_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pwd_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register_b)
                    .addComponent(forgot_b))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_b)
                    .addComponent(reset_b))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void admin_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_rActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admin_rActionPerformed

    private void MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseClicked
        /*REGISTER BUTTON*/
        //If student profile is selected, send to student register page.
        if (stud_r.isSelected()){
            Stud_Regist sr = new Stud_Regist();
            sr.setVisible(true);
            this.dispose();
            return;
        }
        
        //If admin profile is selected, send to student register page.
        else if (admin_r.isSelected()){
            admin_validation av = new admin_validation();
            av.setVisible(true);
            this.dispose();
            return;
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select your position and try again.");
            return;
        }
    }//GEN-LAST:event_MouseClicked

    private void register_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_bMouseEntered
        /*CHANGE LABEL TO UNDERLINED WHEN MOUSE HOVER OVER IT*/
        //Assign original font to variable original.
        Font original = evt.getComponent().getFont();
        
        //Get attributes of font and map it to variable attributes.
        Map attributes = original.getAttributes();
        
        //Assign underline attribute to variable attributes.
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        
        //When mouse entered event occur, set font to a font with new attributes assigned.
        evt.getComponent().setFont(original.deriveFont(attributes));
    }//GEN-LAST:event_register_bMouseEntered

    private void register_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_bMouseExited
        /*CHANGE LABEL BACK TO NORMAL WHEN MOUSE HOVER OUT OF IT*/
        //Assign original font to variable original.        
        Font original = evt.getComponent().getFont();
        
        //Get attributes of font and map it to variable attributes.
        Map attributes = original.getAttributes();
        
        //Assign remove underline attribute to variable attributes.
        attributes.put(TextAttribute.UNDERLINE, -1);
        
        //When mouse entered event occur, set font to a font with new attributes assigned.
        evt.getComponent().setFont(original.deriveFont(attributes));
    }//GEN-LAST:event_register_bMouseExited

    private void reset_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_bActionPerformed
        /*RESET ALL FIELDS*/
        try{
            usr_f.setText("");
            pwd_f.setText("");
        }
        catch(Exception res){
            JOptionPane.showMessageDialog(null, "System error " +res);
        }
    }//GEN-LAST:event_reset_bActionPerformed

    private void login_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_bActionPerformed
        //Declaring objects and variables.
        String uname,pwd;
        String[] temp;

        //Assigning text to variables.
        uname=usr_f.getText();
        pwd=pwd_f.getText();
        
        //Error handling.
        if (uname.length() == 0){
            JOptionPane.showMessageDialog(null, "Please enter a Username.");
            pwd_f.setText("");
            return;
        }        
        else if (pwd.length() == 0){
            JOptionPane.showMessageDialog(null, "Please enter a Password.");
            pwd_f.setText("");
            return;
        }
        
        //Make sure at least one profile is selected.
        if(stud_r.isSelected()||admin_r.isSelected()){
            try{
                
                //If student profile is selected, read from student database to match username and password
                if(stud_r.isSelected()){
                    FileWriter fw = new FileWriter ("Student_Profile_DB.txt", true);
                    FileReader fr = new FileReader ("Student_Profile_DB.txt");
                    BufferedReader br = new BufferedReader(fr);
                    String reader;
                    
                    reader = br.readLine();
                    if ("testnull".equals(reader)){
                        System.out.println("This should not occur, only to handle NullPointerException.");
                    }
                    else{
                        
                        //If no users are registered at all (an empty txt file), display error.
                        if (reader == null){
                            JOptionPane.showMessageDialog(null, "User does not exist, please register.");
                            usr_f.setText("");
                            pwd_f.setText("");
                            br.close();
                            fr.close();
                            fw.close();
                            return;
                        }                    
                        while(reader.length() != 0){
                            temp = reader.split(",");
                            
                            //If username and password matches from database, proceed to student main menu.
                            if(uname.equals(temp[4])&&pwd.equals(temp[5])){
                                Stud_mMenu sm = new Stud_mMenu(uname);
                                sm.setVisible(true);
                                br.close();
                                fr.close();
                                fw.close();
                                this.dispose();
                                return;
                            }
                            
                            //If username matches from database but incorrect password, display error.
                            else if(uname.equals(temp[4])&&!pwd.equals(temp[5])){
                                JOptionPane.showMessageDialog(null, "Invalid password entered, please try again.");
                                pwd_f.setText("");
                                return;
                            }
                            reader = br.readLine();
                            if ("testnull".equals(reader)){
                                System.out.println("This should not occur, only to handle NullPointerException.");
                            }
                            else{
                                
                                //If username does not match anything from database, prompt for registration.
                                if (reader == null){
                                    JOptionPane.showMessageDialog(null, "User does not exist, please register.");
                                    usr_f.setText("");
                                    pwd_f.setText("");
                                    br.close();
                                    fr.close();
                                    fw.close();
                                    return;
                                }                                 
                            }                         
                        }
                    }
                }
                
                //If admin profile is selected, read from admin database to match username and password
                else if(admin_r.isSelected()){
                    FileWriter fw = new FileWriter ("Admin_Profile_DB.txt", true);
                    FileReader fr = new FileReader ("Admin_Profile_DB.txt");
                    BufferedReader br = new BufferedReader(fr);
                    String reader;
                    reader = br.readLine();
                    if ("testnull".equals(reader)){
                        System.out.println("This should not occur, only to handle NullPointerException.");
                    }
                    else{
                        //If no users are registered at all (an empty txt file), display error.
                        if (reader == null){
                            JOptionPane.showMessageDialog(null, "User does not exist, please register.");
                            usr_f.setText("");
                            pwd_f.setText("");
                            br.close();
                            fr.close();
                            fw.close();
                            return;
                        }                    
                        while(reader.length() != 0){
                            temp = reader.split(",");
                            
                            //If username and password matches from database, proceed to admin main menu.
                            if(uname.equals(temp[3])&&pwd.equals(temp[4])){
                                admin_mMenu am = new admin_mMenu(uname);
                                am.setVisible(true);
                                br.close();
                                fr.close();
                                fw.close();                            
                                this.dispose();
                                return;
                            }
                            
                            //If username matches from database but incorrect password, display error.
                            else if(uname.equals(temp[3])&&!pwd.equals(temp[4])){
                                JOptionPane.showMessageDialog(null, "Invalid password entered, please try again.");
                                pwd_f.setText("");
                                return;
                            }
                            reader = br.readLine();
                            if ("testnull".equals(reader)){
                                System.out.println("This should not occur, only to handle NullPointerException.");
                            }
                            else{
                                
                                //If username does not match from database, prompt for registration.
                                if (reader == null){
                                    JOptionPane.showMessageDialog(null, "User does not exist, please register.");
                                    usr_f.setText("");
                                    pwd_f.setText("");
                                    br.close();
                                    fr.close();
                                    fw.close();
                                    return;
                                }                                 
                            }                             
                        }           
                    }
                }            
            }
            catch (Exception login){
                JOptionPane.showMessageDialog(null, "System error " +login);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select your profile and try again.");
            return;
        }
    }//GEN-LAST:event_login_bActionPerformed

    private void forgot_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_bMouseClicked
        /*IF USER FORGOTS PASSWORD*/
        //Declaring variables.
        String uname = usr_f.getText();
        String page = "lp";
        String[] temp;
               
        if(uname.length() != 0){
            
            //If student profile is selected, find if user exists. If exist then send to change password page.
            if (stud_r.isSelected()){
                try{
                    FileWriter fw = new FileWriter("Student_Profile_DB.txt", true);
                    FileReader fr = new FileReader("Student_Profile_DB.txt");
                    BufferedReader br = new BufferedReader(fr);
                    String reader;
                    reader = br.readLine();
                    if ("testnull".equals(reader)){
                        System.out.println("This should not occur, only to handle NullPointerException.");
                    }
                    else{                    
                        if (reader == null){
                            JOptionPane.showMessageDialog(null, "User does not exist, please register instead.");
                            usr_f.setText("");
                            pwd_f.setText("");
                            br.close();
                            fr.close();
                            fw.close();
                            return;
                        }
                        while (reader.length() != 0){
                            temp = reader.split(",");
                            if(uname.equals(temp[4])){
                                String profile = "Student";
                                Changepass sf = new Changepass(uname, page, profile);
                                sf.setVisible(true);
                                br.close();
                                fr.close();
                                fw.close();
                                this.dispose();
                                return;
                            }
                            reader = br.readLine();
                            if ("testnull".equals(reader)){
                                System.out.println("This should not occur, only to handle NullPointerException.");
                            }
                            else{
                                //If username does not match from database, promt for registration
                                if (reader == null){
                                    JOptionPane.showMessageDialog(null, "User does not exist, please register instead.");
                                    usr_f.setText("");
                                    pwd_f.setText("");
                                    br.close();
                                    fr.close();
                                    fw.close();
                                    return;
                                }                                 
                            }                             
                        }
                    }
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Unable to access reset password. "+e);
                    return;
                }
            }
            
            //If admin profile is selected, find if user exists. If exist then send to change password page.
            else if (admin_r.isSelected()){
                try{
                    FileWriter fw = new FileWriter("Admin_Profile_DB.txt", true);
                    FileReader fr = new FileReader("Admin_Profile_DB.txt");
                    BufferedReader br = new BufferedReader(fr);
                    String reader;
                    reader = br.readLine();
                    if ("testnull".equals(reader)){
                        System.out.println("This should not occur, only to handle NullPointerException.");
                    }
                    else{                    
                        if (reader == null){
                            JOptionPane.showMessageDialog(null, "User does not exist, please register instead.");
                            usr_f.setText("");
                            pwd_f.setText("");
                            br.close();
                            fr.close();
                            fw.close();
                            return;
                        }                    
                        while (reader.length() != 0){
                            temp = reader.split(",");
                            if(uname.equals(temp[3])){
                                String profile = "Admin";
                                Changepass sf = new Changepass(uname,page,profile);
                                sf.setVisible(true);
                                br.close();
                                fr.close();
                                fw.close();
                                this.dispose();
                                return;
                            }
                            reader = br.readLine();
                            if ("testnull".equals(reader)){
                                System.out.println("This should not occur, only to handle NullPointerException.");
                            }
                            else{
                                //If username does not match from database, promt for registration
                                if (reader == null){
                                    JOptionPane.showMessageDialog(null, "User does not exist, please register instead.");
                                    usr_f.setText("");
                                    pwd_f.setText("");
                                    br.close();
                                    fr.close();
                                    fw.close();
                                    return;
                                }                                 
                            } 
                        }
                    }                
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Unable to access reset password. "+e);
                    return;
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Please select your profile and try again.");
                return;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please enter username then try again.");
            return;
        }
    }//GEN-LAST:event_forgot_bMouseClicked

    private void forgot_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_bMouseEntered
        //REFER TO COMMENTS ABOVE
        Font original = evt.getComponent().getFont();
        Map attributes = original.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        evt.getComponent().setFont(original.deriveFont(attributes));
    }//GEN-LAST:event_forgot_bMouseEntered

    private void forgot_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_bMouseExited
        //REFER TO COMMENTS ABOVE
        Font original = evt.getComponent().getFont();
        Map attributes = original.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, -1);
        evt.getComponent().setFont(original.deriveFont(attributes));
    }//GEN-LAST:event_forgot_bMouseExited

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
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JRadioButton admin_r;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel forgot_b;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton login_b;
    private javax.swing.JPasswordField pwd_f;
    private javax.swing.JLabel register_b;
    private javax.swing.JButton reset_b;
    private javax.swing.JRadioButton stud_r;
    private javax.swing.JLabel unLabel;
    private javax.swing.JTextField usr_f;
    // End of variables declaration//GEN-END:variables
}
