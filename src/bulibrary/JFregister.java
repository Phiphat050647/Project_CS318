/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bulibrary;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Mr.Phiphat
 */
public class JFregister extends javax.swing.JFrame {

    public JFregister() {
        initComponents();
        setPreferredSize(new Dimension(1536, 864)); // กำหนดขนาด JFrame เป็น 800x600 pixels
        jP_Login.setVisible(false);
        pack(); // บรรจุขนาดที่กำหนดเข้าไปใน JFrame
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_Login_regis = new javax.swing.JPanel();
        jP_Register = new javax.swing.JPanel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtEmailRegis = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtTell = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtConpass = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        jP_Login = new javax.swing.JPanel();
        txtEmailLogin = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        btnSign = new javax.swing.JLabel();
        btnLogin = new javax.swing.JLabel();
        BG1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jP_Login_regis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jP_Register.setPreferredSize(new java.awt.Dimension(1536, 864));
        jP_Register.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFname.setForeground(new java.awt.Color(204, 204, 204));
        txtFname.setText("First name");
        txtFname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtFname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFname.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtFname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFnameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtFnameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFnameMouseExited(evt);
            }
        });
        txtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnameActionPerformed(evt);
            }
        });
        txtFname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFnameKeyPressed(evt);
            }
        });
        jP_Register.add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 130, 30));

        txtLname.setForeground(new java.awt.Color(204, 204, 204));
        txtLname.setText("Last name");
        txtLname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtLname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtLnameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtLnameMouseExited(evt);
            }
        });
        txtLname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLnameKeyPressed(evt);
            }
        });
        jP_Register.add(txtLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 130, 30));

        txtEmailRegis.setForeground(new java.awt.Color(204, 204, 204));
        txtEmailRegis.setText("Email");
        txtEmailRegis.setToolTipText("");
        txtEmailRegis.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtEmailRegis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEmailRegisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEmailRegisMouseExited(evt);
            }
        });
        txtEmailRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailRegisActionPerformed(evt);
            }
        });
        txtEmailRegis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailRegisKeyPressed(evt);
            }
        });
        jP_Register.add(txtEmailRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 290, 30));

        txtID.setForeground(new java.awt.Color(204, 204, 204));
        txtID.setText("Student ID");
        txtID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtID.setCaretColor(new java.awt.Color(204, 204, 204));
        txtID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtIDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtIDMouseExited(evt);
            }
        });
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
        });
        jP_Register.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 290, 30));

        txtTell.setForeground(new java.awt.Color(204, 204, 204));
        txtTell.setText("Tellnumber");
        txtTell.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtTell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtTellMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtTellMouseExited(evt);
            }
        });
        txtTell.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTellKeyPressed(evt);
            }
        });
        jP_Register.add(txtTell, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 290, 30));

        txtPass.setForeground(new java.awt.Color(204, 204, 204));
        txtPass.setText("Your Password");
        txtPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPassMouseExited(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        jP_Register.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 290, 30));

        txtConpass.setForeground(new java.awt.Color(204, 204, 204));
        txtConpass.setText("Confirm Password");
        txtConpass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtConpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtConpassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtConpassMouseExited(evt);
            }
        });
        txtConpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConpassActionPerformed(evt);
            }
        });
        txtConpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConpassKeyPressed(evt);
            }
        });
        jP_Register.add(txtConpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, 290, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Submit.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jP_Register.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 680, -1, 50));

        jLabel1.setFont(new java.awt.Font("Prompt", 0, 12)); // NOI18N
        jLabel1.setText("I already have an account login");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jP_Register.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 740, 190, 20));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Sign in & Sing up.png"))); // NOI18N
        jP_Register.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jP_Login_regis.add(jP_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, -1, 870));

        jP_Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmailLogin.setForeground(new java.awt.Color(204, 204, 204));
        txtEmailLogin.setText("Email address");
        txtEmailLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtEmailLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEmailLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEmailLoginMouseExited(evt);
            }
        });
        txtEmailLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailLoginActionPerformed(evt);
            }
        });
        txtEmailLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailLoginKeyPressed(evt);
            }
        });
        jP_Login.add(txtEmailLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 452, 290, 30));

        jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setText("YourPassword");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPasswordField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPasswordField1.setEchoChar('*');
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseExited(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        jP_Login.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 513, 290, 30));

        btnSign.setText("Don't have an account Sign up");
        btnSign.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignMouseExited(evt);
            }
        });
        jP_Login.add(btnSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 641, 170, -1));

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Submit_Login.png"))); // NOI18N
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        jP_Login.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 310, 40));

        BG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/jfLogin.png"))); // NOI18N
        jP_Login.add(BG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jP_Login_regis.add(jP_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jP_Login_regis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1536, 864));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtFnameActionPerformed

    private void txtFnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFnameMouseEntered
        if (txtFname.getText().equals("First name")) {
            txtFname.setText("");
            txtFname.setForeground(new Color(204, 204, 204));
        }
            
    }//GEN-LAST:event_txtFnameMouseEntered

    private void txtFnameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFnameMouseExited
        if (txtFname.getText().equals("")) {
            txtFname.setText("First name");
            txtFname.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtFnameMouseExited

    private void txtLnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLnameMouseEntered
        if (txtLname.getText().equals("Last name")) {
            txtLname.setText("");
            txtLname.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtLnameMouseEntered

    private void txtLnameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLnameMouseExited
        if (txtLname.getText().equals("")) {
            txtLname.setText("Last name");
            txtLname.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtLnameMouseExited

    private void txtEmailRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailRegisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailRegisActionPerformed

    private void txtEmailRegisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailRegisMouseEntered
        if (txtEmailRegis.getText().equals("Email")) {
            txtEmailRegis.setText("");
            txtEmailRegis.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtEmailRegisMouseEntered

    private void txtEmailRegisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailRegisMouseExited
        if (txtEmailRegis.getText().equals("")) {
            txtEmailRegis.setText("Email");
            txtEmailRegis.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtEmailRegisMouseExited

    private void txtConpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConpassActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtFnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFnameMouseClicked
        txtFname.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtFnameMouseClicked

    private void txtFnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFnameKeyPressed
        txtFname.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtFnameKeyPressed

    private void txtLnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLnameKeyPressed
        txtLname.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtLnameKeyPressed

    private void txtEmailRegisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailRegisKeyPressed
        txtEmailRegis.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtEmailRegisKeyPressed

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        txtID.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtIDKeyPressed

    private void txtIDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseEntered
        if (txtID.getText().equals("Student ID")) {
            txtID.setText("");
            txtID.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtIDMouseEntered

    private void txtIDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseExited
        if (txtID.getText().equals("")) {
            txtID.setText("Student ID");
            txtID.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtIDMouseExited

    private void txtTellKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTellKeyPressed
         txtTell.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtTellKeyPressed

    private void txtTellMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTellMouseEntered
        if (txtTell.getText().equals("Tellnumber")){
            txtTell.setText("");
            txtTell.setForeground(new Color(204, 204, 204));
       }
            
    }//GEN-LAST:event_txtTellMouseEntered

    private void txtTellMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTellMouseExited
        if (txtTell.getText().equals("")){
            txtTell.setText("Tellnumber");
            txtTell.setForeground(new Color(204, 204, 204));
       }
    }//GEN-LAST:event_txtTellMouseExited

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
         txtPass.setForeground(Color.black);
         
    }//GEN-LAST:event_txtPassKeyPressed

    private void txtPassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMouseEntered
        if (txtPass.getText().equals("Your Password")){
            txtPass.setText("");
            txtPass.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtPassMouseEntered

    private void txtPassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMouseExited
        if (txtPass.getText().equals("")){
            txtPass.setText("Your Password");
            txtPass.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtPassMouseExited

    private void txtConpassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConpassMouseEntered
        if (txtConpass.getText().equals("Confirm Password")){
            txtConpass.setText("");
            txtConpass.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtConpassMouseEntered

    private void txtConpassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConpassMouseExited
        if (txtConpass.getText().equals("")){
            txtConpass.setText("Confirm Password");
            txtConpass.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtConpassMouseExited

    private void txtConpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConpassKeyPressed
        txtConpass.setForeground(Color.black);
    }//GEN-LAST:event_txtConpassKeyPressed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setForeground(Color.red);
        jLabel1.setText("<html><u>I already have an account login</u></html>");
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setForeground(Color.black);
        jLabel1.setText("<html>I already have an account login</html>");
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered

        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Submit_Exted.png"));
        jLabel2.setIcon(icon);


    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Submit.png"));
        jLabel2.setIcon(icon);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        jP_Register.setVisible(false);
        jP_Login.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtEmailLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailLoginMouseEntered
        if (txtEmailLogin.getText().equals("Email address")) {
            txtEmailLogin.setText("");
            txtEmailLogin.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtEmailLoginMouseEntered

    private void txtEmailLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailLoginMouseExited
        if (txtEmailLogin.getText().equals("")) {
            txtEmailLogin.setText("Email address");
            txtEmailLogin.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtEmailLoginMouseExited

    private void txtEmailLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailLoginActionPerformed

    private void txtEmailLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailLoginKeyPressed
        txtEmailLogin.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtEmailLoginKeyPressed

    private void jPasswordField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseEntered
        char[] input = jPasswordField1.getPassword();
        String password = new String(input); // แปลงจาก char array เป็น String

        if (password.equals("YourPassword")) {
            jPasswordField1.setText("");
            jPasswordField1.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_jPasswordField1MouseEntered

    private void jPasswordField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseExited
        char[] input = jPasswordField1.getPassword();
        String password = new String(input); // แปลงจาก char array เป็น String

        if (password.equals("")) {
            jPasswordField1.setText("YourPassword");
            jPasswordField1.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_jPasswordField1MouseExited

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        jPasswordField1.setForeground(Color.black);
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Submit_Login_Exted.png"));
        btnLogin.setIcon(icon);
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Submit_Login.png"));
        btnLogin.setIcon(icon);
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnSignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignMouseClicked
        jP_Login.setVisible(false);
        jP_Register.setVisible(true);
    }//GEN-LAST:event_btnSignMouseClicked

    private void btnSignMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignMouseEntered

        btnSign.setText("<html><u>Don't have an account <font color='#0890FF'>Sign up</font></u></html>");

    }//GEN-LAST:event_btnSignMouseEntered

    private void btnSignMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignMouseExited
        btnSign.setText("<html>Don't have an account <font color='black'>Sign up</font></html>");
    }//GEN-LAST:event_btnSignMouseExited

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
            java.util.logging.Logger.getLogger(JFregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFregister().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel BG1;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel btnSign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jP_Login;
    private javax.swing.JPanel jP_Login_regis;
    private javax.swing.JPanel jP_Register;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField txtConpass;
    private javax.swing.JTextField txtEmailLogin;
    private javax.swing.JTextField txtEmailRegis;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtTell;
    // End of variables declaration//GEN-END:variables

    private void setOpaque(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
