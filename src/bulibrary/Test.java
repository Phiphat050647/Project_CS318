package bulibrary;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.util.*;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Test extends javax.swing.JFrame {


    public Test() {
        setUndecorated(true);
        initComponents();
        setPreferredSize(new Dimension(1536, 864)); // กำหนดขนาด JFrame เป็น 800x600 pixels
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));

        Container c = getContentPane();
        c.removeAll();
        jPMainmenu1.setVisible(true);
        c.add(jPMainmenu1);
        pack();
        
    }

//  kuykkk
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
