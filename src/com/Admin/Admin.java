package com.Admin;

import com.LoginRegister.LoginLayout;
import com.Product.Fruit;
import com.Product.ProductList;
import com.Product.Vegetable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Admin extends javax.swing.JFrame {

    public Admin() {
        initComponents();
        
        btn_consumers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Billing b = new Billing();
                b.setVisible(true);

                DefaultTableModel model =  (DefaultTableModel) b.billingTable.getModel();
                model.setRowCount(0);

                Object[] data = new Object[5];
                ArrayList<BillObject> list = new ArrayList<BillObject>();
                list = BillingDB.billlings();

                int total = 0;
                for(int i = 0; i < list.size(); i++) {
                    data[0] = i+1;
                    data[1] = list.get(i).getUsername();
                    data[2] = String.format("%,d", list.get(i).getBill());
                    data[3] = list.get(i).getDate();
                    data[4] = list.get(i).getAddress();

                    total += list.get(i).getBill();
                    model.addRow(data);
                    b.billingTable.setRowHeight(20);
                }
                b.billLabel.setText(String.format("%,d", total));                
            }
        });
        
        btn_checkStock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CheckStock cs = new CheckStock();
                cs.setVisible(true);

                DefaultTableModel model =  (DefaultTableModel) cs.checkStockTable.getModel();
                model.setRowCount(0);

                ArrayList<ProductList> list;
                Object data[] = new Object[3];

                list = Vegetable.checkStock();
                for(int i = 0; i < list.size(); i++) {
                    data[0] = list.get(i).getProductName();
                    data[1] = list.get(i).getQuantity();
                    data[2] = "Vegetable";

                    model.addRow(data);
                }
                list.clear();

                list = Fruit.checkStock();
                for(int i = 0; i < list.size(); i++) {
                    data[0] = list.get(i).getProductName();
                    data[1] = list.get(i).getQuantity();
                    data[2] = "Fruit";

                    model.addRow(data);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_helloAdmin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        panel_checkStock = new javax.swing.JPanel();
        btn_checkStock = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        panel_consumers = new javax.swing.JPanel();
        btn_consumers = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setResizable(false);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setMinimumSize(new java.awt.Dimension(1000, 500));
        container.setPreferredSize(new java.awt.Dimension(1000, 500));

        jPanel1.setBackground(new java.awt.Color(31, 36, 42));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hello Bos, ");

        lbl_helloAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_helloAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lbl_helloAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_helloAdmin.setText("bosName");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/user.png"))); // NOI18N

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbl_helloAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_helloAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        panel_checkStock.setBackground(new java.awt.Color(255, 255, 255));
        panel_checkStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_checkStock.setPreferredSize(new java.awt.Dimension(200, 200));

        btn_checkStock.setBackground(new java.awt.Color(255, 255, 255));
        btn_checkStock.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_checkStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/stock (3).png"))); // NOI18N
        btn_checkStock.setBorder(null);
        btn_checkStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_checkStock.setFocusPainted(false);
        btn_checkStock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_checkStock.setMaximumSize(new java.awt.Dimension(100, 100));
        btn_checkStock.setPreferredSize(new java.awt.Dimension(200, 200));
        btn_checkStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_checkStockMouseClicked(evt);
            }
        });
        btn_checkStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkStockActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Check Stock");

        javax.swing.GroupLayout panel_checkStockLayout = new javax.swing.GroupLayout(panel_checkStock);
        panel_checkStock.setLayout(panel_checkStockLayout);
        panel_checkStockLayout.setHorizontalGroup(
            panel_checkStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
            .addComponent(btn_checkStock, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panel_checkStockLayout.setVerticalGroup(
            panel_checkStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_checkStockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_checkStock, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        panel_consumers.setBackground(new java.awt.Color(255, 255, 255));
        panel_consumers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_consumers.setPreferredSize(new java.awt.Dimension(200, 200));

        btn_consumers.setBackground(new java.awt.Color(255, 255, 255));
        btn_consumers.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_consumers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/consumer.png"))); // NOI18N
        btn_consumers.setBorder(null);
        btn_consumers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_consumers.setFocusPainted(false);
        btn_consumers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_consumers.setMaximumSize(new java.awt.Dimension(100, 100));
        btn_consumers.setPreferredSize(new java.awt.Dimension(200, 200));
        btn_consumers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_consumersMouseClicked(evt);
            }
        });
        btn_consumers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consumersActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Consumers");

        javax.swing.GroupLayout panel_consumersLayout = new javax.swing.GroupLayout(panel_consumers);
        panel_consumers.setLayout(panel_consumersLayout);
        panel_consumersLayout.setHorizontalGroup(
            panel_consumersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
            .addComponent(btn_consumers, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panel_consumersLayout.setVerticalGroup(
            panel_consumersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_consumersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_consumers, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(panel_consumers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(panel_checkStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_consumers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_checkStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
        );

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        LoginLayout login = new LoginLayout();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btn_checkStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_checkStockMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_checkStockMouseClicked

    private void btn_checkStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_checkStockActionPerformed

    private void btn_consumersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_consumersMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_consumersMouseClicked

    private void btn_consumersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consumersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_consumersActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_checkStock;
    private javax.swing.JButton btn_consumers;
    private javax.swing.JButton btn_logout;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lbl_helloAdmin;
    private javax.swing.JPanel panel_checkStock;
    private javax.swing.JPanel panel_consumers;
    // End of variables declaration//GEN-END:variables
}
