package bulibrary;

import com.raven.datechooser.SelectedDate;
import java.awt.Color;
import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.miginfocom.swing.MigLayout;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author Mr.Phiphat
 */
public class RoomStatus extends javax.swing.JDialog {

    /**
     * Creates new form RoomStatus
     */
    public RoomStatus(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        ScrollBarCustom sp = new ScrollBarCustom();
        scrData.setVerticalScrollBar(new ScrollBarCustom());
        scrData.setHorizontalScrollBar(sp);
        scrData.getViewport().setBackground(Color.WHITE);
        pnelData.setLayout(new MigLayout("inset 0, fillx, wrap", "[fill]"));
        LoadStatus();
    }
    public  void LoadStatus(){
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/boxTime.png"));
        Component add = pnelData.add(new JPStatus("09:00", "11:00", "ผู้จอง : เบญญทิพย์ ผดาจิตร คณะ : เทคโนโลยีสารสนเทศและนวัตกรรม",icon));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        txtDate = new javax.swing.JTextField();
        icondate = new javax.swing.JLabel();
        btnNow = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        scrData = new javax.swing.JScrollPane();
        pnelData = new javax.swing.JPanel();
        Bg = new javax.swing.JLabel();

        dateChooser1.setTextRefernce(txtDate);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDate.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtDate.setForeground(new java.awt.Color(153, 153, 153));
        txtDate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 107, 130, 20));

        icondate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Room/dateicon.png"))); // NOI18N
        icondate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icondate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icondateMouseClicked(evt);
            }
        });
        getContentPane().add(icondate, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 106, 20, 20));

        btnNow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Room/now.png"))); // NOI18N
        btnNow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNowMouseClicked(evt);
            }
        });
        getContentPane().add(btnNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 102, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poppins ExtraLight", 0, 16)); // NOI18N
        jLabel2.setText("Room 5");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Room/btnsearch.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 102, -1, -1));

        scrData.setBorder(null);

        pnelData.setBackground(new java.awt.Color(255, 255, 255));
        pnelData.setLayout(new javax.swing.OverlayLayout(pnelData));
        scrData.setViewportView(pnelData);

        getContentPane().add(scrData, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 400, 330));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Room/Booking status.png"))); // NOI18N
        getContentPane().add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 20, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void icondateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icondateMouseClicked
        dateChooser1.showPopup();
    }//GEN-LAST:event_icondateMouseClicked

    private void btnNowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNowMouseClicked
        dateChooser1.toDay();
    }//GEN-LAST:event_btnNowMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        SelectedDate d = dateChooser1.getSelectedDate();
        System.out.println(d.getDay() + d.getMonth() + d.getYear());
        
        String room = "Room6"; 
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(d.getDay());
        System.out.println(txtDate.getText());
        
        
        String selectQuery = "SELECT * FROM booking WHERE room = ? and date = ? ";
        DBConnect conn = new DBConnect();
        ResultSet rs = null;
        
        try {
            PreparedStatement Statement = conn.prepareStatement(selectQuery);
            Statement.setString(1, room);
            Statement.setString(2, date);
            rs = Statement.executeQuery();
            
            while (rs.next()) {
                String user = rs.getString("user");
                String startTime = rs.getString("Stime");
                String endTime = rs.getString("Etime");
                String purpose = rs.getString("porpose");
                String id = rs.getString("id");
                java.sql.Date dateb = rs.getDate("date");
                
                System.out.println("User: " + user + ", Start Time: " + startTime + ", End Time: " + endTime + ", Purpose: " + purpose + ", ID: " + id + ",Date :" + dateb);
            }
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }





        
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(RoomStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RoomStatus dialog = new RoomStatus(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel btnNow;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel icondate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnelData;
    private javax.swing.JScrollPane scrData;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables
}