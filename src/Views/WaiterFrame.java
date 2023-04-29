package Views;

import javax.swing.table.DefaultTableModel;

import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.*;

public class WaiterFrame extends JInternalFrame {
    public DefaultTableModel tabModel;
    public DefaultTableModel tabModelPesanan;
    public DefaultTableModel tabModelKeranjang;

    LocalDateTime now = LocalDateTime.now();


    public WaiterFrame() {
        initComponents();
//        name.setText(data[0]);
//        roles.setText(data[2]);

        judul();
        judulPesanan();
        judulKeranjang();
        tampilData("");
        tampilDataPesanan("");
        tampilDataMeja();
        tampilDataKeranjang();

        menu_id.setEnabled(false);
        harga.setEnabled(false);
        nama_menu.setEnabled(false);
        jumlah.setEnabled(false);

        tableMenu.setEnabled(false);
        tableKeranjang.setEnabled(false);
        btnBatal.setEnabled(false);
        btnTambah.setEnabled(false);
        btnKonfirmasi.setEnabled(false);
        btnBatalKeranjang.setEnabled(false);
        btnKonfirmasiPesanan.setEnabled(false);

//        System.out.println(dtf);
        System.out.println(now);
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        rolesLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        orderTabbedPane = new javax.swing.JTabbedPane();
        orderDefaultContainer = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePesanan = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Nama = new javax.swing.JLabel();
        Nama1 = new javax.swing.JLabel();
        Nama2 = new javax.swing.JLabel();
        btnKonfirmasiPesanan = new javax.swing.JButton();
        detailNama = new javax.swing.JLabel();
        detailMeja = new javax.swing.JLabel();
        listDetailPesanan = new java.awt.List();
        pesananDefaultContainer = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMenu = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableKeranjang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        meja = new javax.swing.JComboBox<>();
        jumlah = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nama_menu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBatal = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnDaftar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        menu_id = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        btnKonfirmasi = new javax.swing.JButton();
        btnBatalKeranjang = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(919, 714));

        rolesLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rolesLabel.setText("-");

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nameLabel.setText("-");

        orderTabbedPane.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel6.setText("Daftar Pesanan");

        tablePesanan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tablePesanan.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        tablePesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePesananMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tablePesananMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(tablePesanan);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Detail Pesanan");

        Nama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Nama.setText("Nama :");

        Nama1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Nama1.setText("Meja :");

        Nama2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Nama2.setText("Daftar Menu :");

        btnKonfirmasiPesanan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnKonfirmasiPesanan.setText("Konfirmasi");
        btnKonfirmasiPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonfirmasiPesananActionPerformed(evt);
            }
        });

        detailNama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        detailNama.setText("-");

        detailMeja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        detailMeja.setText("-");

        listDetailPesanan.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(listDetailPesanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnKonfirmasiPesanan))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(Nama2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                                .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(detailNama, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(Nama1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(detailMeja)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(detailNama))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Nama1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(detailMeja))
                                .addGap(10, 10, 10)
                                .addComponent(Nama2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listDetailPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnKonfirmasiPesanan)
                                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout orderDefaultContainerLayout = new javax.swing.GroupLayout(orderDefaultContainer);
        orderDefaultContainer.setLayout(orderDefaultContainerLayout);
        orderDefaultContainerLayout.setHorizontalGroup(
                orderDefaultContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(orderDefaultContainerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(orderDefaultContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addGroup(orderDefaultContainerLayout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(28, Short.MAX_VALUE))
        );
        orderDefaultContainerLayout.setVerticalGroup(
                orderDefaultContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(orderDefaultContainerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(orderDefaultContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(69, Short.MAX_VALUE))
        );

        orderTabbedPane.addTab("Pesanan", orderDefaultContainer);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel5.setText("Daftar Menu");

        tableMenu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tableMenu.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        tableMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMenu);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Keranjang");

        tableKeranjang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tableKeranjang.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane3.setViewportView(tableKeranjang);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nama");

        nama.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Meja");

        meja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        meja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mejaActionPerformed(evt);
            }
        });

        jumlah.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Jumlah");

        nama_menu.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nama Menu");

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnDaftar.setText("Daftar");
        btnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("ID");

        menu_id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        menu_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Harga");

        harga.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        btnKonfirmasi.setText("Konfirmasi");
        btnKonfirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonfirmasiActionPerformed(evt);
            }
        });

        btnBatalKeranjang.setText("Batal");
        btnBatalKeranjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalKeranjangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pesananDefaultContainerLayout = new javax.swing.GroupLayout(pesananDefaultContainer);
        pesananDefaultContainer.setLayout(pesananDefaultContainerLayout);
        pesananDefaultContainerLayout.setHorizontalGroup(
                pesananDefaultContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pesananDefaultContainerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pesananDefaultContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pesananDefaultContainerLayout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                                .addComponent(meja, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(214, 214, 214))
                                        .addGroup(pesananDefaultContainerLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel10))
                                        .addGroup(pesananDefaultContainerLayout.createSequentialGroup()
                                                .addGroup(pesananDefaultContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pesananDefaultContainerLayout.createSequentialGroup()
                                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(pesananDefaultContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(pesananDefaultContainerLayout.createSequentialGroup()
                                                                                .addGap(11, 11, 11)
                                                                                .addComponent(menu_id, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jLabel3)
                                                                                .addGap(29, 29, 29)
                                                                                .addComponent(nama_menu))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pesananDefaultContainerLayout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(pesananDefaultContainerLayout.createSequentialGroup()
                                                                                .addGap(10, 10, 10)
                                                                                .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(30, 30, 30)
                                                                                .addComponent(jumlah))))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(pesananDefaultContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pesananDefaultContainerLayout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(btnBatalKeranjang, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnKonfirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap())
        );
        pesananDefaultContainerLayout.setVerticalGroup(
                pesananDefaultContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pesananDefaultContainerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pesananDefaultContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(meja)
                                        .addComponent(btnDaftar))
                                .addGap(10, 10, 10)
                                .addGroup(pesananDefaultContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(pesananDefaultContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(pesananDefaultContainerLayout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pesananDefaultContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnKonfirmasi)
                                                        .addComponent(btnBatalKeranjang)))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pesananDefaultContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(menu_id, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nama_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(pesananDefaultContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pesananDefaultContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnTambah)
                                        .addComponent(btnBatal))
                                .addGap(10, 10, 10))
        );

        orderTabbedPane.addTab("Entri Order", pesananDefaultContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(orderTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(rolesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(118, 118, 118))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(rolesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(orderTabbedPane))
        );

        pack();
    }// </editor-fold>

    private void tableMenuMouseClicked(java.awt.event.MouseEvent evt) {
        menu_id.setText(tableMenu.getValueAt(tableMenu.getSelectedRow(), 0).toString());
        nama_menu.setText(tableMenu.getValueAt(tableMenu.getSelectedRow(), 1).toString());
        harga.setText(tableMenu.getValueAt(tableMenu.getSelectedRow(), 2).toString());
    }

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void mejaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {
        nama.setText("");
        jumlah.setText("");
        nama_menu.setText("");
    }

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnKonfirmasiActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnBatalKeranjangActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void tablePesananMouseClicked(java.awt.event.MouseEvent evt) {
        detailNama.setText(tablePesanan.getValueAt(tablePesanan.getSelectedRow(), 1).toString());
        detailMeja.setText(tablePesanan.getValueAt(tablePesanan.getSelectedRow(), 2).toString());
        tampilDetailPesanan(tablePesanan.getValueAt(tablePesanan.getSelectedRow(), 0).toString());
//        idTransaksiPesanan = tablePesanan.getValueAt(tablePesanan.getSelectedRow(), 0).toString();
        btnKonfirmasiPesanan.setEnabled(true);
    }

    private void tablePesananMouseEntered(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void btnKonfirmasiPesananActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void judul() {
        Object[] judul = {
                "ID","Nama Menu", "Harga",
        };
        tabModel = new DefaultTableModel(null, judul);
        tableMenu.setModel(tabModel);
    }

    public void judulPesanan() {
        Object[] judul = {
                "transaksi_id", "Nama", "Meja",
        };
        tabModelPesanan = new DefaultTableModel(null, judul);
        tablePesanan.setModel(tabModelPesanan);
    }

    public void judulKeranjang() {
        Object[] judul = {
                "ID" ,"Nama Menu", "Harga", "Jumlah"
        };
        tabModelKeranjang = new DefaultTableModel(null, judul);
        tableKeranjang.setModel(tabModelKeranjang);
    }

    public void tampilDataKeranjang() {

    }

    public void tampilData(String where) {

    }

    public void tampilDataPesanan(String where) {

    }

    public void tampilDetailPesanan(String id) {

    }

    public void tampilDataMeja() {

    }

    public void enabled() {
        jumlah.setEnabled(true);

        tableMenu.setEnabled(true);
        tableKeranjang.setEnabled(true);
        btnBatal.setEnabled(true);
        btnTambah.setEnabled(true);
        btnKonfirmasi.setEnabled(true);
        btnBatalKeranjang.setEnabled(true);
    }

    public void resetAll() {
//        idTransaksi = "0";

        jumlah.setEnabled(false);
        nama.setEnabled(true);
        meja.setEnabled(true);

        tableMenu.setEnabled(false);
        tableKeranjang.setEnabled(false);
        btnBatal.setEnabled(false);
        btnTambah.setEnabled(false);
        btnKonfirmasi.setEnabled(false);
        btnBatalKeranjang.setEnabled(false);
        btnDaftar.setEnabled(true);

        nama.setText("");

    }

    private javax.swing.JLabel Nama;
    private javax.swing.JLabel Nama1;
    private javax.swing.JLabel Nama2;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnBatalKeranjang;
    private javax.swing.JButton btnDaftar;
    private javax.swing.JButton btnKonfirmasi;
    private javax.swing.JButton btnKonfirmasiPesanan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel detailMeja;
    private javax.swing.JLabel detailNama;
    private javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jumlah;
    private java.awt.List listDetailPesanan;
    private javax.swing.JComboBox<String> meja;
    private javax.swing.JTextField menu_id;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nama_menu;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel orderDefaultContainer;
    private javax.swing.JTabbedPane orderTabbedPane;
    private javax.swing.JPanel pesananDefaultContainer;
    private javax.swing.JLabel rolesLabel;
    private javax.swing.JTable tableKeranjang;
    private javax.swing.JTable tableMenu;
    private javax.swing.JTable tablePesanan;
}
