/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bulibrary;

import java.awt.Color;
import java.util.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Mr.Phiphat
 */
public class Dialog_Regis extends javax.swing.JFrame {
    public List<UserData> userList = new ArrayList<>();
    /**
     * Creates new form Dialog_Regis
     */
    public Dialog_Regis() {
        setUndecorated(true);
        initComponents();
        // กำหนดสีพื้นหลังเป็นโปร่งใส
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        UserData user = new UserData();
        user.setFirstName("Phiphat");
        user.setLastName("Deepee");
        user.setEmail("Phiphat.Deep@bumail.net");
        user.setStudentId("1650701483");
        user.setPhoneNumber("080 334 0674");
        Fullname.setText("<html><div style='text-align: center;'>" +
    "<font color='gray'>Name:</font> " + user.getFirstName() + " " + user.getLastName() + " " +
    "<font color='gray'>Email:</font> " + user.getEmail() + "<br>" +
    "<font color='gray'>Student ID:</font> " + user.getStudentId() + "<br>" +
    "<font color='gray'>Tel:</font> " + user.getPhoneNumber() +
    "</div></html>");



    }


  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancel = new javax.swing.JLabel();
        Fullname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Cancelbtn.png"))); // NOI18N
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelMouseExited(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 181, 210, 60));

        Fullname.setFont(new java.awt.Font("Airbnb Cereal App Book", 0, 14)); // NOI18N
        Fullname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 470, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Confirmbtn.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 180, 210, 60));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Dailog_Register.png"))); // NOI18N
        getContentPane().add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 260));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/CANCEL_EXTED.png"));
        btnCancel.setIcon(icon);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/cancelbtn.png"));
        btnCancel.setIcon(icon);
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        dispose();
    }//GEN-LAST:event_btnCancelMouseClicked


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dialog_Regis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bg;
    private javax.swing.JLabel Fullname;
    private javax.swing.JLabel btnCancel;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
