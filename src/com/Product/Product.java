package com.Product;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Product extends javax.swing.JFrame {

    public Product() {
        initComponents();
        dataVegetable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        vegetablesButton = new javax.swing.JButton();
        fruitsButton = new javax.swing.JButton();
        cardParentPanel = new javax.swing.JPanel();
        vegetablesPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vegetableTable = new javax.swing.JTable();
        fruitsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        fruitTable = new javax.swing.JTable();

        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(1050, 50));

        vegetablesButton.setBackground(new java.awt.Color(0, 102, 102));
        vegetablesButton.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        vegetablesButton.setForeground(new java.awt.Color(255, 255, 255));
        vegetablesButton.setText("Vegetables");
        vegetablesButton.setToolTipText("");
        vegetablesButton.setBorderPainted(false);
        vegetablesButton.setContentAreaFilled(false);
        vegetablesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vegetablesButton.setOpaque(true);
        vegetablesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vegetablesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vegetablesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vegetablesButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vegetablesButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                vegetablesButtonMouseReleased(evt);
            }
        });
        vegetablesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vegetablesButtonActionPerformed(evt);
            }
        });

        fruitsButton.setBackground(new java.awt.Color(0, 102, 102));
        fruitsButton.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        fruitsButton.setForeground(new java.awt.Color(255, 255, 255));
        fruitsButton.setText("Fruits");
        fruitsButton.setToolTipText("");
        fruitsButton.setBorderPainted(false);
        fruitsButton.setContentAreaFilled(false);
        fruitsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fruitsButton.setOpaque(true);
        fruitsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fruitsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fruitsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fruitsButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fruitsButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fruitsButtonMouseReleased(evt);
            }
        });
        fruitsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruitsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(vegetablesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(fruitsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(750, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(vegetablesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(fruitsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 50));

        cardParentPanel.setLayout(new java.awt.CardLayout());

        vegetableTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        vegetableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        vegetableTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vegetableTable.setSelectionBackground(new java.awt.Color(0, 102, 102));
        vegetableTable.getTableHeader().setReorderingAllowed(false);
        vegetableTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vegetableTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(vegetableTable);

        javax.swing.GroupLayout vegetablesPanelLayout = new javax.swing.GroupLayout(vegetablesPanel);
        vegetablesPanel.setLayout(vegetablesPanelLayout);
        vegetablesPanelLayout.setHorizontalGroup(
            vegetablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        vegetablesPanelLayout.setVerticalGroup(
            vegetablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        cardParentPanel.add(vegetablesPanel, "card2");

        fruitTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fruitTable.setModel(new javax.swing.table.DefaultTableModel(
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
        fruitTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fruitTable.setSelectionBackground(new java.awt.Color(0, 102, 102));
        fruitTable.getTableHeader().setReorderingAllowed(false);
        fruitTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fruitTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(fruitTable);

        javax.swing.GroupLayout fruitsPanelLayout = new javax.swing.GroupLayout(fruitsPanel);
        fruitsPanel.setLayout(fruitsPanelLayout);
        fruitsPanelLayout.setHorizontalGroup(
            fruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        fruitsPanelLayout.setVerticalGroup(
            fruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        cardParentPanel.add(fruitsPanel, "card2");

        jPanel1.add(cardParentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1050, 500));

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

    private void vegetablesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vegetablesButtonMouseClicked
        cardParentPanel.removeAll();
        cardParentPanel.add(vegetablesPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        vegetableTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        vegetableTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        vegetableTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
    }//GEN-LAST:event_vegetablesButtonMouseClicked

    private void vegetablesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vegetablesButtonMouseEntered
        vegetablesButton.setBackground(new Color(0, 137, 123));
    }//GEN-LAST:event_vegetablesButtonMouseEntered

    private void vegetablesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vegetablesButtonMouseExited
        vegetablesButton.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_vegetablesButtonMouseExited

    private void vegetablesButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vegetablesButtonMousePressed
        vegetablesButton.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_vegetablesButtonMousePressed

    private void vegetablesButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vegetablesButtonMouseReleased
        vegetablesButton.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_vegetablesButtonMouseReleased

    private void vegetablesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vegetablesButtonActionPerformed
        ProductInformation.categoryChooser = "vegetables";
        dataVegetable();
    }//GEN-LAST:event_vegetablesButtonActionPerformed

    private void fruitsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fruitsButtonMouseClicked
        cardParentPanel.removeAll();
        cardParentPanel.add(fruitsPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        fruitTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        fruitTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        fruitTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
    }//GEN-LAST:event_fruitsButtonMouseClicked

    private void fruitsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fruitsButtonMouseEntered
        fruitsButton.setBackground(new Color(0, 137, 123));
    }//GEN-LAST:event_fruitsButtonMouseEntered

    private void fruitsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fruitsButtonMouseExited
        fruitsButton.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_fruitsButtonMouseExited

    private void fruitsButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fruitsButtonMousePressed
        fruitsButton.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_fruitsButtonMousePressed

    private void fruitsButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fruitsButtonMouseReleased
        fruitsButton.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_fruitsButtonMouseReleased

    private void fruitsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fruitsButtonActionPerformed
        ProductInformation.categoryChooser = "fruits";
        dataFruits();
    }//GEN-LAST:event_fruitsButtonActionPerformed

    private void vegetableTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vegetableTableMouseClicked
        pi.setVisible(true);
        pi.pack();

        int selectedRow = vegetableTable.getSelectedRow();
        TableModel tm = vegetableTable.getModel();

        String productName = tm.getValueAt(selectedRow, 0).toString();
        String price = tm.getValueAt(selectedRow, 1).toString();
        String stock = tm.getValueAt(selectedRow, 2).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 3);
        
        pi.lbl_infoProductName.setText(productName);
        pi.lbl_productInfoPrice.setText(price);
        pi.lbl_productInfoStock.setText(stock);
        pi.lbl_infoProductPhoto.setIcon(img);
    }//GEN-LAST:event_vegetableTableMouseClicked

    private void fruitTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fruitTableMouseClicked
        pi.setVisible(true);
        pi.pack();
        
        int selectedRow = fruitTable.getSelectedRow();
        TableModel tm = fruitTable.getModel();
        
        String productName = tm.getValueAt(selectedRow, 0).toString();
        String price = tm.getValueAt(selectedRow, 1).toString();
        String stock = tm.getValueAt(selectedRow, 2).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 3);
        
        pi.lbl_infoProductName.setText(productName);
        pi.lbl_productInfoPrice.setText(price);
        pi.lbl_productInfoStock.setText(stock);
        pi.lbl_infoProductPhoto.setIcon(img);        
    }//GEN-LAST:event_fruitTableMouseClicked
    
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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel cardParentPanel;
    public javax.swing.JTable fruitTable;
    private javax.swing.JButton fruitsButton;
    private javax.swing.JPanel fruitsPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable vegetableTable;
    private javax.swing.JButton vegetablesButton;
    private javax.swing.JPanel vegetablesPanel;
    // End of variables declaration//GEN-END:variables
    
    ProductInformation pi = new ProductInformation();
    public void dataVegetable() {
        Vegetable vegetable = new Vegetable();
        ArrayList<ProductList> productList = vegetable.tableGenerator();
        String[] columnName = {"Product Name", "Price", "Quantity", "Photo"};
        Object[][] rows = new Object[productList.size()][4];
        
        for(int i = 0; i < productList.size(); i++) {
            rows[i][0] = productList.get(i).getProductName();
            rows[i][1] = String.format("%,d", productList.get(i).getPrice());
            rows[i][2] = productList.get(i).getQuantity();
            
            if(productList.get(i).getPhoto() != null) {
                ImageIcon image = new ImageIcon(new ImageIcon(productList.get(i).getPhoto()).getImage()
                .getScaledInstance(200, 200, Image.SCALE_SMOOTH));
                rows[i][3] = image;
            }else {
                rows[i][3] = null;
            }
        }
        TheModel model = new TheModel(rows, columnName);
        vegetableTable.setModel(model);
        vegetableTable.setRowHeight(270);
        vegetableTable.getColumnModel().getColumn(3).setPreferredWidth(60);
    }
    
    public void dataFruits() {
        Fruit fruit = new Fruit();
        ArrayList<ProductList> productList = fruit.tableGenerator();
        String[] columnName = {"Product Name", "Price", "Quantity", "Photo"};
        Object[][] rows = new Object[productList.size()][4];
        
        for(int i = 0; i < productList.size(); i++) {
            rows[i][0] = productList.get(i).getProductName();
            rows[i][1] = String.format("%,d", productList.get(i).getPrice());
            rows[i][2] = productList.get(i).getQuantity();
            
            if(productList.get(i).getPhoto() != null) {
                
                ImageIcon image = new ImageIcon(new ImageIcon(productList.get(i).getPhoto()).getImage()
                .getScaledInstance(200, 200, Image.SCALE_SMOOTH));
                rows[i][3] = image;
            }else {
                rows[i][3] = null;
            }
        }
        TheModel model = new TheModel(rows, columnName);
        fruitTable.setModel(model);
        fruitTable.setRowHeight(270);
        fruitTable.getColumnModel().getColumn(3).setPreferredWidth(60);        
    }
}


