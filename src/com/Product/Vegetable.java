package com.Product;

import com.Connection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Vegetable {
    public static boolean flag = false;
    static PreparedStatement ps;
    
    public static void updateVegetable(String productName, int quantity) {
        // update query, quantity pada tabel vegetables
        String query = "UPDATE vegetables SET quantity=? WHERE product_name=?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setInt(1, quantity); // memasukkan nilai parameter quantity
            ps.setString(2, productName); // memasukkan nilai parameter productName
            if(ps.executeUpdate() == 0) { // jika (quantity, productName) tidak ada/0 == 0
                // memunculkan pesan,
                JOptionPane.showMessageDialog(null, "Product name not found!");
            }else if(ps.executeUpdate() == 1 && flag) { // selain itu jika, (quantity, productName) ada/1 == 1 && true
                // memunculkan pesan,
                JOptionPane.showMessageDialog(null, "Stock updated successfully");
                flag = false;
            }
        }catch(SQLException ex) {
            Logger.getLogger(Vegetable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<ProductList> tableGenerator() {
        ArrayList<ProductList> productList = new ArrayList<ProductList>();
        Connection connection = null;
        connection = MyConnection.getConnection();
        try {
            String query = "SELECT product_name, price, quantity, photo FROM vegetables";
            Statement st = connection.createStatement();
            ResultSet set = st.executeQuery(query);
            
            ProductList product;
            while(set.next()) {
                product = new ProductList(set.getString("product_name"),
                                          set.getInt("price"),
                                          set.getInt("quantity"),
                                          set.getBytes("photo"));
                productList.add(product);
            }
        }catch(SQLException ex) {
            Logger.getLogger(Vegetable.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productList;
    }
    
    public static ArrayList<ProductList> checkStock() {
        ArrayList<ProductList> productList = new ArrayList<ProductList>();
        Connection connection = null;
        connection = MyConnection.getConnection();
        try {
            String query = "SELECT product_name, price, quantity FROM vegetables";
            Statement st = connection.createStatement();
            ResultSet set = st.executeQuery(query);
            
            ProductList product;
            while(set.next()) {
                product = new ProductList(set.getString("product_name"),
                                          0, set.getInt("quantity"), null);
                productList.add(product);
            }
        }catch(SQLException ex) {
            Logger.getLogger(Vegetable.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productList;
    }
}
