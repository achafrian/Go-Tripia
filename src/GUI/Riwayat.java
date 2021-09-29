/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Objek.Paket1Day;
import Objek.Paket2Day;
import Objek.Paket3Day;
import Objek.WisataPulau;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ach. Afrian Auliansyah
 */
public class Riwayat extends javax.swing.JFrame {
    
    WisataPulau ondy = new Paket1Day();
    WisataPulau ontw = new Paket2Day();
    WisataPulau onth = new Paket3Day();
    
    public DefaultTableModel model;
    private ResultSet hasil;
    /**
     * Creates new form Riwayat
     */
    public Riwayat() {
        initComponents();
        // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
       
        //DATA PAKET 1 DAY
        String[] judul1 = {"Nama Pemesan","Pulau","Tanggal","Paket Harga"};
        model = new DefaultTableModel(judul1, 0);
        tabeldata_riwayat.setModel(model);
        tabelday1();
        tabelday2();
        tabelday3();
    }
    
    //TABEL DAY 1
    public void tabelday1() {
        try {
            hasil = ondy.PrintData();
            while (hasil.next()) {
                ondy.setNama(hasil.getString("Nama Pemesan"));
                ondy.setPulau(hasil.getString("Pulau"));
                ondy.setTanggal(hasil.getString("Tanggal"));
                ondy.setPaketharga(hasil.getString("Paket Harga"));

                String[] data = {ondy.getNama(), ondy.getPulau(), ondy.getTanggal(), ondy.getPaketharga()};
                model.addRow(data);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    //TABEL DAY 2
    public void tabelday2() {
        try {
            hasil = ontw.PrintData();
            while (hasil.next()) {
                ontw.setNama(hasil.getString("Nama Pemesan"));
                ontw.setPulau(hasil.getString("Pulau"));
                ontw.setTanggal(hasil.getString("Tanggal"));
                ontw.setPaketharga(hasil.getString("Paket Harga"));

                String[] data = {ontw.getNama(), ontw.getPulau(), ontw.getTanggal(), ontw.getPaketharga()};
                model.addRow(data);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    //TABEL DAY 3
    public void tabelday3() {
        try {
            hasil = onth.PrintData();
            while (hasil.next()) {
                onth.setNama(hasil.getString("Nama Pemesan"));
                onth.setPulau(hasil.getString("Pulau"));
                onth.setTanggal(hasil.getString("Tanggal"));
                onth.setPaketharga(hasil.getString("Paket Harga"));

                String[] data = {onth.getNama(), onth.getPulau(), onth.getTanggal(), onth.getPaketharga()};
                model.addRow(data);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldata_riwayat = new javax.swing.JTable();
        bt_menu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RIWAYAT PEMESANAN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(199, 38, 356, 40);

        tabeldata_riwayat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama Pemesan", "Pulau", "Tanggal", "Paket Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabeldata_riwayat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldata_riwayatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldata_riwayat);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(86, 143, 563, 271);

        bt_menu.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        bt_menu.setText("Menu");
        bt_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_menuActionPerformed(evt);
            }
        });
        jPanel1.add(bt_menu);
        bt_menu.setBounds(594, 487, 110, 40);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\KULIAH UIN MALANG\\kuliah semester 2\\Prak. PBO\\Project UAS\\bck senja (1).jpg")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 750, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_bt_menuActionPerformed

    private void tabeldata_riwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldata_riwayatMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tabeldata_riwayatMouseClicked

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
            java.util.logging.Logger.getLogger(Riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Riwayat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeldata_riwayat;
    // End of variables declaration//GEN-END:variables
}
