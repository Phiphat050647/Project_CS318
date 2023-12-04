/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bulibrary;

import bulibrary.ClassJava.DBConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Mr.Phiphat
 */
public class JPbooking extends javax.swing.JPanel {

    /**
     * Creates new form JPbooking
     */
    public JPbooking(String user,String id,String stime,String etime,String room,String date) {
        initComponents();
        nameBook.setText(room);
        jdate.setText(date);
        jstime.setText(stime);
        jetime.setText(etime);
        jname.setText(user);
        jid.setText(id);
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
        btnCancel = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jetime.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jetime.setForeground(new java.awt.Color(102, 102, 102));
        jetime.setText("11:00");
        add(jetime, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 160, 50, -1));

        jstime.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jstime.setForeground(new java.awt.Color(102, 102, 102));
        jstime.setText("09:00 ");
        add(jstime, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 50, -1));

        jid.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jid.setForeground(new java.awt.Color(102, 102, 102));
        jid.setText("1650701483");
        add(jid, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 130, -1));

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel7.setText("End Time : ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 80, -1));

        jdate.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jdate.setForeground(new java.awt.Color(102, 102, 102));
        jdate.setText("04-12-2566");
        add(jdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 110, -1));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel5.setText("Start Time : ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 90, -1));

        jname.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jname.setForeground(new java.awt.Color(102, 102, 102));
        jname.setText("Phiphat  Deepee");
        add(jname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 160, -1));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setText("Booking Date :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 130, -1));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setText("Student ID :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 90, -1));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel1.setText("User :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 50, -1));

        nameBook.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        nameBook.setText("Room 5");
        add(nameBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/booking/cancel.png"))); // NOI18N
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
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 140, -1, -1));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/booking/Roomicon.png"))); // NOI18N
        add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 49, 170, 160));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/booking/boxxx.png"))); // NOI18N
        add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked

        String deleteQuery = "DELETE FROM booking WHERE room = ? AND date = ? and stime = ? and etime = ?";
        DBConnect conn = new DBConnect();

        try {
            PreparedStatement statement = conn.prepareStatement(deleteQuery);
            statement.setString(1, nameBook.getText());
            statement.setString(2, jdate.getText());
            statement.setString(3, jstime.getText());
            statement.setString(4, jetime.getText());
            
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Data deleted successfully!");
                setVisible(false);
            } else {
                System.out.println("No data found to delete.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        
        
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
//        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/booking/cancelEX.png"));
//        btnCancel.setIcon(icon);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
//        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/booking/cancel.png"));
//        btnCancel.setIcon(icon);
    }//GEN-LAST:event_btnCancelMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel btnCancel;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
