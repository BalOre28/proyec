/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto2_progra;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author w
 */
public class TABLEROGHOSTS extends javax.swing.JFrame {

    private char TurnoJugador = '2';
    private String PosicionActual = null;
    private String PosicionNueva = null;
    private String PosicionAntigua = null;
    private Usuario User1;
    private Usuario User2;

    /**
     * Creates new form TABLEROGHOSTS
     */

    public TABLEROGHOSTS(Usuario usuario1, Usuario usuario2) {
        initComponents();
        User1 = usuario1;
        User2 = usuario2;

        this.setLocationRelativeTo(null);
        this.setTitle("GHOSTS");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        T00 = new javax.swing.JButton();
        T01 = new javax.swing.JButton();
        T02 = new javax.swing.JButton();
        T03 = new javax.swing.JButton();
        T04 = new javax.swing.JButton();
        T05 = new javax.swing.JButton();
        T10 = new javax.swing.JButton();
        T11 = new javax.swing.JButton();
        T12 = new javax.swing.JButton();
        T13 = new javax.swing.JButton();
        T14 = new javax.swing.JButton();
        T15 = new javax.swing.JButton();
        T20 = new javax.swing.JButton();
        T21 = new javax.swing.JButton();
        T22 = new javax.swing.JButton();
        T23 = new javax.swing.JButton();
        T24 = new javax.swing.JButton();
        T25 = new javax.swing.JButton();
        T30 = new javax.swing.JButton();
        T31 = new javax.swing.JButton();
        T32 = new javax.swing.JButton();
        T33 = new javax.swing.JButton();
        T34 = new javax.swing.JButton();
        T35 = new javax.swing.JButton();
        T40 = new javax.swing.JButton();
        T41 = new javax.swing.JButton();
        T42 = new javax.swing.JButton();
        T43 = new javax.swing.JButton();
        T44 = new javax.swing.JButton();
        T45 = new javax.swing.JButton();
        T50 = new javax.swing.JButton();
        T51 = new javax.swing.JButton();
        T52 = new javax.swing.JButton();
        T53 = new javax.swing.JButton();
        T54 = new javax.swing.JButton();
        T55 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setText(" SALIDA ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new java.awt.GridLayout(6, 6));

        T00.setBackground(new java.awt.Color(255, 255, 204));
        T00.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        T00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T00ActionPerformed(evt);
            }
        });
        jPanel2.add(T00);

        T01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyecto2_progra/TrueFantasma.1.png"))); // NOI18N
        T01.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        T01.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                T01MouseDragged(evt);
            }
        });
        T01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T01ActionPerformed(evt);
            }
        });
        jPanel2.add(T01);

        T02.setBackground(new java.awt.Color(255, 255, 204));
        T02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyecto2_progra/TrueFantasma.1.png"))); // NOI18N
        T02.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        T02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T02ActionPerformed(evt);
            }
        });
        jPanel2.add(T02);

        T03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyecto2_progra/TrueFantasma.1.png"))); // NOI18N
        T03.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T03);

        T04.setBackground(new java.awt.Color(255, 255, 204));
        T04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyecto2_progra/TrueFantasma.1.png"))); // NOI18N
        T04.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T04);

        T05.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        T05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T05ActionPerformed(evt);
            }
        });
        jPanel2.add(T05);

        T10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T10);

        T11.setBackground(new java.awt.Color(255, 255, 204));
        T11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyecto2_progra/TrueFantasma.1.png"))); // NOI18N
        T11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        T11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T11ActionPerformed(evt);
            }
        });
        jPanel2.add(T11);

        T12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyecto2_progra/TrueFantasma.1.png"))); // NOI18N
        T12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T12);

        T13.setBackground(new java.awt.Color(255, 255, 204));
        T13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyecto2_progra/TrueFantasma.1.png"))); // NOI18N
        T13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T13);

        T14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyecto2_progra/TrueFantasma.1.png"))); // NOI18N
        T14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T14);

        T15.setBackground(new java.awt.Color(255, 255, 204));
        T15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T15);

        T20.setBackground(new java.awt.Color(255, 255, 204));
        T20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T20);

        T21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        T21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T21ActionPerformed(evt);
            }
        });
        jPanel2.add(T21);

        T22.setBackground(new java.awt.Color(255, 255, 204));
        T22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T22);

        T23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        T23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T23ActionPerformed(evt);
            }
        });
        jPanel2.add(T23);

        T24.setBackground(new java.awt.Color(255, 255, 204));
        T24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T24);

        T25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T25);

        T30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T30);

        T31.setBackground(new java.awt.Color(255, 255, 204));
        T31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T31);

        T32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T32);

        T33.setBackground(new java.awt.Color(255, 255, 204));
        T33.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T33);

        T34.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        T34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T34ActionPerformed(evt);
            }
        });
        jPanel2.add(T34);

        T35.setBackground(new java.awt.Color(255, 255, 204));
        T35.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T35);

        T40.setBackground(new java.awt.Color(255, 255, 204));
        T40.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T40);

        T41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyecto2_progra/TrueFantasma.2.png"))); // NOI18N
        T41.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T41);

        T42.setBackground(new java.awt.Color(255, 255, 204));
        T42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyecto2_progra/TrueFantasma.2.png"))); // NOI18N
        T42.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T42);

        T43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyecto2_progra/TrueFantasma.2.png"))); // NOI18N
        T43.setToolTipText("");
        T43.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        T43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T43ActionPerformed(evt);
            }
        });
        jPanel2.add(T43);

        T44.setBackground(new java.awt.Color(255, 255, 204));
        T44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyecto2_progra/TrueFantasma.2.png"))); // NOI18N
        T44.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T44);

        T45.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T45);

        T50.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T50);

        T51.setBackground(new java.awt.Color(255, 255, 204));
        T51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyecto2_progra/TrueFantasma.2.png"))); // NOI18N
        T51.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T51);

        T52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyecto2_progra/TrueFantasma.2.png"))); // NOI18N
        T52.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T52);

        T53.setBackground(new java.awt.Color(255, 255, 204));
        T53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyecto2_progra/TrueFantasma.2.png"))); // NOI18N
        T53.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T53);

        T54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/proyecto2_progra/TrueFantasma.2.png"))); // NOI18N
        T54.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(T54);

        T55.setBackground(new java.awt.Color(255, 255, 204));
        T55.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        T55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T55ActionPerformed(evt);
            }
        });
        jPanel2.add(T55);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 450, 450));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("PLAYER 2");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("PLAYER 1");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, -1, -1));

        jButton37.setBackground(new java.awt.Color(255, 102, 102));
        jButton37.setText("RENDIRSE");
        jButton37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 70, -1));

        jButton38.setBackground(new java.awt.Color(255, 102, 102));
        jButton38.setText("RENDIRSE");
        jButton38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 70, -1));

        jLabel3.setText(" SALIDA ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jLabel4.setText(" SALIDA ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, -1, -1));

        jLabel6.setText(" SALIDA ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        jLabel7.setText(" SALIDA ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        JOptionPane.showMessageDialog(this, "PLAYER 1 SE HA RENDIDO");
        Usuario usuario = new Usuario(User1.getUsuario(), User1.getUsuario(), User1.getNombre(),(User1.getPuntos()+3));
        UsuarioLOGIC.modificar(usuario);
        this.dispose();
        PaginaPrincipal PP = new PaginaPrincipal(User1);
    }//GEN-LAST:event_jButton37ActionPerformed

    private void T23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T23ActionPerformed

    private void T43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T43ActionPerformed

    private void T55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T55ActionPerformed

    }//GEN-LAST:event_T55ActionPerformed

    private void T05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T05ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T05ActionPerformed

    private void T00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T00ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T00ActionPerformed

    private void T01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T01ActionPerformed

    private void T02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T02ActionPerformed

    private void T01MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T01MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_T01MouseDragged

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        JOptionPane.showMessageDialog(this, "PLAYER 2 SE HA RENDIDO");
        Usuario usuario = new Usuario(User2.getUsuario(), User2.getUsuario(), User2.getNombre(),(User2.getPuntos()+3));
        UsuarioLOGIC.modificar(usuario);
        
        this.dispose();
        PaginaPrincipal PP = new PaginaPrincipal(User1);

    }//GEN-LAST:event_jButton38ActionPerformed

    private void T11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T11ActionPerformed
        if (TurnoJugador == 2 && PosicionActual == null) {
            PosicionActual = "11";
        }
    }//GEN-LAST:event_T11ActionPerformed

    private void T21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T21ActionPerformed
        if (TurnoJugador == 2 && PosicionActual == null) {
            PosicionAntigua = "21";
        } else {
            PosicionNueva = "21";
            TableroLogicMain TLM = new TableroLogicMain(User1, User2);

            T21.setIcon(TLM.boton(PosicionAntigua).getIcon());
            TLM.boton(PosicionAntigua).setIcon(null);
        }
    }//GEN-LAST:event_T21ActionPerformed

    private void T34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T34ActionPerformed

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
            java.util.logging.Logger.getLogger(TABLEROGHOSTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TABLEROGHOSTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TABLEROGHOSTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TABLEROGHOSTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TABLEROGHOSTS(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton T00;
    public javax.swing.JButton T01;
    public javax.swing.JButton T02;
    public javax.swing.JButton T03;
    public javax.swing.JButton T04;
    public javax.swing.JButton T05;
    public javax.swing.JButton T10;
    public javax.swing.JButton T11;
    public javax.swing.JButton T12;
    public javax.swing.JButton T13;
    public javax.swing.JButton T14;
    public javax.swing.JButton T15;
    public javax.swing.JButton T20;
    public javax.swing.JButton T21;
    public javax.swing.JButton T22;
    public javax.swing.JButton T23;
    public javax.swing.JButton T24;
    public javax.swing.JButton T25;
    public javax.swing.JButton T30;
    public javax.swing.JButton T31;
    public javax.swing.JButton T32;
    public javax.swing.JButton T33;
    public javax.swing.JButton T34;
    public javax.swing.JButton T35;
    public javax.swing.JButton T40;
    public javax.swing.JButton T41;
    public javax.swing.JButton T42;
    public javax.swing.JButton T43;
    public javax.swing.JButton T44;
    public javax.swing.JButton T45;
    public javax.swing.JButton T50;
    public javax.swing.JButton T51;
    public javax.swing.JButton T52;
    public javax.swing.JButton T53;
    public javax.swing.JButton T54;
    public javax.swing.JButton T55;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
