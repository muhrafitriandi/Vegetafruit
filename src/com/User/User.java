package com.User;
import com.Admin.Admin;
import com.Connection.MyConnection;
import com.Register.Register;
import com.Interface.MyInterface;
import com.LoginRegister.LoginActivity;
import static com.Connection.MyConnection.getConnection;
import com.LoginRegister.LoginLayout;
import com.Product.Checkout;
import static com.Product.Checkout.billLabel;
import static com.Product.Checkout.cartItemTable;
import com.Product.Product;
import com.Product.ProductInformation;
import com.Product.ProductList;
import com.Product.Vegetable;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/*
    dipose(): digunakan untuk menutup frame.
*/

public class User extends Register implements MyInterface { // Kelas User sebagai Subclass dari Kelas Register yang Mengimplementasikan MyInterface
    static int total = 0;
    static Object[] data = new Object[3];
    Connection connection = null;
    
    // Constructor
    public User(String username) {
        super(username); // memanggil constructor dari superclass(Register)
        initComponents();
        getConnection();
    }
    
    public User() {
        initComponents();
        getConnection();
    }
    // ------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        in_username = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbl_hello = new javax.swing.JLabel();
        lbl_customerName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_myProfile = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        btn_dashboard = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        panel_checkOut = new javax.swing.JPanel();
        btn_checkOut = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        panel_product = new javax.swing.JPanel();
        btn_product = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        panel_aboutUs = new javax.swing.JPanel();
        btn_aboutUs = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        in_username.setText("jLabel");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setUndecorated(true);
        setResizable(false);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setForeground(new java.awt.Color(255, 255, 255));
        container.setMinimumSize(new java.awt.Dimension(1000, 500));
        container.setPreferredSize(new java.awt.Dimension(1000, 500));

        jPanel1.setBackground(new java.awt.Color(31, 36, 42));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 500));

        lbl_hello.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_hello.setForeground(new java.awt.Color(255, 255, 255));
        lbl_hello.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_hello.setText("Hello,");

        lbl_customerName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_customerName.setForeground(new java.awt.Color(255, 255, 255));
        lbl_customerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_customerName.setText("customerName");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/user.png"))); // NOI18N

        btn_myProfile.setBackground(new java.awt.Color(0, 204, 102));
        btn_myProfile.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_myProfile.setForeground(new java.awt.Color(255, 255, 255));
        btn_myProfile.setText("My Profile");
        btn_myProfile.setBorder(null);
        btn_myProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_myProfile.setFocusPainted(false);
        btn_myProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_myProfileActionPerformed(evt);
            }
        });

        btn_logout.setBackground(new java.awt.Color(255, 51, 51));
        btn_logout.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("Logout");
        btn_logout.setBorder(null);
        btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logout.setFocusPainted(false);
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        btn_dashboard.setBackground(new java.awt.Color(0, 204, 102));
        btn_dashboard.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_dashboard.setForeground(new java.awt.Color(255, 255, 255));
        btn_dashboard.setText("Dashboard");
        btn_dashboard.setBorder(null);
        btn_dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_dashboard.setFocusPainted(false);
        btn_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(lbl_customerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_hello, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_myProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_hello, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_customerName)
                .addGap(51, 51, 51)
                .addComponent(btn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_myProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        panel_checkOut.setBackground(new java.awt.Color(255, 255, 255));
        panel_checkOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_checkOut.setPreferredSize(new java.awt.Dimension(200, 200));

        btn_checkOut.setBackground(new java.awt.Color(255, 255, 255));
        btn_checkOut.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_checkOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cashier.png"))); // NOI18N
        btn_checkOut.setBorder(null);
        btn_checkOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_checkOut.setFocusPainted(false);
        btn_checkOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_checkOut.setMaximumSize(new java.awt.Dimension(100, 100));
        btn_checkOut.setPreferredSize(new java.awt.Dimension(200, 200));
        btn_checkOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_checkOutMouseClicked(evt);
            }
        });
        btn_checkOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkOutActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Checkout");

        javax.swing.GroupLayout panel_checkOutLayout = new javax.swing.GroupLayout(panel_checkOut);
        panel_checkOut.setLayout(panel_checkOutLayout);
        panel_checkOutLayout.setHorizontalGroup(
            panel_checkOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
            .addComponent(btn_checkOut, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panel_checkOutLayout.setVerticalGroup(
            panel_checkOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_checkOutLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btn_checkOut, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panel_product.setBackground(new java.awt.Color(255, 255, 255));
        panel_product.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_product.setPreferredSize(new java.awt.Dimension(200, 200));

        btn_product.setBackground(new java.awt.Color(255, 255, 255));
        btn_product.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_product.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/shopping.png"))); // NOI18N
        btn_product.setBorder(null);
        btn_product.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_product.setFocusPainted(false);
        btn_product.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_product.setMaximumSize(new java.awt.Dimension(100, 100));
        btn_product.setPreferredSize(new java.awt.Dimension(200, 200));
        btn_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_productMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_productMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_productMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_productMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_productMouseReleased(evt);
            }
        });
        btn_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Shopping");

        javax.swing.GroupLayout panel_productLayout = new javax.swing.GroupLayout(panel_product);
        panel_product.setLayout(panel_productLayout);
        panel_productLayout.setHorizontalGroup(
            panel_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_product, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        );
        panel_productLayout.setVerticalGroup(
            panel_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_productLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btn_product, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        panel_aboutUs.setBackground(new java.awt.Color(255, 255, 255));
        panel_aboutUs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_aboutUs.setPreferredSize(new java.awt.Dimension(200, 200));

        btn_aboutUs.setBackground(new java.awt.Color(255, 255, 255));
        btn_aboutUs.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_aboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/aboutus.png"))); // NOI18N
        btn_aboutUs.setBorder(null);
        btn_aboutUs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_aboutUs.setFocusPainted(false);
        btn_aboutUs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_aboutUs.setMaximumSize(new java.awt.Dimension(100, 100));
        btn_aboutUs.setPreferredSize(new java.awt.Dimension(200, 200));
        btn_aboutUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_aboutUsMouseClicked(evt);
            }
        });
        btn_aboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aboutUsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("About Us");

        javax.swing.GroupLayout panel_aboutUsLayout = new javax.swing.GroupLayout(panel_aboutUs);
        panel_aboutUs.setLayout(panel_aboutUsLayout);
        panel_aboutUsLayout.setHorizontalGroup(
            panel_aboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_aboutUs, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        );
        panel_aboutUsLayout.setVerticalGroup(
            panel_aboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_aboutUsLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btn_aboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(panel_checkOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(panel_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(panel_aboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_aboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_checkOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // saat mengklik button My Profile di User
    // masuk ke jendela Kelas About yang telah dibuat fungsi di MyInterface.myProfile
    private void btn_myProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_myProfileActionPerformed
        MyInterface.myProfile(in_username.getText()); // Memanggil Interface.method(username)
        this.dispose();
    }//GEN-LAST:event_btn_myProfileActionPerformed

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_logoutMouseClicked
    
    // saat mengklik button Logout di kelas User
    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        LoginLayout login = new LoginLayout(); // membuat objek kelas LoginLayout
        login.setVisible(true); // memunculkan jendela Login
        
        // menghapus item keranjang
        ProductInformation.cartItem.clear();
        this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dashboardActionPerformed

    private void btn_aboutUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_aboutUsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_aboutUsMouseClicked
    
    // Saat mengklik button about us
    private void btn_aboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aboutUsActionPerformed
        AboutUs aboutUs = new AboutUs(); // Membuat objek Kelas AboutUs
        aboutUs.setVisible(true); // memunculkan jendela AboutUs
    }//GEN-LAST:event_btn_aboutUsActionPerformed

    private void btn_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_productMouseClicked
    
    // saat mengklik button product
    private void btn_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productActionPerformed
        ProductInformation.categoryChooser = "vegetables"; // kategori vegetables
        Product p = new Product();
        p.dataVegetable(); // mencari semua data vegetable
        p.setVisible(true);
        
        // membuat teks tabel Vegetable menjadi rata tengah
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        p.vegetableTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer); // Product Name
        p.vegetableTable.getColumnModel().getColumn(1).setCellRenderer(centerRenderer); // Price
        p.vegetableTable.getColumnModel().getColumn(2).setCellRenderer(centerRenderer); // Quantity
        // ------------------------------
    }//GEN-LAST:event_btn_productActionPerformed

    private void btn_checkOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_checkOutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_checkOutMouseClicked

    private void btn_checkOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkOutActionPerformed
        MyInterface.myUsernameBilling(in_username.getText()); // Memanggil Interface.method(username)
    }//GEN-LAST:event_btn_checkOutActionPerformed

    private void btn_productMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_productMouseEntered

    private void btn_productMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_productMouseExited

    private void btn_productMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_productMousePressed

    private void btn_productMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_productMouseReleased

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aboutUs;
    private javax.swing.JButton btn_checkOut;
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_myProfile;
    private javax.swing.JButton btn_product;
    private javax.swing.JPanel container;
    public javax.swing.JLabel in_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JLabel lbl_customerName;
    public javax.swing.JLabel lbl_hello;
    private javax.swing.JPanel panel_aboutUs;
    private javax.swing.JPanel panel_checkOut;
    private javax.swing.JPanel panel_product;
    // End of variables declaration//GEN-END:variables
}
