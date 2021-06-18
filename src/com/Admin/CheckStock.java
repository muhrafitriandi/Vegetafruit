package com.Admin;

import com.PlaceHolder.PlaceHolder;
import com.Product.Fruit;
import com.Product.Vegetable;
import javax.swing.JOptionPane;

public class CheckStock extends javax.swing.JFrame {

    public CheckStock() {
        initComponents();
        PlaceHolder pl1 = new PlaceHolder("Enter product name", tf_productName);
        PlaceHolder pl2 = new PlaceHolder("Enter quantity", tf_quantity);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        checkStockTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        tf_productName = new javax.swing.JTextField();
        stockStatusCat = new javax.swing.JComboBox<>();
        tf_quantity = new javax.swing.JTextField();
        btn_updateStock = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 550));

        checkStockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Stock", "Category"
            }
        ));
        checkStockTable.setEnabled(false);
        checkStockTable.setRowHeight(20);
        jScrollPane3.setViewportView(checkStockTable);

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 77, 64));
        jLabel11.setText("Add to Stock:");

        tf_productName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tf_productName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_productNameActionPerformed(evt);
            }
        });

        stockStatusCat.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        stockStatusCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vegetable", "Fruit" }));

        tf_quantity.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tf_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_quantityActionPerformed(evt);
            }
        });

        btn_updateStock.setBackground(new java.awt.Color(0, 77, 64));
        btn_updateStock.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_updateStock.setForeground(new java.awt.Color(255, 255, 255));
        btn_updateStock.setText("Update Stock");
        btn_updateStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel11)
                .addGap(29, 29, 29)
                .addComponent(tf_productName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(stockStatusCat, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btn_updateStock)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_productName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockStatusCat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_updateStock))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_productNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_productNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_productNameActionPerformed

    private void tf_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_quantityActionPerformed

    private void btn_updateStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateStockActionPerformed
        try {
            String productName = tf_productName.getText();
            int quantity = Integer.parseInt(tf_quantity.getText());
            
            if(stockStatusCat.getSelectedItem().equals("Vegetable")) {
                Vegetable.flag = true;
                Vegetable.updateVegetable(productName, quantity);
            }else if(stockStatusCat.getSelectedItem().equals("Fruit")) {
                Fruit.flag = true;
                Fruit.updateFruit(productName, quantity);
            }
            tf_productName.setText("");
            tf_quantity.setText("");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_updateStockActionPerformed

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
            java.util.logging.Logger.getLogger(CheckStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_updateStock;
    public javax.swing.JTable checkStockTable;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> stockStatusCat;
    private javax.swing.JTextField tf_productName;
    private javax.swing.JTextField tf_quantity;
    // End of variables declaration//GEN-END:variables
}
