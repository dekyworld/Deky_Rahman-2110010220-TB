/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rentalpc;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JOptionPane;
import view.AdminInfoPengguna;
import view.AdminInfoTransaksi;

/**
 *
 * @author ACER
 */
public class FUtamaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form FUtamaAdmin
     */
    public FUtamaAdmin() {
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

        jMenu1 = new javax.swing.JMenu();
        pn_navbar = new javax.swing.JPanel();
        btnInfoPengguna = new javax.swing.JLabel();
        btnInfoTransaksi = new javax.swing.JLabel();
        pn_dasar = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_navbar.setBackground(new java.awt.Color(204, 204, 255));

        btnInfoPengguna.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnInfoPengguna.setForeground(new java.awt.Color(51, 51, 51));
        btnInfoPengguna.setText("Informasi Pengguna");
        btnInfoPengguna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInfoPenggunaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInfoPenggunaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInfoPenggunaMouseExited(evt);
            }
        });

        btnInfoTransaksi.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnInfoTransaksi.setForeground(new java.awt.Color(51, 51, 51));
        btnInfoTransaksi.setText("Informasi Transaksi");
        btnInfoTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInfoTransaksiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInfoTransaksiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInfoTransaksiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_navbarLayout = new javax.swing.GroupLayout(pn_navbar);
        pn_navbar.setLayout(pn_navbarLayout);
        pn_navbarLayout.setHorizontalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_navbarLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnInfoPengguna)
                .addGap(47, 47, 47)
                .addComponent(btnInfoTransaksi)
                .addContainerGap(460, Short.MAX_VALUE))
        );
        pn_navbarLayout.setVerticalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_navbarLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfoPengguna)
                    .addComponent(btnInfoTransaksi))
                .addGap(26, 26, 26))
        );

        getContentPane().add(pn_navbar, java.awt.BorderLayout.PAGE_START);

        pn_dasar.setBackground(new java.awt.Color(204, 204, 255));

        pn_utama.setPreferredSize(new java.awt.Dimension(881, 336));
        pn_utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_dasarLayout = new javax.swing.GroupLayout(pn_dasar);
        pn_dasar.setLayout(pn_dasarLayout);
        pn_dasarLayout.setHorizontalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_dasarLayout.setVerticalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pn_dasar, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInfoPenggunaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoPenggunaMouseEntered
        btnInfoPengguna.setForeground(Color.PINK);
        btnInfoPengguna.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnInfoPenggunaMouseEntered

    private void btnInfoPenggunaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoPenggunaMouseExited
        btnInfoPengguna.setForeground(new Color(51,51,51));
        btnInfoPengguna.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); 
    }//GEN-LAST:event_btnInfoPenggunaMouseExited

    private void btnInfoTransaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoTransaksiMouseEntered
        btnInfoTransaksi.setForeground(Color.PINK);
        btnInfoTransaksi.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnInfoTransaksiMouseEntered

    private void btnInfoTransaksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoTransaksiMouseExited
        btnInfoTransaksi.setForeground(new Color(51,51,51));
        btnInfoTransaksi.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); 
    }//GEN-LAST:event_btnInfoTransaksiMouseExited

    private void btnInfoPenggunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoPenggunaMouseClicked
       btnInfoPengguna.setForeground(new Color(204,204,0));
       
       //btn list saat di klik
       pn_utama.removeAll();
       pn_utama.add(new AdminInfoPengguna());
       pn_utama.repaint();
       pn_utama.revalidate();
    }//GEN-LAST:event_btnInfoPenggunaMouseClicked

    private void btnInfoTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoTransaksiMouseClicked
       btnInfoTransaksi.setForeground(new Color(204,204,0));
       
       //btn list saat di klik
       pn_utama.removeAll();
       pn_utama.add(new AdminInfoTransaksi());
       pn_utama.repaint();
       pn_utama.revalidate();
    }//GEN-LAST:event_btnInfoTransaksiMouseClicked

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
            java.util.logging.Logger.getLogger(FUtamaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FUtamaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FUtamaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FUtamaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FUtamaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnInfoPengguna;
    private javax.swing.JLabel btnInfoTransaksi;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel pn_dasar;
    private javax.swing.JPanel pn_navbar;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables
}
