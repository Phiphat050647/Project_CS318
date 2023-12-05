/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bulibrary;

import java.awt.Desktop;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Mr.Phiphat
 */
public class JPHowtoPlay extends javax.swing.JPanel {

    private String url;
    public JPHowtoPlay(String boardGame) throws URISyntaxException {
        initComponents();
        
        if ("Spyfall".equals(boardGame)) {
            Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/booking/HPspyfall.png"));
            this.How.setIcon(icon);
            Icon VDO = new ImageIcon(getClass().getResource("/bulibrary/image/booking/HPspyfallVdo.png"));
            this.VDO.setIcon(VDO);
            this.url = "https://youtu.be/NntWh0xWB-k?si=GIUNS9mHt4Gkqrri&t=44" ;
        } else if ("Werewolf".equals(boardGame)){
            Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/booking/HPwerewolf.png"));
            this.How.setIcon(icon);
            Icon VDO = new ImageIcon(getClass().getResource("/bulibrary/image/booking/HPwerewolfVdo.png"));
            this.VDO.setIcon(VDO);
            this.url = "https://youtu.be/0OJ5zzjoqDw?si=ib6wquFgKSObprfs&t=160" ;
        } else if ("UNO".equals(boardGame)){
            Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/booking/HPUno.png"));
            this.How.setIcon(icon);
            Icon VDO = new ImageIcon(getClass().getResource("/bulibrary/image/booking/HPUnoVdo.png"));
            this.VDO.setIcon(VDO);
            this.url = "https://www.youtube.com/watch?v=hHEl0wnEV38" ;
        } else if ("Exploding kittens".equals(boardGame)){
            Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/booking/HPkitten.png"));
            this.How.setIcon(icon);
            Icon VDO = new ImageIcon(getClass().getResource("/bulibrary/image/booking/HPkittenVdo.png"));
            this.VDO.setIcon(VDO);
            this.url = "https://www.youtube.com/watch?v=0h1D1nq4eR0" ;
        } else if ("Salem 1692".equals(boardGame)){
            Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/booking/HPSalem.png"));
            this.How.setIcon(icon);
            Icon VDO = new ImageIcon(getClass().getResource("/bulibrary/image/booking/HPSalemVdo.png"));
            this.VDO.setIcon(VDO);
            this.url = "https://youtu.be/JEOXIi73Vso?si=cbVnGTZh9cvTp0fu&t=123" ;
        } else if ("I'm The Boss".equals(boardGame)){
            Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/booking/HPBoss.png"));
            this.How.setIcon(icon);
            Icon VDO = new ImageIcon(getClass().getResource("/bulibrary/image/booking/HPBossVdo.png"));
            this.VDO.setIcon(VDO);
            this.url = "https://youtu.be/kj0UBN-OcWQ?si=gYVsYsjXdkTvZJMs&t=289" ;
        } else if ("Sitting Duck Gallery".equals(boardGame)){
            Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/booking/HPduck.png"));
            this.How.setIcon(icon);
            Icon VDO = new ImageIcon(getClass().getResource("/bulibrary/image/booking/HPduckVdo.png"));
            this.VDO.setIcon(VDO);
            this.url = "https://www.youtube.com/watch?v=waUYviR6FAk" ;
        } else if ("Splendor".equals(boardGame)){
            Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/booking/HPsplendor.png"));
            this.How.setIcon(icon);
            Icon VDO = new ImageIcon(getClass().getResource("/bulibrary/image/booking/HPsplendorVdo.png"));
            this.VDO.setIcon(VDO);
            this.url = "https://youtu.be/2CEKDxuCSXk?si=8HxPrFfb2U0pt53w&t=68" ;
        } else {
            System.out.println("ไม่มีข้อมูล หรือ ไม่ตรงกับเงื่อนไข");
        }
    }

    public void OpenVideo(){
        try {
            String videoUrl = url ;
            URI uri = new URI(videoUrl);

            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(uri);
            } else {
                System.out.println("ไม่สามารถเปิดเบราว์เซอร์ได้");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VDO = new javax.swing.JLabel();
        How = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/booking/HPBossVdo.png"))); // NOI18N
        VDO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VDO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VDOMouseClicked(evt);
            }
        });
        add(VDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1060, 580));

        How.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/booking/HPBoss.png"))); // NOI18N
        add(How, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void VDOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VDOMouseClicked

        OpenVideo();
    }//GEN-LAST:event_VDOMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel How;
    private javax.swing.JLabel VDO;
    // End of variables declaration//GEN-END:variables
}
