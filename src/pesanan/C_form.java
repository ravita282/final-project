/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesanan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class C_form extends javax.swing.JFrame {

    String kode, pilih="";
    String namaproduk;
    int harga, jumlah, hasil;
    /**
     * Creates new form Form
     */
    public C_form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
 regenerated by the C_form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txf_alamat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmb_kode1 = new javax.swing.JComboBox<>();
        txf_roti1 = new javax.swing.JTextField();
        txf_harga1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txf_jumlah1 = new javax.swing.JTextField();
        txf_total1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmb_kode2 = new javax.swing.JComboBox<>();
        txf_roti2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txf_jumlah2 = new javax.swing.JTextField();
        txf_total2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txf_harga2 = new javax.swing.JTextField();
        txf_totalkeseluruhan = new javax.swing.JTextField();
        cmb_hitung = new javax.swing.JButton();
        btn_pesan = new javax.swing.JButton();
        btn_kembali = new javax.swing.JButton();
        txf_nama = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txf_pengambilan = new javax.swing.JTextField();
        btn_lihat = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cmb_kemasan = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txf_jumlah3 = new javax.swing.JTextField();

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Pesanan\\menu.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("Form Pemesanan");

        jLabel3.setText("Nama");

        jLabel4.setText("Alamat");

        txf_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_alamatActionPerformed(evt);
            }
        });

        jLabel6.setText("Pilih Kode Roti");

        cmb_kode1.setBackground(new java.awt.Color(255, 153, 153));
        cmb_kode1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmb_kode1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "001", "002", "003", "004", "005", "006", "007", "008" }));
        cmb_kode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_kode1ActionPerformed(evt);
            }
        });

        txf_roti1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_roti1ActionPerformed(evt);
            }
        });

        txf_harga1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_harga1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Jumlah");

        jLabel10.setText("Total");

        txf_jumlah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_jumlah1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Pilih Kode Roti");

        cmb_kode2.setBackground(new java.awt.Color(255, 153, 153));
        cmb_kode2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmb_kode2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "001", "002", "003", "004", "005", "006", "007", "008" }));
        cmb_kode2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_kode2ActionPerformed(evt);
            }
        });

        txf_roti2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_roti2ActionPerformed(evt);
            }
        });

        jLabel12.setText("Jumlah");

        jLabel13.setText("Total");

        txf_jumlah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_jumlah2ActionPerformed(evt);
            }
        });

        jLabel14.setText("Total Keseluruhan");

        txf_harga2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_harga2ActionPerformed(evt);
            }
        });

        cmb_hitung.setBackground(new java.awt.Color(255, 153, 153));
        cmb_hitung.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmb_hitung.setText("Hitung");
        cmb_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_hitungActionPerformed(evt);
            }
        });

        btn_pesan.setBackground(new java.awt.Color(255, 153, 153));
        btn_pesan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_pesan.setForeground(new java.awt.Color(0, 204, 204));
        btn_pesan.setText("Pesan");
        btn_pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesanActionPerformed(evt);
            }
        });

        btn_kembali.setBackground(new java.awt.Color(255, 153, 153));
        btn_kembali.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_kembali.setForeground(new java.awt.Color(51, 204, 0));
        btn_kembali.setText("Kembali");
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });

        txf_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_namaActionPerformed(evt);
            }
        });

        jLabel7.setText("Pengambilan Pesanan");

        txf_pengambilan.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txf_pengambilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_pengambilanActionPerformed(evt);
            }
        });

        btn_lihat.setBackground(new java.awt.Color(255, 153, 153));
        btn_lihat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_lihat.setText("Lihat");
        btn_lihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lihatActionPerformed(evt);
            }
        });

        jLabel8.setText("Kemasan");

        cmb_kemasan.setBackground(new java.awt.Color(255, 153, 153));
        cmb_kemasan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmb_kemasan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Dus Kecil", "Plastik" }));
        cmb_kemasan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_kemasanActionPerformed(evt);
            }
        });

        jLabel15.setText("Jumlah");

        txf_jumlah3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_jumlah3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btn_kembali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_pesan)
                        .addGap(89, 89, 89))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txf_totalkeseluruhan, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txf_roti1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(54, 54, 54)
                                .addComponent(txf_jumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txf_harga1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txf_jumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txf_total1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_hitung, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txf_total2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txf_nama)
                                    .addComponent(txf_alamat)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txf_harga2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmb_kode2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmb_kode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txf_roti2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(cmb_kemasan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txf_jumlah3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_pengambilan, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_lihat)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(txf_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmb_kode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txf_roti1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txf_jumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txf_harga1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txf_total1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cmb_kode2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txf_roti2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txf_jumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txf_harga2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txf_total2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmb_kemasan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(txf_jumlah3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txf_totalkeseluruhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(cmb_hitung)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_lihat)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(txf_pengambilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_pesan)
                    .addComponent(btn_kembali))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_kode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_kode1ActionPerformed
        // TODO add your handling code here:
        kode= (String)cmb_kode1.getSelectedItem();
        if(kode=="001")
        {
            namaproduk = "Donat Cokelat";
            harga=2000;
        }else if (kode=="002")
        {
            namaproduk = "Bakpao Cokelat";
            harga = 2000;
        }else if (kode=="003")
        {
            namaproduk = "Pisang Cokelat";
            harga = 2000;
        }else if (kode=="004")
        {
            namaproduk = "Croissant";
            harga = 2500;
        }else if (kode=="005")
        {
            namaproduk = "Roti Abon";
            harga = 2500;
        }else if (kode=="006")
        {
            namaproduk = "Bolu Pelangi";
            harga = 2500;
        }else if (kode=="007")
        {
            namaproduk = "Putu Ayu";
            harga = 2000;
        }else if (kode=="008")
        {
            namaproduk = "Bolu Gulung";
            harga = 2000;
        }
        txf_roti1.setText(""+namaproduk);
        txf_harga1.setText(""+harga);
    }//GEN-LAST:event_cmb_kode1ActionPerformed

    private void txf_harga1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_harga1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_harga1ActionPerformed

    private void cmb_kode2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_kode2ActionPerformed
        // TODO add your handling code here:
        kode= (String)cmb_kode2.getSelectedItem();
        if(kode=="001")
        {
            namaproduk = "Donat Cokelat";
            harga=2000;
        }else if (kode=="002")
        {
            namaproduk = "Bakpao Cokelat";
            harga = 2000;
        }else if (kode=="003")
        {
            namaproduk = "Pisang Cokelat";
            harga = 2000;
        }else if (kode=="004")
        {
            namaproduk = "Croissant";
            harga = 2500;
        }else if (kode=="005")
        {
            namaproduk = "Roti Abon";
            harga = 2500;
        }else if (kode=="006")
        {
            namaproduk = "Bolu Pelangi";
            harga = 2500;
        }else if (kode=="007")
        {
            namaproduk = "Putu Ayu";
            harga = 2000;
        }else if (kode=="008")
        {
            namaproduk = "Bolu Gulung";
            harga = 2000;
        }
        txf_roti2.setText(""+namaproduk);
        txf_harga2.setText(""+harga);
    }//GEN-LAST:event_cmb_kode2ActionPerformed

    private void txf_roti2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_roti2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_roti2ActionPerformed

    private void txf_harga2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_harga2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_harga2ActionPerformed

    private void cmb_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_hitungActionPerformed
        // TODO add your handling code here:
        int harga1, jumlah1, total1;
        harga1 = Integer.parseInt(txf_harga1.getText());
        jumlah1 = Integer.parseInt(txf_jumlah1.getText());
        total1 = harga1*jumlah1;
        
        int harga2, jumlah2, total2;
        harga2 = Integer.parseInt(txf_harga2.getText());
        jumlah2 = Integer.parseInt(txf_jumlah2.getText());
        total2 = harga2*jumlah2;
        
        pilih= (String)cmb_kemasan.getSelectedItem();
        jumlah = Integer.parseInt(txf_jumlah3.getText());
        if(pilih=="Dus Kecil")
        {
            hasil=500*jumlah;
        }else if (pilih=="Plastik")
        {
            hasil=100*jumlah;
        }
        
        int totalkeseluruhan1;
        totalkeseluruhan1 = total1+total2+hasil;
        
        txf_total1.setText(Integer.toString(total1));
        txf_total2.setText(Integer.toString(total2));
        txf_totalkeseluruhan.setText(Integer.toString(totalkeseluruhan1));
    }//GEN-LAST:event_cmb_hitungActionPerformed

    private void txf_pengambilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_pengambilanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_pengambilanActionPerformed

    private void btn_lihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lihatActionPerformed
        // TODO add your handling code here:
        String pengambilan = "";
        int jumlah1 = Integer.parseInt(txf_jumlah1.getText());
        int jumlah2 = Integer.parseInt(txf_jumlah2.getText());
        int jumlah;
        jumlah = jumlah1+jumlah2;
        if(jumlah<100){
            pengambilan = "Tidak Dapat Diproses, Pesan Min 100 Biji";
        }else if(jumlah<=300){
            pengambilan = "1 Hari Setelah Pesanan Dibayar Penuh/Resi Dikirim";
        }else if(jumlah<=500){
            pengambilan = "2 Hari Setelah Pesanan Dibayar Penuh/Resi Dikirim";
        }else if(jumlah<=700){
            pengambilan = "3 Hari Setelah Pesanan Dibayar Penuh/Resi Dikirim";
        }else if(jumlah<=1000){
            pengambilan = "4 Hari Setelah Pesanan Dibayar Penuh/Resi Dikirim";
        }else if(jumlah<=2000){
            pengambilan = "6 Hari Setelah Pesanan Dibayar Penuh/Resi Dikirim";
        }else if(jumlah<=3000){
            pengambilan = "7 Hari Setelah Pesanan Dibayar Penuh/Resi Dikirim";
        }else if(jumlah<=5000){
            pengambilan = "10 Hari Setelah Pesanan Dibayar Penuh/Resi Dikirim";
        }else if(jumlah>=5000){
            pengambilan = "Hubungi Penjual : 087757124581";
        }
        txf_pengambilan.setText(""+pengambilan);
    }//GEN-LAST:event_btn_lihatActionPerformed

    private void txf_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_namaActionPerformed

    private void txf_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_alamatActionPerformed

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new B_dashboard().setVisible(true);
    }//GEN-LAST:event_btn_kembaliActionPerformed

    private void btn_pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesanActionPerformed
        // TODO add your handling code here:
        try{
        Koneksi ObjKoneksi = new Koneksi();
        Connection con = ObjKoneksi.bukaKoneksi();
        Statement st = con.createStatement();
        String sql = "INSERT INTO `pesan`(`Nama`, `Alamat`, `Roti1`, `Jumlah1`, `Roti2`, `Jumlah2`, `Kemasan`,"
                     + "`JumlahKemasan`,`Total`)VALUES ('"+txf_nama.getText()+"','"+txf_alamat.getText()
                     +"','"+txf_roti1.getText()+"','"+txf_jumlah1.getText()+"','"+txf_roti2.getText()+"','"
                     +txf_jumlah2.getText()+"','"+cmb_kemasan.getSelectedItem()
                     +"','"+txf_jumlah3.getText()+"','"+txf_totalkeseluruhan.getText()+"')";
            int row = st.executeUpdate(sql);
            
            if (row ==1){
                JOptionPane.showMessageDialog(null,"Pesanan Anda Telah Dicatat" +
                        ", Pesanan Akan Dibuat Setelah Membayar Lunas","Infomasi",JOptionPane.INFORMATION_MESSAGE);
                 
               con.close();
                }
    }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Pesanan Tidak Tercatat" +
                        ", Ulangi Pesanan Anda","Warning!!!",JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_btn_pesanActionPerformed

    private void txf_jumlah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_jumlah1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_jumlah1ActionPerformed

    private void txf_jumlah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_jumlah2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_jumlah2ActionPerformed

    private void cmb_kemasanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_kemasanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_kemasanActionPerformed

    private void txf_roti1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_roti1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_roti1ActionPerformed

    private void txf_jumlah3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_jumlah3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_jumlah3ActionPerformed

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
            java.util.logging.Logger.getLogger(C_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kembali;
    private javax.swing.JButton btn_lihat;
    private javax.swing.JButton btn_pesan;
    private javax.swing.JButton cmb_hitung;
    private javax.swing.JComboBox<String> cmb_kemasan;
    private javax.swing.JComboBox<String> cmb_kode1;
    private javax.swing.JComboBox<String> cmb_kode2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txf_alamat;
    private javax.swing.JTextField txf_harga1;
    private javax.swing.JTextField txf_harga2;
    private javax.swing.JTextField txf_jumlah1;
    private javax.swing.JTextField txf_jumlah2;
    private javax.swing.JTextField txf_jumlah3;
    private javax.swing.JTextField txf_nama;
    private javax.swing.JTextField txf_pengambilan;
    private javax.swing.JTextField txf_roti1;
    private javax.swing.JTextField txf_roti2;
    private javax.swing.JTextField txf_total1;
    private javax.swing.JTextField txf_total2;
    private javax.swing.JTextField txf_totalkeseluruhan;
    // End of variables declaration//GEN-END:variables
}
