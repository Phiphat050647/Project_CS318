/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package bulibrary;

import bulibrary.ClassJava.UserData;
import bulibrary.ClassJava.DBConnect;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ThaiBuddhistDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Mr.Phiphat
 */
public class BookingRoom extends javax.swing.JDialog {

        private String email;
        private String room;
        ArrayList<String> originalStartTimes = new ArrayList<>();
        ArrayList<String> originalEndTimes = new ArrayList<>();
    
    public BookingRoom(java.awt.Frame parent, boolean modal,String room,String user,String id,String email) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        Room.setText("Booking " + room);
        txtUser.setText(user);
        txtId.setText(id);
        this.email = email;
        this.room = room;
        
        for (int i = 0; i < ComboStartTime.getItemCount(); i++) {
            originalStartTimes.add(ComboStartTime.getItemAt(i).toString());
        }
        for (int i = 0; i < ComboEndTime.getItemCount(); i++) {
            originalEndTimes.add(ComboEndTime.getItemAt(i).toString());
        }
        String date = txtDate.getText();
        ArrayList<String> bookedStartTimes = new ArrayList<>();
        ArrayList<String> bookedEndTimes = new ArrayList<>();
        
        System.out.println(date);
        String selectQuery = "SELECT * FROM booking WHERE room = ? and date = ? ";
        DBConnect conn = new DBConnect();
        ResultSet rs = null;
        try {
            PreparedStatement Statement = conn.prepareStatement(selectQuery);
            Statement.setString(1, this.room);
            Statement.setString(2, date);
            rs = Statement.executeQuery();
            while (rs.next()) {
                String startTime = rs.getString("stime");
                String endTime = rs.getString("etime");
                bookedStartTimes.add(startTime);
                bookedEndTimes.add(endTime);
            }
            
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
         for (String startTime : bookedStartTimes) {
            ComboStartTime.removeItem(startTime);
        }

        for (String endTime : bookedEndTimes) {
            ComboEndTime.removeItem(endTime);
        }
        if (ComboStartTime.getSelectedItem() == null && ComboEndTime.getSelectedItem() == null) {
            Message.setText("The room is full.");
        } else{
            Message.setText("");
        }
        CheckdateAndtime();
    }

    public  void CheckdateAndtime(){
        String date = txtDate.getText();
        
        ThaiBuddhistDate thaiBuddhistDate = ThaiBuddhistDate.now();
        String lastDate = thaiBuddhistDate.toString().substring(thaiBuddhistDate.toString().length() - 10);
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter ThaiFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate Thaidatenow = LocalDate.parse(lastDate,ThaiFormatter);
        LocalDate selectedDate = LocalDate.parse(date, formatterDate);

        if (selectedDate.isEqual(Thaidatenow))  {
            LocalTime now = LocalTime.now();
            LocalTime time1 = LocalTime.parse("08:30", DateTimeFormatter.ofPattern("HH:mm"));
            LocalTime time2 = LocalTime.parse("10:00", DateTimeFormatter.ofPattern("HH:mm"));
            LocalTime time3 = LocalTime.parse("12:00", DateTimeFormatter.ofPattern("HH:mm"));
            LocalTime time4 = LocalTime.parse("14:00", DateTimeFormatter.ofPattern("HH:mm"));
            LocalTime time5 = LocalTime.parse("16:00", DateTimeFormatter.ofPattern("HH:mm"));
            LocalTime time6 = LocalTime.parse("18:00", DateTimeFormatter.ofPattern("HH:mm"));
            if (now.isAfter(time6)) {
                ComboStartTime.removeItem("08:30"); 
                ComboStartTime.removeItem("10:00");
                ComboStartTime.removeItem("12:00");
                ComboStartTime.removeItem("14:00");
                ComboStartTime.removeItem("16:00");
                ComboStartTime.removeItem("18:00");
                ComboEndTime.removeItem("10:00");
                ComboEndTime.removeItem("12:00");
                ComboEndTime.removeItem("14:00");
                ComboEndTime.removeItem("16:00");
                ComboEndTime.removeItem("18:00");
                ComboEndTime.removeItem("20:00");
            } else if (now.isAfter(time5)) {
                ComboStartTime.removeItem("08:30"); 
                ComboStartTime.removeItem("10:00");
                ComboStartTime.removeItem("12:00");
                ComboStartTime.removeItem("14:00");
                ComboStartTime.removeItem("16:00");
                ComboEndTime.removeItem("10:00");
                ComboEndTime.removeItem("12:00");
                ComboEndTime.removeItem("14:00");
                ComboEndTime.removeItem("16:00");
                ComboEndTime.removeItem("18:00");
            } else if (now.isAfter(time4)) {
                ComboStartTime.removeItem("08:30"); 
                ComboStartTime.removeItem("10:00");
                ComboStartTime.removeItem("12:00");
                ComboStartTime.removeItem("14:00");
                ComboEndTime.removeItem("10:00");
                ComboEndTime.removeItem("12:00");
                ComboEndTime.removeItem("14:00");
                ComboEndTime.removeItem("16:00");
            } else if (now.isAfter(time3)) {
                ComboStartTime.removeItem("08:30"); 
                ComboStartTime.removeItem("10:00");
                ComboStartTime.removeItem("12:00");
                ComboEndTime.removeItem("10:00");
                ComboEndTime.removeItem("12:00");
                ComboEndTime.removeItem("14:00");
            } else if (now.isAfter(time2)) {
                ComboStartTime.removeItem("08:30"); 
                ComboStartTime.removeItem("10:00");
                ComboEndTime.removeItem("10:00");
                ComboEndTime.removeItem("12:00");
            } else if (now.isAfter(time1)) {
                ComboStartTime.removeItem("08:30"); 
                ComboEndTime.removeItem("10:00");
            
            } else {
                
            }
        } else if (selectedDate.isBefore(Thaidatenow)){
                ComboStartTime.removeItem("08:30"); 
                ComboStartTime.removeItem("10:00");
                ComboStartTime.removeItem("12:00");
                ComboStartTime.removeItem("14:00");
                ComboStartTime.removeItem("16:00");
                ComboStartTime.removeItem("18:00");
                ComboEndTime.removeItem("10:00");
                ComboEndTime.removeItem("12:00");
                ComboEndTime.removeItem("14:00");
                ComboEndTime.removeItem("16:00");
                ComboEndTime.removeItem("18:00");
                ComboEndTime.removeItem("20:00");
        }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        ComboStartTime = new bulibrary.ClassJava.ComboBoxSuggestion();
        ComboEndTime = new bulibrary.ClassJava.ComboBoxSuggestion();
        txtDate = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtPurpose = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        Room = new javax.swing.JLabel();
        btnCancel = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JLabel();
        icondate = new javax.swing.JLabel();
        Message = new javax.swing.JLabel();
        ErrorMessage = new javax.swing.JLabel();
        Bg = new javax.swing.JLabel();

        dateChooser1.setTextRefernce(txtDate);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboStartTime.setBorder(null);
        ComboStartTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "08:30", "10:00", "12:00", "14:00", "16:00", "18:00" }));
        ComboStartTime.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        getContentPane().add(ComboStartTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 191, 160, 20));

        ComboEndTime.setBorder(null);
        ComboEndTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10:00", "12:00", "14:00", "16:00", "18:00", "20:00" }));
        ComboEndTime.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        getContentPane().add(ComboEndTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 193, 160, 20));

        txtDate.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtDate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDateMouseClicked(evt);
            }
        });
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 120, 130, 20));

        txtId.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtId.setBorder(null);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 332, 160, 20));

        txtPurpose.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtPurpose.setBorder(null);
        getContentPane().add(txtPurpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 262, 370, -1));

        txtUser.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtUser.setBorder(null);
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 332, 160, 20));

        Room.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        Room.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Room.setText("Booking Room5");
        Room.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Room, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 170, 20));

        btnCancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/CANCEL_EXTED.png"))); // NOI18N
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
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 417, 210, 60));

        btnConfirm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Confirmbtn.png"))); // NOI18N
        btnConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfirmMouseExited(evt);
            }
        });
        getContentPane().add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 419, 200, -1));

        icondate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Room/dateicon.png"))); // NOI18N
        icondate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icondate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icondateMouseClicked(evt);
            }
        });
        getContentPane().add(icondate, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 120, 30, 20));

        Message.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        Message.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 180, 20));

        ErrorMessage.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        ErrorMessage.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(ErrorMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 320, 20));

        Bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Room/BookingRoom.png"))); // NOI18N
        Bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BgMouseEntered(evt);
            }
        });
        getContentPane().add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void icondateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icondateMouseClicked
        dateChooser1.showPopup();
        ComboStartTime.removeAllItems();
        ComboEndTime.removeAllItems();
        for (String startTime : originalStartTimes) {
            ComboStartTime.addItem(startTime);
        }
        for (String endTime : originalEndTimes) {
            ComboEndTime.addItem(endTime);
        }
        
        String date = txtDate.getText();
        ArrayList<String> bookedStartTimes = new ArrayList<>();
        ArrayList<String> bookedEndTimes = new ArrayList<>();
        
        System.out.println(date);
        String selectQuery = "SELECT * FROM booking WHERE room = ? and date = ? ";
        DBConnect conn = new DBConnect();
        ResultSet rs = null;
        try {
            PreparedStatement Statement = conn.prepareStatement(selectQuery);
            Statement.setString(1, room);
            Statement.setString(2, date);
            rs = Statement.executeQuery();
            while (rs.next()) {
                String startTime = rs.getString("stime");
                String endTime = rs.getString("etime");
                bookedStartTimes.add(startTime);
                bookedEndTimes.add(endTime);
            }
            
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        for (String startTime : bookedStartTimes) {
            ComboStartTime.removeItem(startTime);
        }

        for (String endTime : bookedEndTimes) {
            ComboEndTime.removeItem(endTime);
        }
        
        if (ComboStartTime.getSelectedItem() == null && ComboEndTime.getSelectedItem() == null) {
            Message.setText("The room is full.");
        } else{
            Message.setText("");
        }
    }//GEN-LAST:event_icondateMouseClicked

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseClicked
        String stime = ComboStartTime.getSelectedItem().toString();
        String etime = ComboEndTime.getSelectedItem().toString();
        String date = txtDate.getText();
        
        // เวลาปัจจุบัน
        LocalTime currentTime = LocalTime.now();
        // วันปัจุบันเป็น พศ.
        ThaiBuddhistDate thaiBuddhistDate = ThaiBuddhistDate.now();
        String lastDate = thaiBuddhistDate.toString().substring(thaiBuddhistDate.toString().length() - 10);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter ThaiFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        LocalDate Thaidatenow = LocalDate.parse(lastDate,ThaiFormatter);
        LocalDate selectedDate = LocalDate.parse(date, formatter);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        
        LocalTime selectedStartTime = LocalTime.parse(stime.replace(".", ":"), timeFormatter);
        LocalTime selectedEndTime = LocalTime.parse(etime.replace(".", ":"), timeFormatter);

        
        if (txtDate.getText().isEmpty() || txtId.getText().isEmpty() || txtPurpose.getText().isEmpty() || txtUser.getText().isEmpty() || ComboStartTime.getSelectedItem() == null || ComboEndTime.getSelectedItem() == null){
            ErrorMessage.setText("Please fill out the information completely.");
            System.out.println(selectedStartTime);
            System.out.println(selectedEndTime);
            System.out.println(currentTime);
            System.out.println(Thaidatenow);
            System.out.println(selectedDate);
            
        } else if (selectedStartTime.isAfter(selectedEndTime)) {
            System.out.println(selectedStartTime);
            System.out.println(selectedEndTime);
            System.out.println(currentTime);
            ErrorMessage.setText("Start time must be before end time.");
        } else if (selectedStartTime.equals(selectedEndTime))  {
            System.out.println(selectedStartTime);
            System.out.println(selectedEndTime);
            System.out.println(currentTime);
            ErrorMessage.setText("Start time must be equal end time.");
        } else if (selectedDate.isAfter(Thaidatenow) || (selectedDate.isEqual(Thaidatenow))) {
                String insertQuery = "INSERT INTO booking (user, porpose, id, room, date, stime, etime,email) VALUES (?, ?, ?, ?, ?, ?, ?,?)";
                DBConnect conn = new DBConnect();
                
                try {
                    PreparedStatement statement = conn.prepareStatement(insertQuery);
                    statement.setString(1, txtUser.getText());
                    statement.setString(2, txtPurpose.getText());
                    statement.setString(3, txtId.getText());
                    statement.setString(4, room);
                    statement.setString(5, date);
                    statement.setString(6, stime);
                    statement.setString(7, etime);
                    statement.setString(8, email);
                    int rowsInserted = statement.executeUpdate();

                    if (rowsInserted > 0) {
                        dispose();
                        String text = "Booking Room successfully.";
                        String url = "/bulibrary/image/tickAnimat.png";
                        WarningMessage warnmessage = new WarningMessage(new javax.swing.JFrame(),true,url,text);
                        warnmessage.setVisible(true);
                        StartApp.getInstance().changeOpacity( false);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }    
        } else {
            ErrorMessage.setText("Start time and date must be before end time.");
            System.out.println(selectedStartTime);
            System.out.println(selectedEndTime);
            System.out.println(currentTime);
            System.out.println(Thaidatenow);
            System.out.println(selectedDate);          
        }

    }//GEN-LAST:event_btnConfirmMouseClicked

    private void btnConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/ConfirmbtnEx.png"));
        btnConfirm.setIcon(icon);
    }//GEN-LAST:event_btnConfirmMouseEntered

    private void btnConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Confirmbtn.png"));
        btnConfirm.setIcon(icon);
    }//GEN-LAST:event_btnConfirmMouseExited

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        dispose();
        StartApp.getInstance().changeOpacity( false);
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/cancelbtn.png"));
        btnCancel.setIcon(icon);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/CANCEL_EXTED.png"));
        btnCancel.setIcon(icon);
    }//GEN-LAST:event_btnCancelMouseExited

    private void BgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BgMouseEntered
        CheckdateAndtime();
        String date = txtDate.getText();
        ArrayList<String> bookedStartTimes = new ArrayList<>();
        ArrayList<String> bookedEndTimes = new ArrayList<>();
        
        System.out.println(date);
        String selectQuery = "SELECT * FROM booking WHERE room = ? and date = ? ";
        DBConnect conn = new DBConnect();
        ResultSet rs = null;
        try {
            PreparedStatement Statement = conn.prepareStatement(selectQuery);
            Statement.setString(1, room);
            Statement.setString(2, date);
            rs = Statement.executeQuery();
            while (rs.next()) {
                String startTime = rs.getString("stime");
                String endTime = rs.getString("etime");
                bookedStartTimes.add(startTime);
                bookedEndTimes.add(endTime);
            }
            
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        for (String startTime : bookedStartTimes) {
            ComboStartTime.removeItem(startTime);
        }

        // ตรวจสอบ ComboBox ของเวลาสิ้นสุด
        for (String endTime : bookedEndTimes) {
            ComboEndTime.removeItem(endTime);
        }
        if (ComboStartTime.getSelectedItem() == null && ComboEndTime.getSelectedItem() == null) {
            Message.setText("The room is full.");
        } else{
            Message.setText("");
        }
    }//GEN-LAST:event_BgMouseEntered

    private void txtDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDateMouseClicked
        ComboStartTime.removeAllItems();
        ComboEndTime.removeAllItems();
        for (String startTime : originalStartTimes) {
            ComboStartTime.addItem(startTime);
        }
        for (String endTime : originalEndTimes) {
            ComboEndTime.addItem(endTime);
        }
        
        String date = txtDate.getText();
        ArrayList<String> bookedStartTimes = new ArrayList<>();
        ArrayList<String> bookedEndTimes = new ArrayList<>();
        
        System.out.println(date);
        String selectQuery = "SELECT * FROM booking WHERE room = ? and date = ? ";
        DBConnect conn = new DBConnect();
        ResultSet rs = null;
        try {
            PreparedStatement Statement = conn.prepareStatement(selectQuery);
            Statement.setString(1, room);
            Statement.setString(2, date);
            rs = Statement.executeQuery();
            while (rs.next()) {
                String startTime = rs.getString("stime");
                String endTime = rs.getString("etime");
                bookedStartTimes.add(startTime);
                bookedEndTimes.add(endTime);
            }
            
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        for (String startTime : bookedStartTimes) {
            ComboStartTime.removeItem(startTime);
        }

        for (String endTime : bookedEndTimes) {
            ComboEndTime.removeItem(endTime);
        }
        
        if (ComboStartTime.getSelectedItem() == null && ComboEndTime.getSelectedItem() == null) {
            Message.setText("The room is full.");
        } else{
            Message.setText("");
        }
    }//GEN-LAST:event_txtDateMouseClicked

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
            java.util.logging.Logger.getLogger(BookingRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BookingRoom dialog = new BookingRoom(new javax.swing.JFrame(), true,null,null,null,null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bg;
    private bulibrary.ClassJava.ComboBoxSuggestion ComboEndTime;
    private bulibrary.ClassJava.ComboBoxSuggestion ComboStartTime;
    private javax.swing.JLabel ErrorMessage;
    private javax.swing.JLabel Message;
    private javax.swing.JLabel Room;
    private javax.swing.JLabel btnCancel;
    private javax.swing.JLabel btnConfirm;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel icondate;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPurpose;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
