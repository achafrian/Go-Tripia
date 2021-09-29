/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author AFRIAN
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public Menu() {
        initComponents();
        // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bt_1day = new javax.swing.JButton();
        bt_3day = new javax.swing.JButton();
        bt_2day = new javax.swing.JButton();
        bt_keluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bt_riwayat = new javax.swing.JButton();
        label_2day = new javax.swing.JLabel();
        label_3day = new javax.swing.JLabel();
        label_1day = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_daftarpulau = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(743, 495));
        jPanel1.setLayout(null);

        bt_1day.setFont(new java.awt.Font("Tw Cen MT", 1, 22)); // NOI18N
        bt_1day.setText("PAKET 1 DAY");
        bt_1day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_1dayActionPerformed(evt);
            }
        });
        jPanel1.add(bt_1day);
        bt_1day.setBounds(44, 322, 180, 50);

        bt_3day.setFont(new java.awt.Font("Tw Cen MT", 1, 22)); // NOI18N
        bt_3day.setText("PAKET 3 DAY");
        bt_3day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_3dayActionPerformed(evt);
            }
        });
        jPanel1.add(bt_3day);
        bt_3day.setBounds(519, 322, 180, 50);

        bt_2day.setFont(new java.awt.Font("Tw Cen MT", 1, 22)); // NOI18N
        bt_2day.setText("PAKET 2 DAY");
        bt_2day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_2dayActionPerformed(evt);
            }
        });
        jPanel1.add(bt_2day);
        bt_2day.setBounds(287, 322, 180, 50);

        bt_keluar.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        bt_keluar.setText("Keluar");
        bt_keluar.setToolTipText("");
        bt_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_keluarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_keluar);
        bt_keluar.setBounds(589, 481, 110, 40);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(331, 85, 94, 40);

        bt_riwayat.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        bt_riwayat.setText("Riwayat");
        bt_riwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_riwayatActionPerformed(evt);
            }
        });
        jPanel1.add(bt_riwayat);
        bt_riwayat.setBounds(44, 481, 110, 40);

        label_2day.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/pulau 1 (2).jpg"))); // NOI18N
        label_2day.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_2dayMouseClicked(evt);
            }
        });
        jPanel1.add(label_2day);
        label_2day.setBounds(300, 180, 154, 135);

        label_3day.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/pulau 1 (2).jpg"))); // NOI18N
        label_3day.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_3dayMouseClicked(evt);
            }
        });
        jPanel1.add(label_3day);
        label_3day.setBounds(531, 180, 154, 135);

        label_1day.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/pulau 1 (2).jpg"))); // NOI18N
        label_1day.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_1dayMouseClicked(evt);
            }
        });
        jPanel1.add(label_1day);
        label_1day.setBounds(57, 180, 154, 135);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("WELCOME TO GOTRIPIA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(194, 38, 371, 40);

        bt_daftarpulau.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        bt_daftarpulau.setText("Daftar Pulau");
        bt_daftarpulau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_daftarpulauActionPerformed(evt);
            }
        });
        jPanel1.add(bt_daftarpulau);
        bt_daftarpulau.setBounds(305, 481, 139, 40);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\KULIAH UIN MALANG\\kuliah semester 2\\Prak. PBO\\Project UAS\\bck senja (1).jpg")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 750, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_2dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_2dayActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new TwoDay().setVisible(true);
    }//GEN-LAST:event_bt_2dayActionPerformed

    private void bt_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_keluarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Anda Telah Keluar!", "Message", JOptionPane.WARNING_MESSAGE);
        this.setVisible(false);
        new FormLogin().setVisible(true);
    }//GEN-LAST:event_bt_keluarActionPerformed

    private void bt_1dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_1dayActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new OneDay().setVisible(true);
    }//GEN-LAST:event_bt_1dayActionPerformed

    private void bt_3dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_3dayActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ThreeDay().setVisible(true);
    }//GEN-LAST:event_bt_3dayActionPerformed

    private void bt_riwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_riwayatActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Riwayat().setVisible(true);
    }//GEN-LAST:event_bt_riwayatActionPerformed

    private void label_1dayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_1dayMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new OneDay().setVisible(true);
    }//GEN-LAST:event_label_1dayMouseClicked

    private void label_3dayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_3dayMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new ThreeDay().setVisible(true);
    }//GEN-LAST:event_label_3dayMouseClicked

    private void bt_daftarpulauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_daftarpulauActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new DaftarPulau().setVisible(true);
    }//GEN-LAST:event_bt_daftarpulauActionPerformed

    private void label_2dayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_2dayMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new TwoDay().setVisible(true);
    }//GEN-LAST:event_label_2dayMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_1day;
    private javax.swing.JButton bt_2day;
    private javax.swing.JButton bt_3day;
    private javax.swing.JButton bt_daftarpulau;
    private javax.swing.JButton bt_keluar;
    private javax.swing.JButton bt_riwayat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_1day;
    private javax.swing.JLabel label_2day;
    private javax.swing.JLabel label_3day;
    // End of variables declaration//GEN-END:variables
}
