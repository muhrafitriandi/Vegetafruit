package com.Product;

import com.PlaceHolder.PlaceHolder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductInformation extends javax.swing.JFrame {
    public static String categoryChooser = "";
    public static ArrayList<ProductList> cartItem = new ArrayList<ProductList>();
    
    public ProductInformation() {
        initComponents();
        PlaceHolder pl1 = new PlaceHolder("Quantity/kg", tf_quantity);
        
        btn_addToCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String infoPrice = lbl_productInfoPrice.getText().replace(",", "");
                if(tf_quantity.getText().equals("")){ // jika inputan kosong
                    // memunculkan pesan,
                    JOptionPane.showMessageDialog(null, "Product not added to cart. Please enter quantity!");
                    // selain itu jika, stock < quantity
                }else if(Integer.parseInt(lbl_productInfoStock.getText()) < Integer.parseInt(tf_quantity.getText())) {
                    // memunculkan pesan,
                    JOptionPane.showMessageDialog(null, "Sorry, not enough stock!");
                }else{ // selain itu
                    // Object Constructor Kelas ProductList dengan 4 parameter
                    ProductList pList = new ProductList(lbl_infoProductName.getText(), // Product Name
                                       Integer.parseInt(infoPrice), // Price
                                       Integer.parseInt(tf_quantity.getText()), null); // Quantity

                    cartItem.add(pList); // menambahkan data product (productName, price, quantity)
                    // memunculkan pesan
                    JOptionPane.showMessageDialog(null, "Product added to cart!");
                    
                    // deklarasi (stock - quantity)
                    
                    int qtyTester = Integer.parseInt(lbl_productInfoStock.getText()) - Integer.parseInt(tf_quantity.getText());
                    if(categoryChooser.equals("vegetables")) { // jika, produk yang dibeli vegetables
                        Vegetable.updateVegetable(lbl_infoProductName.getText(), qtyTester); // Product Name dan Stock akan diupdate.
                    }else if(categoryChooser.equals("fruits")) { // selain itu jika, produk yang dibeli fruits
                        Fruit.updateFruit(lbl_infoProductName.getText(), qtyTester); // Product Name dan Stock akan diupdate.
                    }
                }
                tf_quantity.setText("");
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbl_productName = new javax.swing.JLabel();
        lbl_infoProductName = new javax.swing.JLabel();
        lbl_price = new javax.swing.JLabel();
        lbl_productInfoPrice = new javax.swing.JLabel();
        lbl_stock = new javax.swing.JLabel();
        lbl_productInfoStock = new javax.swing.JLabel();
        lbl_infoProductPhoto = new javax.swing.JLabel();
        tf_quantity = new javax.swing.JTextField();
        btn_addToCart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 500));

        lbl_productName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_productName.setText("Product Name:");

        lbl_infoProductName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lbl_price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_price.setText("Price:");

        lbl_productInfoPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lbl_stock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_stock.setText("In Stock:");

        lbl_productInfoStock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lbl_infoProductPhoto.setBackground(new java.awt.Color(255, 255, 255));
        lbl_infoProductPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_infoProductPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 64)));

        tf_quantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf_quantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 64)));
        tf_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_quantityActionPerformed(evt);
            }
        });

        btn_addToCart.setBackground(new java.awt.Color(0, 102, 102));
        btn_addToCart.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        btn_addToCart.setForeground(new java.awt.Color(255, 255, 255));
        btn_addToCart.setText("Add to cart");
        btn_addToCart.setBorder(null);
        btn_addToCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_addToCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addToCartMouseClicked(evt);
            }
        });
        btn_addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addToCartActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("/KG");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_addToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_price, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_productName, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_infoProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbl_productInfoPrice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_stock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_productInfoStock, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78)
                .addComponent(lbl_infoProductPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(360, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_infoProductPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_productName)
                            .addComponent(lbl_infoProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_price)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_productInfoPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGap(96, 96, 96)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_productInfoStock, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn_addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addToCartActionPerformed
        // TODO add your handling code here:     
    }//GEN-LAST:event_btn_addToCartActionPerformed

    private void tf_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_quantityActionPerformed

    private void btn_addToCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addToCartMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addToCartMouseClicked

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
            java.util.logging.Logger.getLogger(ProductInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addToCart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel lbl_infoProductName;
    public javax.swing.JLabel lbl_infoProductPhoto;
    private javax.swing.JLabel lbl_price;
    public javax.swing.JLabel lbl_productInfoPrice;
    public javax.swing.JLabel lbl_productInfoStock;
    private javax.swing.JLabel lbl_productName;
    private javax.swing.JLabel lbl_stock;
    public javax.swing.JTextField tf_quantity;
    // End of variables declaration//GEN-END:variables
}
