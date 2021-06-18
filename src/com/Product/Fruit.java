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

public class Fruit {
    public static boolean flag = false;
    static PreparedStatement ps;
    
    public static void updateFruit(String productName, int quantity) {
        String query = "UPDATE fruits SET quantity=? WHERE product_name=?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setInt(1, quantity);
            ps.setString(2, productName);
            if(ps.executeUpdate() == 0) {
                JOptionPane.showMessageDialog(null, "Product name not found!");
            }else if(ps.executeUpdate() == 1 && flag) {
                JOptionPane.showMessageDialog(null, "Stock updated successfully");
                flag = false;
            }
        }catch(SQLException ex) {
            Logger.getLogger(Vegetable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<ProductList> tableGenerator() {
        ArrayList<ProductList> productList = new ArrayList<>();
        Connection connection = null;
        connection = MyConnection.getConnection();
        try {
            String query = "SELECT product_name, price, quantity, photo FROM fruits";
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
            String query = "SELECT product_name, price, quantity FROM fruits";
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