/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bulibrary;

import bulibrary.ClassJava.DBConnect;
import java.awt.Component;
import java.awt.Container;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Mr.Phiphat
 */
public class JPbookComplet extends javax.swing.JPanel {

    private Component Pbooking;
    
    public JPbookComplet(String user,String id,String stime,String etime,String room,String date,Component Pbooking) {
        initComponents();
        nameBook.setText(room);
        jdate.setText(date);
        jstime.setText(stime);
        jetime.setText(etime);
        jname.setText(user);
        jid.setText(id);
        this.Pbooking = Pbooking;
        
        List<String> listRoom = Arrays.asList("Room1", "Room2", "Room3", "Room4", "Room5", "Room6", "Room7", "Room8", "Room9", "Room10");
        
        if (listRoom.contains(room)) {
            
        } else if ("Spyfall".equals(room)) {
            Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/booking/spyfall.png"));
            this.icon.setIcon(icon);
        } else if ("Werewolf".equals(room)){
            Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/booking/werewolf.png"));
            this.icon.setIcon(icon);
        } else if ("UNO".equals(room)){
            Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/booking/uno.png"));
            this.icon.setIcon(icon);
        } else if ("Exploding kittens".equals(room)){
            Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/booking/exploding.png"));
            this.icon.setIcon(icon);
        } else if ("Salem 1692".equals(room)){
            Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/booking/salem.png"));
            this.icon.setIcon(icon);
        } else if ("I'm The Boss".equals(room)){
            Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/booking/imboss.png"));
            this.icon.setIcon(icon);
        } else if ("Sitting Duck Gallery".equals(room)){
            Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/booking/Duck.png"));
            this.icon.setIcon(icon);
        } else if ("Splendor".equals(room)){
            Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/booking/splendor.png"));
            this.icon.setIcon(icon);
        } else {
            System.out.println("ไม่มีข้อมูล หรือ ไม่ตรงกับเงื่อนไข");
        }

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jetime = new javax.swing.JLabel();
        jstime = new javax.swing.JLabel();
        jid = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jdate = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameBook = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jetime.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jetime.setForeground(new java.awt.Color(102, 102, 102));
        jetime.setText("11:00");
        add(jetime, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 50, -1));

        jstime.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jstime.setForeground(new java.awt.Color(102, 102, 102));
        jstime.setText("09:00 ");
        add(jstime, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 50, -1));

        jid.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jid.setForeground(new java.awt.Color(102, 102, 102));
        jid.setText("1650701483");
        add(jid, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 130, -1));

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel7.setText("End Time : ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 80, -1));

        jdate.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jdate.setForeground(new java.awt.Color(102, 102, 102));
        jdate.setText("04-12-2566");
        add(jdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 110, -1));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel5.setText("Start Time : ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 90, -1));

        jname.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jname.setForeground(new java.awt.Color(102, 102, 102));
        jname.setText("Phiphat  Deepee");
        add(jname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 160, -1));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setText("Booking Date :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 130, -1));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setText("Student ID :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 90, -1));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel1.setText("User :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 50, -1));

        nameBook.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        nameBook.setText("Room 5");
        add(nameBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/booking/CompleICON.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 32, 170, 130));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/booking/Roomicon.png"))); // NOI18N
        add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 170, 160));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/booking/boxxx.png"))); // NOI18N
        add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jdate;
    private javax.swing.JLabel jetime;
    private javax.swing.JLabel jid;
    private javax.swing.JLabel jname;
    private javax.swing.JLabel jstime;
    private javax.swing.JLabel nameBook;
    // End of variables declaration//GEN-END:variables
}
