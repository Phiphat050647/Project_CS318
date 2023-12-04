/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bulibrary.Nest;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author nattinun
 */
public class game extends javax.swing.JFrame {

  
    public game() {
        initComponents();
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
        bordgame = new javax.swing.JPanel();
        Buttonbordgame = new javax.swing.JLabel();
        SeleetSpyfall = new javax.swing.JLabel();
        Spyfall = new javax.swing.JLabel();
        SeleetWerewolf = new javax.swing.JLabel();
        Werewolf = new javax.swing.JLabel();
        SeleetUNO = new javax.swing.JLabel();
        UNO = new javax.swing.JLabel();
        SeleetExplodingKittens = new javax.swing.JLabel();
        ExplodingKittens = new javax.swing.JLabel();
        SeleetSalem = new javax.swing.JLabel();
        Salem = new javax.swing.JLabel();
        SeleetTheBoss = new javax.swing.JLabel();
        TheBoss = new javax.swing.JLabel();
        SeleetDuck = new javax.swing.JLabel();
        Duck = new javax.swing.JLabel();
        SeleetSplwndor = new javax.swing.JLabel();
        Splendor = new javax.swing.JLabel();
        BGwhite = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BGblue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menubar.setBackground(new java.awt.Color(255, 255, 255));
        Menubar.setOpaque(false);
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

        getContentPane().add(Menubar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bordgame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Buttonbordgame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonBordgame.png"))); // NOI18N
        Buttonbordgame.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, -20, 1));
        Buttonbordgame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buttonbordgame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonbordgameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonbordgameMouseExited(evt);
            }
        });
        bordgame.add(Buttonbordgame, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        SeleetSpyfall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgame.png"))); // NOI18N
        SeleetSpyfall.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SeleetSpyfall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SeleetSpyfallMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SeleetSpyfallMouseExited(evt);
            }
        });
        bordgame.add(SeleetSpyfall, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        Spyfall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/bordgame/spyfall.png"))); // NOI18N
        bordgame.add(Spyfall, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        SeleetWerewolf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgame.png"))); // NOI18N
        SeleetWerewolf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SeleetWerewolf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SeleetWerewolfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SeleetWerewolfMouseExited(evt);
            }
        });
        bordgame.add(SeleetWerewolf, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        Werewolf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/bordgame/Werewolf.png"))); // NOI18N
        bordgame.add(Werewolf, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        SeleetUNO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgame.png"))); // NOI18N
        SeleetUNO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SeleetUNO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SeleetUNOMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SeleetUNOMouseExited(evt);
            }
        });
        bordgame.add(SeleetUNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, -1, -1));

        UNO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/bordgame/UNO.png"))); // NOI18N
        bordgame.add(UNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, -1, -1));

        SeleetExplodingKittens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgame.png"))); // NOI18N
        SeleetExplodingKittens.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SeleetExplodingKittens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SeleetExplodingKittensMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SeleetExplodingKittensMouseExited(evt);
            }
        });
        bordgame.add(SeleetExplodingKittens, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 360, -1, -1));

        ExplodingKittens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ExplodingKittens.png"))); // NOI18N
        bordgame.add(ExplodingKittens, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 150, -1, -1));

        SeleetSalem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgame.png"))); // NOI18N
        SeleetSalem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SeleetSalem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SeleetSalemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SeleetSalemMouseExited(evt);
            }
        });
        bordgame.add(SeleetSalem, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 660, -1, -1));

        Salem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/bordgame/Salem.png"))); // NOI18N
        bordgame.add(Salem, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, -1));

        SeleetTheBoss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgame.png"))); // NOI18N
        SeleetTheBoss.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SeleetTheBoss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SeleetTheBossMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SeleetTheBossMouseExited(evt);
            }
        });
        bordgame.add(SeleetTheBoss, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 660, -1, -1));

        TheBoss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/bordgame/TheBoss.png"))); // NOI18N
        bordgame.add(TheBoss, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        SeleetDuck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgame.png"))); // NOI18N
        SeleetDuck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SeleetDuck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SeleetDuckMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SeleetDuckMouseExited(evt);
            }
        });
        bordgame.add(SeleetDuck, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 660, -1, -1));

        Duck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/bordgame/SittingDuckGallery.png"))); // NOI18N
        bordgame.add(Duck, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, -1, -1));

        SeleetSplwndor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgame.png"))); // NOI18N
        SeleetSplwndor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SeleetSplwndor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SeleetSplwndorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SeleetSplwndorMouseExited(evt);
            }
        });
        bordgame.add(SeleetSplwndor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 660, -1, -1));

        Splendor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/bordgame/Splendor.png"))); // NOI18N
        bordgame.add(Splendor, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 450, -1, -1));

        BGwhite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/bordgame/BGwhite.png"))); // NOI18N
        BGwhite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bordgame.add(BGwhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/Group 632536.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        bordgame.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 180, 80));

        BGblue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bulibrary/image/bordgame/BGblue.png"))); // NOI18N
        bordgame.add(BGblue, new org.netbeans.lib.awtextra.AbsoluteConstraints(-12, 0, 1280, -1));

        getContentPane().add(bordgame, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1270, 870));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void SeleetSpyfallMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeleetSpyfallMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgameEn.png"));
        SeleetSpyfall.setIcon(icon);
    }//GEN-LAST:event_SeleetSpyfallMouseEntered

    private void SeleetSpyfallMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeleetSpyfallMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgame.png"));
        SeleetSpyfall.setIcon(icon);
    }//GEN-LAST:event_SeleetSpyfallMouseExited

    private void SeleetWerewolfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeleetWerewolfMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgameEn.png"));
        SeleetWerewolf.setIcon(icon);
    }//GEN-LAST:event_SeleetWerewolfMouseEntered

    private void SeleetWerewolfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeleetWerewolfMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgame.png"));
        SeleetWerewolf.setIcon(icon);
    }//GEN-LAST:event_SeleetWerewolfMouseExited

    private void SeleetUNOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeleetUNOMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgameEn.png"));
        SeleetUNO.setIcon(icon);
    }//GEN-LAST:event_SeleetUNOMouseEntered

    private void SeleetUNOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeleetUNOMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgame.png"));
        SeleetUNO.setIcon(icon);
    }//GEN-LAST:event_SeleetUNOMouseExited

    private void ButtonbordgameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonbordgameMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonBordgameEn.png"));
        Buttonbordgame.setIcon(icon);
    }//GEN-LAST:event_ButtonbordgameMouseEntered

    private void ButtonbordgameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonbordgameMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonBordgame.png"));
        Buttonbordgame.setIcon(icon);
    }//GEN-LAST:event_ButtonbordgameMouseExited

    private void SeleetExplodingKittensMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeleetExplodingKittensMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgameEn.png"));
        SeleetExplodingKittens.setIcon(icon);
    }//GEN-LAST:event_SeleetExplodingKittensMouseEntered

    private void SeleetExplodingKittensMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeleetExplodingKittensMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgame.png"));
        SeleetExplodingKittens.setIcon(icon);
    }//GEN-LAST:event_SeleetExplodingKittensMouseExited

    private void SeleetSalemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeleetSalemMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgameEn.png"));
        SeleetSalem.setIcon(icon);
    }//GEN-LAST:event_SeleetSalemMouseEntered

    private void SeleetSalemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeleetSalemMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgame.png"));
        SeleetSalem.setIcon(icon);
    }//GEN-LAST:event_SeleetSalemMouseExited

    private void SeleetTheBossMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeleetTheBossMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgameEn.png"));
        SeleetTheBoss.setIcon(icon);
    }//GEN-LAST:event_SeleetTheBossMouseEntered

    private void SeleetTheBossMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeleetTheBossMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgame.png"));
        SeleetTheBoss.setIcon(icon);
    }//GEN-LAST:event_SeleetTheBossMouseExited

    private void SeleetDuckMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeleetDuckMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgameEn.png"));
        SeleetDuck.setIcon(icon);
    }//GEN-LAST:event_SeleetDuckMouseEntered

    private void SeleetDuckMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeleetDuckMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgame.png"));
        SeleetDuck.setIcon(icon);
    }//GEN-LAST:event_SeleetDuckMouseExited

    private void SeleetSplwndorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeleetSplwndorMouseEntered
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgameEn.png"));
        SeleetSplwndor.setIcon(icon);
    }//GEN-LAST:event_SeleetSplwndorMouseEntered

    private void SeleetSplwndorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeleetSplwndorMouseExited
        Icon icon = new ImageIcon(getClass().getResource("/bulibrary/image/bordgame/ButtonSeleetBoardgame.png"));
        SeleetSplwndor.setIcon(icon);
    }//GEN-LAST:event_SeleetSplwndorMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Howtoplay howplay = new Howtoplay() ;
        howplay.setVisible(true);
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
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel BGblue;
    private javax.swing.JLabel BGwhite;
    private javax.swing.JLabel Buttonbordgame;
    private javax.swing.JLabel Duck;
    private javax.swing.JLabel ExplodingKittens;
    private javax.swing.JPanel Menubar;
    private javax.swing.JLabel Salem;
    private javax.swing.JLabel SeleetDuck;
    private javax.swing.JLabel SeleetExplodingKittens;
    private javax.swing.JLabel SeleetSalem;
    private javax.swing.JLabel SeleetSplwndor;
    private javax.swing.JLabel SeleetSpyfall;
    private javax.swing.JLabel SeleetTheBoss;
    private javax.swing.JLabel SeleetUNO;
    private javax.swing.JLabel SeleetWerewolf;
    private javax.swing.JLabel Splendor;
    private javax.swing.JLabel Spyfall;
    private javax.swing.JLabel TheBoss;
    private javax.swing.JLabel UNO;
    private javax.swing.JLabel Werewolf;
    private javax.swing.JPanel bordgame;
    private javax.swing.JLabel btnBookGame;
    private javax.swing.JLabel btnBooking;
    private javax.swing.JLabel btnBookroom;
    private javax.swing.JLabel btnExite;
    private javax.swing.JLabel btnLogo;
    private javax.swing.JLabel btnUser;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void setMenu(boolean b, boolean b0, boolean b1, boolean b2, boolean b3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
