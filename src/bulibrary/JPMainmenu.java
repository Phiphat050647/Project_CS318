/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bulibrary;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;

/**
 *
 * @author Mr.Phiphat
 */
public class JPMainmenu extends javax.swing.JPanel {
        private String firstName;
        private String lastName;
        private String email;
        private String studentId;
        private String phoneNumber;
        private String password;
    /**
     * Creates new form JPMainmenu  public JPMainmenu() {
        initComponents();
    }
     */
    public JPMainmenu() {
        initComponents();
        setPreferredSize(new Dimension(1536, 864)); // กำหนดขนาดของ JPanel เพื่อให้ตรงกับ Test
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        scroll.setHorizontalScrollBar(sp);
        scroll.getViewport().setBackground(Color.WHITE);
        scrollMainmenu.setVerticalScrollBar(new ScrollBarCustom());
        scrollMainmenu.setHorizontalScrollBar(sp);
        scrollMainmenu.getViewport().setBackground(Color.WHITE);
        
    }
    
    
    
    public void setString(UserData user){
        firstName = user.getFirstName();
        lastName = user.getLastName();
        email = user.getEmail();
        studentId = user.getStudentId();
        phoneNumber = user.getPhoneNumber();
        password = user.getPassword();
        setTxtProfile();
    }
    public void setTxtProfile(){
        txtFname.setText(firstName);
        txtlname.setText(lastName);
        txtEmail.setText(email);
        txtID.setText(studentId);
        txtPhone.setText(phoneNumber);
        txtPass.setText(password);
   }
    public  void setMenu(boolean isUser,boolean isGmae,boolean isRoom,boolean isbooking,boolean ismain){
        User.setVisible(isUser);
        game.setVisible(isGmae);
        Room.setVisible(isRoom);
        Booking.setVisible(isbooking);
        mainmenu.setVisible(ismain);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menubar = new javax.swing.JPanel();
        btnLogo = new javax.swing.JLabel();
        btnUser = new javax.swing.JLabel();
        btnBookroom = new javax.swing.JLabel();
        btnBookGame = new javax.swing.JLabel();
        btnBooking = new javax.swing.JLabel();
        btnExite = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        User = new javax.swing.JPanel();
        txtlname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JLabel();
        Bg = new javax.swing.JLabel();
        game = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        mainmenu = new javax.swing.JPanel();
        scrollMainmenu = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Bgmain = new javax.swing.JLabel();
        Room = new javax.swing.JPanel();
        Booking = new javax.swing.JPanel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menubar.setBackground(new java.awt.Color(255, 255, 255));
        Menubar.setOpaque(false);
        Menubar.setPreferredSize(new java.awt.Dimension(354, 864));
        Menubar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/BU library.png"))); // NOI18N
        btnLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoMouseClicked(evt);
            }
        });
        Menubar.add(btnLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        btnUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/User.png"))); // NOI18N
        btnUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUserMouseExited(evt);
            }
        });
        Menubar.add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 250, 280, 50));

        btnBookroom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBookroom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/booking room.png"))); // NOI18N
        btnBookroom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBookroom.setPreferredSize(new java.awt.Dimension(166, 31));
        btnBookroom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookroomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBookroomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBookroomMouseExited(evt);
            }
        });
        Menubar.add(btnBookroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 350, 280, 60));

        btnBookGame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBookGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/BookingGame.png"))); // NOI18N
        btnBookGame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBookGame.setPreferredSize(new java.awt.Dimension(166, 31));
        btnBookGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookGameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBookGameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBookGameMouseExited(evt);
            }
        });
        Menubar.add(btnBookGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 450, 280, 50));

        btnBooking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/LIstBooking.png"))); // NOI18N
        btnBooking.setToolTipText("");
        btnBooking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBooking.setPreferredSize(new java.awt.Dimension(166, 31));
        btnBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBookingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBookingMouseExited(evt);
            }
        });
        Menubar.add(btnBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 550, 280, 50));

        btnExite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/Exit.png"))); // NOI18N
        btnExite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExite.setPreferredSize(new java.awt.Dimension(166, 31));
        btnExite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExiteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExiteMouseExited(evt);
            }
        });
        Menubar.add(btnExite, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 790, 280, 50));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/Rectangle 4598.png"))); // NOI18N
        Menubar.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(Menubar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        User.setBackground(new java.awt.Color(255, 255, 255));
        User.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtlname.setText("First name");
        txtlname.setBorder(null);
        User.add(txtlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 278, 270, 30));

        txtEmail.setText("First name");
        txtEmail.setBorder(null);
        User.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 260, 30));

        txtFname.setText("First name");
        txtFname.setBorder(null);
        User.add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 278, 270, 30));

        txtID.setText("First name");
        txtID.setBorder(null);
        User.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 445, 570, 30));

        txtPass.setText("First name");
        txtPass.setBorder(null);
        User.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, 570, 30));

        txtPhone.setText("First name");
        txtPhone.setBorder(null);
        User.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 270, 30));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/btnProfile.png"))); // NOI18N
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        User.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 610, -1, -1));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/Profile edite.png"))); // NOI18N
        User.add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 600, 700));

        add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1280, 870));

        game.setBackground(new java.awt.Color(236, 248, 255));
        game.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroll.setBackground(new java.awt.Color(255, 255, 255));
        scroll.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        scroll.setForeground(new java.awt.Color(255, 255, 255));
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setToolTipText("");
        scroll.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        scroll.setAlignmentX(10.0F);
        scroll.setAlignmentY(10.0F);
        scroll.setAutoscrolls(true);
        scroll.setColumnHeaderView(null);
        scroll.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scroll.setNextFocusableComponent(jPanel4);
        scroll.setOpaque(false);
        scroll.setViewportView(btnUpdate);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Kuy");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1220, 90, 60));

        jLabel3.setText("Kuy");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 60));

        scroll.setViewportView(jPanel4);

        game.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 1170, 750));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/Bgscroll.png"))); // NOI18N
        game.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1230, 810));

        add(game, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -8, 1280, 890));

        mainmenu.setBackground(new java.awt.Color(255, 255, 255));

        scrollMainmenu.setBackground(new java.awt.Color(255, 255, 255));
        scrollMainmenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        scrollMainmenu.setForeground(new java.awt.Color(255, 255, 255));
        scrollMainmenu.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollMainmenu.setToolTipText("");
        scrollMainmenu.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        scrollMainmenu.setAlignmentX(10.0F);
        scrollMainmenu.setAlignmentY(10.0F);
        scrollMainmenu.setAutoscrolls(true);
        scrollMainmenu.setColumnHeaderView(null);
        scrollMainmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrollMainmenu.setNextFocusableComponent(jPanel4);
        scrollMainmenu.setOpaque(false);
        scrollMainmenu.setViewportView(btnUpdate);

        jPanel1.setLayout(new javax.swing.OverlayLayout(jPanel1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/btnRoommain.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/btnGamemain.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        Bgmain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/หน้าหลัก.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(741, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(125, 125, 125))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Bgmain)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(340, 340, 340)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(947, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Bgmain)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2);

        scrollMainmenu.setViewportView(jPanel1);

        javax.swing.GroupLayout mainmenuLayout = new javax.swing.GroupLayout(mainmenu);
        mainmenu.setLayout(mainmenuLayout);
        mainmenuLayout.setHorizontalGroup(
            mainmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(mainmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainmenuLayout.createSequentialGroup()
                    .addContainerGap(44, Short.MAX_VALUE)
                    .addComponent(scrollMainmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 1187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(49, Short.MAX_VALUE)))
        );
        mainmenuLayout.setVerticalGroup(
            mainmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
            .addGroup(mainmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainmenuLayout.createSequentialGroup()
                    .addComponent(scrollMainmenu, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        add(mainmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1280, 870));

        Room.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout RoomLayout = new javax.swing.GroupLayout(Room);
        Room.setLayout(RoomLayout);
        RoomLayout.setHorizontalGroup(
            RoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        RoomLayout.setVerticalGroup(
            RoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
        );

        add(Room, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1280, -1));

        Booking.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout BookingLayout = new javax.swing.GroupLayout(Booking);
        Booking.setLayout(BookingLayout);
        BookingLayout.setHorizontalGroup(
            BookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        BookingLayout.setVerticalGroup(
            BookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );

        add(Booking, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1280, 870));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseEntered
        Icon ulicon = btnUser.getIcon();
        String uliconURL = ulicon.toString();
        
        Icon normal = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/User.png"));
        Icon click = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/UserEn.png"));
        Icon en = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/UserEnnew.png"));
        
        if (uliconURL.equals(click.toString())) {
            System.out.println("Ok");
        } else {
            btnUser.setIcon(en);
        }
        
    }//GEN-LAST:event_btnUserMouseEntered

    private void btnUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseExited
        Icon ulicon = btnUser.getIcon();
        String uliconURL = ulicon.toString();
        
        Icon normal = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/User.png"));
        Icon click = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/UserEn.png"));
        Icon en = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/UserEnnew.png"));
        
        if (uliconURL.equals(click.toString())) {
            System.out.println("Ok");
        } else {
            btnUser.setIcon(normal);
        }
    }//GEN-LAST:event_btnUserMouseExited

    private void btnBookroomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookroomMouseEntered
        Icon ulicon = btnBookroom.getIcon();
        String uliconURL = ulicon.toString();
        
        Icon normal = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/booking room.png"));
        Icon click = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/booking roomEn.png"));
        Icon en = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/booking roomEnnew.png"));
        
        if (uliconURL.equals(click.toString())) {
            System.out.println("Ok");
        } else {
            btnBookroom.setIcon(en);
        }
        
    }//GEN-LAST:event_btnBookroomMouseEntered

    private void btnBookroomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookroomMouseExited
        Icon ulicon = btnBookroom.getIcon();
        String uliconURL = ulicon.toString();
        
        Icon normal = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/booking room.png"));
        Icon click = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/booking roomEn.png"));
        Icon en = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/booking roomEnnew.png"));
        
        if (uliconURL.equals(click.toString())) {
            System.out.println("Ok");
        } else {
            btnBookroom.setIcon(normal);
        }
    }//GEN-LAST:event_btnBookroomMouseExited

    private void btnBookGameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookGameMouseEntered
        Icon ulicon = btnBookGame.getIcon();
        String uliconURL = ulicon.toString();
        
        Icon normal = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/BookingGame.png"));
        Icon click = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/BookingGameEn.png"));
        Icon en = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/BookingGameEnnew.png"));
        
        if (uliconURL.equals(click.toString())) {
            System.out.println("Ok");
        } else {
            btnBookGame.setIcon(en);
        }
    }//GEN-LAST:event_btnBookGameMouseEntered

    private void btnBookGameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookGameMouseExited
        Icon ulicon = btnBookGame.getIcon();
        String uliconURL = ulicon.toString();
        
        Icon normal = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/BookingGame.png"));
        Icon click = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/BookingGameEn.png"));
        Icon en = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/BookingGameEnnew.png"));
        
        if (uliconURL.equals(click.toString())) {
            System.out.println("Ok");
        } else {
            btnBookGame.setIcon(normal);
        }
    }//GEN-LAST:event_btnBookGameMouseExited

    private void btnBookingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingMouseEntered
        Icon ulicon = btnBooking.getIcon();
        String uliconURL = ulicon.toString();
        
        Icon normal = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/LIstBooking.png"));
        Icon click = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/LIstBookingEn.png"));
        Icon en = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/LIstBookingEnnew.png"));
        
        if (uliconURL.equals(click.toString())) {
            System.out.println("Ok");
        } else {
            btnBooking.setIcon(en);
        }
    }//GEN-LAST:event_btnBookingMouseEntered

    private void btnBookingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingMouseExited
        Icon ulicon = btnBooking.getIcon();
        String uliconURL = ulicon.toString();
        
        Icon normal = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/LIstBooking.png"));
        Icon click = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/LIstBookingEn.png"));
        Icon en = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/LIstBookingEnnew.png"));
        
        if (uliconURL.equals(click.toString())) {
            System.out.println("Ok");
        } else {
            btnBooking.setIcon(normal);
        }
    }//GEN-LAST:event_btnBookingMouseExited

    private void btnExiteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExiteMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/ExitEnnew.png"));
        btnExite.setIcon(icon);
    }//GEN-LAST:event_btnExiteMouseEntered

    private void btnExiteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExiteMouseExited
        
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/Exit.png"));
        btnExite.setIcon(icon);
    }//GEN-LAST:event_btnExiteMouseExited

    private void btnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseClicked
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/UserEn.png"));
        btnUser.setIcon(icon);
        setMenu(true,false,false,false,false);
        
        
        Icon icongame = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/BookingGame.png"));
        Icon iconbook = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/LIstBooking.png"));
        Icon iconroom = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/booking room.png"));
        
        btnBookGame.setIcon(icongame);
        btnBooking.setIcon(iconbook);
        btnBookroom.setIcon(iconroom);

    }//GEN-LAST:event_btnUserMouseClicked

    private void btnBookroomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookroomMouseClicked
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/booking roomEn.png"));
        btnBookroom.setIcon(icon);
        setMenu(false,false,true,false,false);
        
        Icon iconuser = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/User.png"));
        Icon icongame = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/BookingGame.png"));
        Icon iconbook = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/LIstBooking.png"));
        
        btnUser.setIcon(iconuser);
        btnBookGame.setIcon(icongame);
        btnBooking.setIcon(iconbook);
        
    }//GEN-LAST:event_btnBookroomMouseClicked
//
    private void btnBookGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookGameMouseClicked
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/BookingGameEn.png"));
        btnBookGame.setIcon(icon);
        setMenu(false,true,false,false,false);
        
        Icon iconuser = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/User.png"));
        Icon iconbook = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/LIstBooking.png"));
        Icon iconroom = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/booking room.png"));
       
        btnUser.setIcon(iconuser);
        btnBooking.setIcon(iconbook);
        btnBookroom.setIcon(iconroom);
    }//GEN-LAST:event_btnBookGameMouseClicked

    private void btnBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingMouseClicked
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/LIstBookingEn.png"));
        btnBooking.setIcon(icon);
        setMenu(false,false,false,true,false);
        
        Icon iconuser = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/User.png"));
        Icon icongame = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/BookingGame.png"));
        Icon iconroom = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/booking room.png"));
        
        btnUser.setIcon(iconuser);
        btnBookGame.setIcon(icongame);
        btnBookroom.setIcon(iconroom);
    }//GEN-LAST:event_btnBookingMouseClicked

    private void btnLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoMouseClicked
        setMenu(false,false,false,false,true);
        
        Icon iconuser = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/User.png"));
        Icon icongame = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/BookingGame.png"));
        Icon iconbook = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/LIstBooking.png"));
        Icon iconroom = new ImageIcon(getClass().getResource("/bulibrary/image/Iconmenubar/booking room.png"));
        
        btnUser.setIcon(iconuser);
        btnBookGame.setIcon(icongame);
        btnBooking.setIcon(iconbook);
        btnBookroom.setIcon(iconroom);
    }//GEN-LAST:event_btnLogoMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        setMenu(false,false,true,false,false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        setMenu(false,true,false,false,false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        
        UserData user = new UserData();
            user.setFirstName(txtFname.getText());
            user.setLastName(txtlname.getText());
            user.setEmail(txtEmail.getText());
            user.setPhoneNumber(txtPhone.getText());
            user.setStudentId(txtID.getText());
            user.setPassword(txtPass.getText());


            // ทำการลงทะเบียนผู้ใช้งานเสร็จสิ้น
            String warning = "Are you confirm ChangProfile";
            DialogUpdate dialog = new DialogUpdate(new javax.swing.JFrame(), true, user,warning);
            dialog.setVisible(true);
            
            
            
    }//GEN-LAST:event_btnUpdateMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Bg;
    private javax.swing.JLabel Bgmain;
    private javax.swing.JPanel Booking;
    private javax.swing.JPanel Menubar;
    private javax.swing.JPanel Room;
    private javax.swing.JPanel User;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnBookGame;
    private javax.swing.JLabel btnBooking;
    private javax.swing.JLabel btnBookroom;
    private javax.swing.JLabel btnExite;
    private javax.swing.JLabel btnLogo;
    private javax.swing.JLabel btnUpdate;
    private javax.swing.JLabel btnUser;
    private javax.swing.JPanel game;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel mainmenu;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scrollMainmenu;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtlname;
    // End of variables declaration//GEN-END:variables
}
