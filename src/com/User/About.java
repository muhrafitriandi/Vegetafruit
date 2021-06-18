package com.User;

import com.Connection.MyConnection;
import com.Interface.MyInterface;
import com.LoginRegister.LoginLayout;
import com.Product.ProductInformation;
import com.Register.Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class About extends Register implements MyInterface { // Kelas About sebagai Subclass dari Kelas Register yang Mengimplementasikan MyInterface
    
    public About(String username) {
        super(username); // memanggil constructor dari superclass(Register)
        initComponents();
        getConnection();
    }
    
    public About() {
        initComponents();
        getConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        in_username = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbl_user_profile_about = new javax.swing.JLabel();
        lbl_helloUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_dashboard = new javax.swing.JButton();
        btn_myProfile = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_fullName_profile_about = new javax.swing.JLabel();
        lbl_email_profile_about = new javax.swing.JLabel();
        lbl_username_profile_about = new javax.swing.JLabel();
        lbl_phoneNumber_profile_about = new javax.swing.JLabel();
        btn_changePassword = new javax.swing.JButton();

        in_username.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.CardLayout());

        container.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(31, 36, 42));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 500));

        lbl_user_profile_about.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_user_profile_about.setForeground(new java.awt.Color(255, 255, 255));
        lbl_user_profile_about.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_user_profile_about.setText("customerName");

        lbl_helloUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_helloUser.setForeground(new java.awt.Color(255, 255, 255));
        lbl_helloUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_helloUser.setText("Hello,");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/user.png"))); // NOI18N

        btn_dashboard.setBackground(new java.awt.Color(0, 204, 102));
        btn_dashboard.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_dashboard.setForeground(new java.awt.Color(255, 255, 255));
        btn_dashboard.setText("Dashboard");
        btn_dashboard.setBorder(null);
        btn_dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_dashboard.setFocusPainted(false);
        btn_dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseClicked(evt);
            }
        });
        btn_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dashboardActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_user_profile_about, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_helloUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_myProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_helloUser, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lbl_user_profile_about, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_myProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Account");

        lbl_fullName_profile_about.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        lbl_fullName_profile_about.setText("jLabel3");
        lbl_fullName_profile_about.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Fullname"), "Full name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        lbl_email_profile_about.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        lbl_email_profile_about.setText("jLabel4");
        lbl_email_profile_about.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        lbl_username_profile_about.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        lbl_username_profile_about.setText("jLabel5");
        lbl_username_profile_about.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        lbl_phoneNumber_profile_about.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        lbl_phoneNumber_profile_about.setText("jLabel6");
        lbl_phoneNumber_profile_about.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phone Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_phoneNumber_profile_about, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_fullName_profile_about, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_email_profile_about, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_username_profile_about, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(lbl_fullName_profile_about)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_email_profile_about)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_username_profile_about)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_phoneNumber_profile_about)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btn_changePassword.setBackground(new java.awt.Color(255, 153, 0));
        btn_changePassword.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_changePassword.setForeground(new java.awt.Color(255, 255, 255));
        btn_changePassword.setText("Change Password");
        btn_changePassword.setBorder(null);
        btn_changePassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_changePassword.setFocusPainted(false);
        btn_changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_changePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_changePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(123, 123, 123))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_changePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(container, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_myProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_myProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_myProfileActionPerformed

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_logoutMouseClicked
    
    // saat mengklik button Logout di kelas About
    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        LoginLayout login = new LoginLayout(); // membuat objek kelas LoginLayout
        login.setVisible(true); // memunculkan jendela Login
        
        ProductInformation.cartItem.clear(); // menghapus isi/data keranjang
        this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed
    
    // saat mengklik button Dashboard di About
    // masuk ke jendela Kelas User yang telah dibuat fungsi di MyInterface.myDashboard
    private void btn_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashboardActionPerformed
        MyInterface.myDashboard(in_username.getText()); // Memanggil fungsi Interface.method(username)
        
    }//GEN-LAST:event_btn_dashboardActionPerformed
    
    // saat mengklik button Change Password di kelas About
    private void btn_changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_changePasswordActionPerformed
        MyInterface.myChangePassword(in_username.getText()); // Memanggil fungsi Interface.method(username)
    }//GEN-LAST:event_btn_changePasswordActionPerformed

    private void btn_dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dashboardMouseClicked

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
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_changePassword;
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_myProfile;
    private javax.swing.JPanel container;
    public javax.swing.JLabel in_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel lbl_email_profile_about;
    public javax.swing.JLabel lbl_fullName_profile_about;
    public javax.swing.JLabel lbl_helloUser;
    public javax.swing.JLabel lbl_phoneNumber_profile_about;
    public javax.swing.JLabel lbl_user_profile_about;
    public javax.swing.JLabel lbl_username_profile_about;
    // End of variables declaration//GEN-END:variables
}
