/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

/**
 *
 * @author ACER
 */
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class MenuTransaksi extends javax.swing.JPanel {

    /**
     * Creates new form MenuTransaksi
     */
    public MenuTransaksi() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfAlamat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfTelp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbJenis = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbDurasi = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbMetode = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(808, 348));
        setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("Transaksi");

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nama");

        tfNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Alamat");

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("No.Telp");

        tfTelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTelpKeyTyped(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Jenis PC");

        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entery Level", "Mid-Range", "High-End" }));
        cbJenis.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbJenisItemStateChanged(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Durasi Pinjam");

        tfTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTotalActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Total Biaya");

        cbDurasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Hari", "2 Hari", "3 Hari", "4 Hari", "5 Hari", "6 Hari", "7 Hari" }));
        cbDurasi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDurasiItemStateChanged(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Metode Pembayaran");

        cbMetode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COD", "Transfer Bank", "Shopee Pay", "OVO", "Go Pay" }));

        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("CHECKOUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(tfAlamat)
                            .addComponent(tfTelp)
                            .addComponent(cbJenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(141, 141, 141)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(tfTotal)
                            .addComponent(jLabel7)
                            .addComponent(cbDurasi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addComponent(cbMetode, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDurasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMetode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        add(jPanel2, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void tfNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String query;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/rentalpc";
        SUser = "root";
        SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if("".equals(tfNama.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Nama lengkap kosong", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else if("".equals(tfAlamat.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Alamat Kosong", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else if("".equals(tfTelp.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "No.Telepon Kosong", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }else {
              
            String Nama = tfNama.getText(); 
            String Alamat= tfAlamat.getText();
            String Nomor = tfTelp.getText();
            String Jenis = (String)cbJenis.getSelectedItem();
            String Durasi = (String)cbDurasi.getSelectedItem();
            String total = tfTotal.getText();
            String metode = (String)cbMetode.getSelectedItem();
    
            
            query = "INSERT INTO transaksi (nama_peminjam, alamat, no_telp, nama_pc,durasi_pinjam, total_biaya,metode_pembayaran)"+
                    "VALUES('"+Nama+"', '"+Alamat+"' , '"+Nomor+"', '"+Jenis+"', '"+Durasi+"', '"+total+"', '"+metode+"')";
            
            st.execute(query);
                tfNama.setText("");
                tfAlamat.setText("");
                tfTelp.setText("");
                cbJenis.setSelectedIndex(0); // Mengosongkan JComboBox
                cbDurasi.setSelectedIndex(0); // Mengosongkan JComboBox
                tfTotal.setText("");
                 cbMetode.setSelectedIndex(0); // Mengosongkan JComboBox
            showMessageDialog(null, "Berhasil, Pesanan anda sedang di proses");

            }
        }catch(Exception e){
           System.out.println("Error!" + e.getMessage()); 
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTotalActionPerformed

    }//GEN-LAST:event_tfTotalActionPerformed

    private void updateTotal() {
            String jenisItem = (String) cbJenis.getSelectedItem();
            String durasiItem = (String) cbDurasi.getSelectedItem();
            int baseTotal = 0;  // Nilai dasar tfTotal

            // Atur nilai dasar berdasarkan pilihan di cbJenis
             switch (jenisItem) {
             case "Entery Level":
               baseTotal = 250000;
              break;
            case "Mid-Range":
               baseTotal = 350000;
            break;
            case "High-End":
               baseTotal = 450000;
            break;
             // Tambahkan case sesuai dengan kebutuhan
             }

            // Atur nilai tambahan berdasarkan pilihan di cbDurasi
            int durasiIndex = cbDurasi.getSelectedIndex();  // Indeks dimulai dari 0
            int additionalTotal = durasiIndex > 0 ? durasiIndex * 100000 : 0;

            // Hitung total akhir
            int total = baseTotal + additionalTotal;

             // Set nilai pada tfTotal
            tfTotal.setText(Integer.toString(total));    
    }
    private void cbJenisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbJenisItemStateChanged
        updateTotal();
    }//GEN-LAST:event_cbJenisItemStateChanged

    private void cbDurasiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDurasiItemStateChanged
        updateTotal();
    }//GEN-LAST:event_cbDurasiItemStateChanged

    private void tfTelpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelpKeyTyped
        
    }//GEN-LAST:event_tfTelpKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbDurasi;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JComboBox<String> cbMetode;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfTelp;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables


}
