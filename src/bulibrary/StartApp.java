/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bulibrary;

import bulibrary.ClassJava.UserData;
import bulibrary.ClassJava.DBConnect;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.util.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *S
 * @author Mr.Phiphat
 */
public class StartApp extends javax.swing.JFrame {
    
    public List<UserData>  userList = new ArrayList<>();
    private static StartApp instance = null;
    
    public StartApp( ) {
        setUndecorated(true);
        initComponents();
        setPreferredSize(new Dimension(1536, 864)); // กำหนดขนาด JFrame เป็น 800x600 pixels
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        opacity.setVisible(false);
        opacity1.setVisible(false);
        pack(); // บรรจุขนาดที่กำหนดเข้าไปใน JFrame
    
    }
    public List<UserData> getUserlist(){
        return userList;
    }
    public static StartApp getInstance() {
        if (instance == null) {
            instance = new StartApp();
        }
        return instance;
    }
    public void changeOpacity(boolean opacity){
        this.opacity.setVisible(opacity);
        this.opacity1.setVisible(opacity);
    }
    public void changePanelVisibility(boolean isLoginVisible, boolean isRegisterVisible,boolean isMenu) {
        jP_Login.setVisible(isLoginVisible);
        jP_Register.setVisible(isRegisterVisible);
        startMenu1.setVisible(isMenu);
        
    }
    
    public void clearFields(){
        txtFname.setText("First name");
        txtLname.setText("Last name");
        txtEmailRegis.setText("Email");
        txtID.setText("Student ID");
        txtTell.setText("Tellnumber");
        txtPass.setText("Your Password");
        txtPass.setEchoChar('\0');
        txtConpass.setText("Confirm Password");
        txtConpass.setEchoChar('\0');
        txtFname.setForeground(new Color(204, 204, 204));
        txtLname.setForeground(new Color(204, 204, 204));
        txtEmailRegis.setForeground(new Color(204, 204, 204));
        txtID.setForeground(new Color(204, 204, 204));
        txtTell.setForeground(new Color(204, 204, 204));
        txtPass.setForeground(new Color(204, 204, 204));
        txtConpass.setForeground(new Color(204, 204, 204));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_Login_regis = new javax.swing.JPanel();
        jP_Login = new javax.swing.JPanel();
        btnclose = new javax.swing.JLabel();
        opacity1 = new javax.swing.JLabel();
        txtEmailLogin = new javax.swing.JTextField();
        txtpasslogin = new javax.swing.JPasswordField();
        btnSign = new javax.swing.JLabel();
        btnLogin = new javax.swing.JLabel();
        BG1 = new javax.swing.JLabel();
        jP_Register = new javax.swing.JPanel();
        btnclose1 = new javax.swing.JLabel();
        opacity = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtEmailRegis = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtTell = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        txtConpass = new javax.swing.JPasswordField();
        btnCreateAccount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        startMenu1 = new bulibrary.StartMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jP_Login_regis.setBackground(new java.awt.Color(255, 255, 255));
        jP_Login_regis.setForeground(new java.awt.Color(255, 255, 255));
        jP_Login_regis.setOpaque(false);
        jP_Login_regis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jP_Login.setOpaque(false);
        jP_Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnclose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/CrossExit.png"))); // NOI18N
        btnclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncloseMouseClicked(evt);
            }
        });
        jP_Login.add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 10, -1, -1));

        opacity1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/opacity.png"))); // NOI18N
        opacity1.setText("jLabel4");
        jP_Login.add(opacity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -18, 1540, 900));

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

        txtpasslogin.setForeground(new java.awt.Color(204, 204, 204));
        txtpasslogin.setText("YourPassword");
        txtpasslogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtpasslogin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtpasslogin.setEchoChar('*');
        txtpasslogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtpassloginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtpassloginMouseExited(evt);
            }
        });
        txtpasslogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassloginActionPerformed(evt);
            }
        });
        txtpasslogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassloginKeyPressed(evt);
            }
        });
        jP_Login.add(txtpasslogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 513, 290, 30));

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
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

        jP_Register.setOpaque(false);
        jP_Register.setPreferredSize(new java.awt.Dimension(1536, 864));
        jP_Register.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnclose1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnclose1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/CrossExit.png"))); // NOI18N
        btnclose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnclose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclose1MouseClicked(evt);
            }
        });
        jP_Register.add(btnclose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 10, -1, -1));

        opacity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/opacity.png"))); // NOI18N
        opacity.setText("jLabel4");
        jP_Register.add(opacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -18, 1540, 900));

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLnameMouseClicked(evt);
            }
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
        txtEmailRegis.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmailRegis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailRegisMouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDMouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTellMouseClicked(evt);
            }
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
        txtPass.setBorder(null);
        txtPass.setEchoChar('\u0000');
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
        });
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPassMouseExited(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        jP_Register.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 572, 280, 30));

        txtConpass.setForeground(new java.awt.Color(204, 204, 204));
        txtConpass.setText("Confirm Password");
        txtConpass.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtConpass.setEchoChar('\u0000');
        txtConpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConpassMouseClicked(evt);
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
        jP_Register.add(txtConpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 625, 280, 30));

        btnCreateAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Submit.png"))); // NOI18N
        btnCreateAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreateAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreateAccountMouseExited(evt);
            }
        });
        jP_Register.add(btnCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 680, -1, 50));

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
        jP_Login_regis.add(startMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_Login_regis, javax.swing.GroupLayout.PREFERRED_SIZE, 1536, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_Login_regis, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtFnameActionPerformed

    private void txtFnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFnameMouseEntered
    
    }//GEN-LAST:event_txtFnameMouseEntered

    private void txtFnameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFnameMouseExited
        if (txtFname.getText().equals("")) {
            txtFname.setText("First name");
            txtFname.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtFnameMouseExited

    private void txtLnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLnameMouseEntered

    }//GEN-LAST:event_txtLnameMouseEntered

    private void txtLnameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLnameMouseExited
        if (txtLname.getText().equals(" ")) {
            txtLname.setText("Last name");
            txtLname.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtLnameMouseExited

    private void txtEmailRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailRegisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailRegisActionPerformed

    private void txtEmailRegisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailRegisMouseEntered

    }//GEN-LAST:event_txtEmailRegisMouseEntered

    private void txtEmailRegisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailRegisMouseExited
        if (txtEmailRegis.getText().equals("")) {
            txtEmailRegis.setText("Email");
            txtEmailRegis.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtEmailRegisMouseExited

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtFnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFnameMouseClicked
        if (txtFname.getText().equals("First name")){
            txtFname.setText("");
            txtFname.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtFnameMouseClicked

    private void txtFnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFnameKeyPressed
        if (txtFname.getText().equals("First name")){
            txtFname.setText("");
            txtFname.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtFnameKeyPressed

    private void txtLnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLnameKeyPressed
        if (txtLname.getText().equals("Last name")){
            txtLname.setText("");
            txtLname.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtLnameKeyPressed

    private void txtEmailRegisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailRegisKeyPressed
        if (txtEmailRegis.getText().equals("Email")){
            txtEmailRegis.setText("");
            txtEmailRegis.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtEmailRegisKeyPressed

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        if (txtID.getText().equals("Student ID")) {
            txtID.setText("");
            txtID.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtIDKeyPressed

    private void txtIDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseEntered
        
    }//GEN-LAST:event_txtIDMouseEntered

    private void txtIDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseExited
        if (txtID.getText().equals("")) {
            txtID.setText("Student ID");
            txtID.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtIDMouseExited

    private void txtTellKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTellKeyPressed
        if (txtTell.getText().equals("Tellnumber")){
            txtTell.setText("");
            txtTell.setForeground(Color.black);
       }
    }//GEN-LAST:event_txtTellKeyPressed

    private void txtTellMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTellMouseEntered
 
    }//GEN-LAST:event_txtTellMouseEntered

    private void txtTellMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTellMouseExited
        if (txtTell.getText().equals("")){
            txtTell.setText("Tellnumber");
            txtTell.setForeground(new Color(204, 204, 204));
       }
    }//GEN-LAST:event_txtTellMouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setForeground(Color.red);
        jLabel1.setText("<html><u>I already have an account login</u></html>");
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setForeground(Color.black);
        jLabel1.setText("<html>I already have an account login</html>");
    }//GEN-LAST:event_jLabel1MouseExited

    private void btnCreateAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateAccountMouseEntered

        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Submit_Exted.png"));
        btnCreateAccount.setIcon(icon);


    }//GEN-LAST:event_btnCreateAccountMouseEntered

    private void btnCreateAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateAccountMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Submit.png"));
        btnCreateAccount.setIcon(icon);
    }//GEN-LAST:event_btnCreateAccountMouseExited

    private void btnCreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateAccountMouseClicked
        System.out.println("User clicked button.");
        
        String fname = txtFname.getText();
        String lname = txtLname.getText();
        String email = txtEmailRegis.getText();
        String id = txtID.getText();
        String tell = txtTell.getText();
        String pass = txtPass.getText();
        String confirmpass = txtConpass.getText();
        

        if (fname.isEmpty() || fname.equals("First name")) {
            String text = "Please enter first name.";
            String url = "/bulibrary/image/crossAnimat.png";
            WarningMessage warnmessage = new WarningMessage(new javax.swing.JFrame(),true,url,text);
            warnmessage.setVisible(true);
        } else if (lname.isEmpty() || lname.equals("Last name")) {
            String text = "Please enter last name. .";
            String url = "/bulibrary/image/crossAnimat.png";
            WarningMessage warnmessage = new WarningMessage(new javax.swing.JFrame(),true,url,text);
            warnmessage.setVisible(true);
        } else if (email.isEmpty() || email.equals("Email")) {
            String text = "Please enter email address.";
            String url = "/bulibrary/image/crossAnimat.png";
            WarningMessage warnmessage = new WarningMessage(new javax.swing.JFrame(),true,url,text);
            warnmessage.setVisible(true);
  
        } else if (id.isEmpty() || id.equals("Student ID"))  {
            String text = "Please enter student ID.";
            String url = "/bulibrary/image/crossAnimat.png";
            WarningMessage warnmessage = new WarningMessage(new javax.swing.JFrame(),true,url,text);
            warnmessage.setVisible(true);
        } else if (tell.isEmpty() || tell.equals("Tellnumber")) {
            String text = "Please enter telephone number.";
            String url = "/bulibrary/image/crossAnimat.png";
            WarningMessage warnmessage = new WarningMessage(new javax.swing.JFrame(),true,url,text);
            warnmessage.setVisible(true);
        } else if (pass.isEmpty() || confirmpass.isEmpty() || pass.equals("Your Password") || confirmpass.equals("Confirm Password")) {
            String text = "Please enter your password.";
            String url = "/bulibrary/image/crossAnimat.png";
            WarningMessage warnmessage = new WarningMessage(new javax.swing.JFrame(),true,url,text);
            warnmessage.setVisible(true);
        } else if (!pass.equals(confirmpass)) {
            String text = "Please confirm the password correctly.";
            String url = "/bulibrary/image/crossAnimat.png";
            WarningMessage warnmessage = new WarningMessage(new javax.swing.JFrame(),true,url,text);
            warnmessage.setVisible(true);
//        } else if (!id.equals("Student ID") || id.length() != 10 || !id.matches("\\d+")) {
//            if (!id.matches("\\d+")) {
//                // กรณี ID ไม่เป็น "Student ID" และไม่เป็นตัวเลขทั้งหมด
//                String text = "Student ID is incorrect!!";
//                String url = "/bulibrary/image/crossAnimat.png";
//                WarningMessage warnmessage = new WarningMessage(new javax.swing.JFrame(),true,url,text);
//                warnmessage.setVisible(true);
//            }
//        } else if (!tell.equals("Tellnumber") || tell.length() != 10 || !tell.matches("\\d+")) {
//            if (!tell.matches("\\d+")) {
//                // กรณี ID ไม่เป็น "Student ID" และไม่เป็นตัวเลขทั้งหมด
//                String text = "Telephone number is incorrect!!";
//                String url = "/bulibrary/image/crossAnimat.png";
//                WarningMessage warnmessage = new WarningMessage(new javax.swing.JFrame(),true,url,text);
//                warnmessage.setVisible(true);
//            }
        } else {
            UserData user = UserData.getInstane();
            user.setFirstName(fname);
            user.setLastName(lname);
            user.setEmail(email);
            user.setPhoneNumber(tell);
            user.setStudentId(id);
            user.setPassword(pass);
            userList.add(user);
            System.out.println(user.getFirstName());

            // ทำการลงทะเบียนผู้ใช้งานเสร็จสิ้น
            String warning = "Are you confirm Register";
            DialogRegister dialog = new DialogRegister(new javax.swing.JFrame(), true, user,warning);
            dialog.setVisible(true);
        }
    }//GEN-LAST:event_btnCreateAccountMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        StartApp.getInstance().changePanelVisibility(true, false,false);
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

    private void txtpassloginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassloginMouseEntered
        char[] input = txtpasslogin.getPassword();
        String password = new String(input); // แปลงจาก char array เป็น String

        if (password.equals("YourPassword")) {
            txtpasslogin.setText("");
            txtpasslogin.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtpassloginMouseEntered

    private void txtpassloginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassloginMouseExited
        char[] input = txtpasslogin.getPassword();
        String password = new String(input); // แปลงจาก char array เป็น String

        if (password.equals("")) {
            txtpasslogin.setText("YourPassword");
            txtpasslogin.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtpassloginMouseExited

    private void txtpassloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassloginActionPerformed

    private void txtpassloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassloginKeyPressed
        txtpasslogin.setForeground(Color.black);
    }//GEN-LAST:event_txtpassloginKeyPressed

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Submit_Login_Exted.png"));
        btnLogin.setIcon(icon);
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Submit_Login.png"));
        btnLogin.setIcon(icon);
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnSignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignMouseClicked
        StartApp.getInstance().changePanelVisibility(false, true,false);
    }//GEN-LAST:event_btnSignMouseClicked

    private void btnSignMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignMouseEntered

        btnSign.setText("<html><u>Don't have an account <font color='#0890FF'>Sign up</font></u></html>");

    }//GEN-LAST:event_btnSignMouseEntered

    private void btnSignMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignMouseExited
        btnSign.setText("<html>Don't have an account <font color='black'>Sign up</font></html>");
    }//GEN-LAST:event_btnSignMouseExited

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassFocusGained

    private void txtConpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConpassActionPerformed

    private void txtPassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMouseExited
        if (txtPass.getText().equals("")){
            txtPass.setText("Your Password");
            txtPass.setForeground(new Color(204, 204, 204));
            txtPass.setEchoChar('\0');
            
        }
    }//GEN-LAST:event_txtPassMouseExited

    private void txtPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMouseClicked
        if (txtPass.getText().equals("Your Password")) {
            txtPass.setText("");
            txtPass.setForeground(Color.black);
            txtPass.setEchoChar('*');
        }
    }//GEN-LAST:event_txtPassMouseClicked

    private void txtConpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConpassMouseClicked
        if (txtConpass.getText().equals("Confirm Password")) {
            txtConpass.setText("");
            txtConpass.setForeground(Color.black);
            txtConpass.setEchoChar('*');
        }
    }//GEN-LAST:event_txtConpassMouseClicked

    private void txtConpassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConpassMouseExited
        if (txtConpass.getText().equals("")) {
            txtConpass.setText("Confirm Password");
            txtConpass.setForeground(new Color(204, 204, 204));
            txtConpass.setEchoChar('\0');
        }
    }//GEN-LAST:event_txtConpassMouseExited

    private void txtTellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTellMouseClicked
        if (txtTell.getText().equals("Tellnumber")){
            txtTell.setText("");
            txtTell.setForeground(Color.BLACK);
       }
    }//GEN-LAST:event_txtTellMouseClicked

    private void txtIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseClicked
        if (txtID.getText().equals("Student ID")) {
            txtID.setText("");
            txtID.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtIDMouseClicked

    private void txtEmailRegisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailRegisMouseClicked
        if (txtEmailRegis.getText().equals("Email")){
            txtEmailRegis.setText("");
            txtEmailRegis.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtEmailRegisMouseClicked

    private void txtLnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLnameMouseClicked
        if (txtLname.getText().equals("Last name")){
            txtLname.setText("");
            txtLname.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtLnameMouseClicked

    private void btncloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseClicked
        dispose();
        System.exit(0);
    }//GEN-LAST:event_btncloseMouseClicked

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        txtPass.setForeground(Color.black);
    }//GEN-LAST:event_txtPassKeyPressed

    private void txtConpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConpassKeyPressed
        txtPass.setForeground(Color.black);
    }//GEN-LAST:event_txtConpassKeyPressed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        String email = txtEmailLogin.getText();
        String pass = txtpasslogin.getText();

        if (email.isEmpty() || email.equals("Email address")) {
            String text = "Please enter email address.";
            String url = "/bulibrary/image/crossAnimat.png";
            WarningMessage warnmessage = new WarningMessage(new javax.swing.JFrame(), true, url, text);
            warnmessage.setVisible(true);
        } else if (pass.isEmpty() || pass.equals("YourPassword")) {
            String text = "Please enter your password.";
            String url = "/bulibrary/image/crossAnimat.png";
            WarningMessage warnmessage = new WarningMessage(new javax.swing.JFrame(), true, url, text);
            warnmessage.setVisible(true);
        } else {
            DBConnect conn = new DBConnect();
            String query = "SELECT * FROM user WHERE email = ? AND password = ?";

            try {
                PreparedStatement statement = conn.prepareStatement(query);
                statement.setString(1, email);
                statement.setString(2, pass);
                ResultSet rs = statement.executeQuery();
                if (rs.next()) {
                    UserData user = UserData.getInstane();
                    // แทนที่ชื่อคอลัมน์และตำแหน่งที่ต้องการเก็บ
                    user.setFirstName(rs.getString("fname"));
                    user.setLastName(rs.getString("lname"));
                    user.setEmail(rs.getString("Email"));
                    user.setPhoneNumber(rs.getString("phone"));
                    user.setStudentId(rs.getString("studentid"));
                    user.setPassword(rs.getString("password"));

                    // คำนวณเงื่อนไขเมื่อเข้าสู่ระบบสำเร็จ
                    String text = "Login Successful!";
                    String url = "/bulibrary/image/tickAnimat.png";
                    WarningMessage warnmessage = new WarningMessage(new javax.swing.JFrame(), true, url, text);
                    warnmessage.setVisible(true);
                    changePanelVisibility(false, false,true);
                    startMenu1.setSting();
                } else {
                    // คำนวณเงื่อนไขเมื่อเข้าสู่ระบบไม่สำเร็จ
                    String text = "Invalid email or password.";
                    String url = "/bulibrary/image/crossAnimat.png";
                    WarningMessage warnmessage = new WarningMessage(new javax.swing.JFrame(), true, url, text);
                    warnmessage.setVisible(true);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                conn.close();
            }
        }

    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnclose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclose1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnclose1MouseClicked

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
            java.util.logging.Logger.getLogger(StartApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StartApp registerFrame = StartApp.getInstance();
                registerFrame.setVisible(true);
                // เปลี่ยนการแสดงผลของพาแนลต่าง ๆ
                registerFrame.changePanelVisibility(true, false,false);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel BG1;
    private javax.swing.JLabel btnCreateAccount;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel btnSign;
    private javax.swing.JLabel btnclose;
    private javax.swing.JLabel btnclose1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jP_Login;
    private javax.swing.JPanel jP_Login_regis;
    private javax.swing.JPanel jP_Register;
    private javax.swing.JLabel opacity;
    private javax.swing.JLabel opacity1;
    private bulibrary.StartMenu startMenu1;
    private javax.swing.JPasswordField txtConpass;
    private javax.swing.JTextField txtEmailLogin;
    private javax.swing.JTextField txtEmailRegis;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLname;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtTell;
    private javax.swing.JPasswordField txtpasslogin;
    // End of variables declaration//GEN-END:variables

    private void setOpaque(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
