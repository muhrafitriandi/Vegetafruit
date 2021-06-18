package com.Admin;

import com.Connection.MyConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BillingDB {    
    public static void insertIntoBillingDB(String username, int price, String date, String address) {
        try {
            Connection connection = MyConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement("INSERT INTO billing(username, total_bill, date, address) VALUES(?, ?, ?, ?)");
            
            ps.setString(1, username);
            ps.setInt(2, price);
            ps.setString(3, date);
            ps.setString(4, address);
            
            ps.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(BillingDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public static ArrayList<BillObject> billlings(){
        ArrayList<BillObject> customers = new ArrayList<BillObject>();
        Connection connection = null;
        connection = MyConnection.getConnection();
        try {
            String query = "SELECT username, total_bill, date, address FROM billing";
            Statement st = connection.createStatement();
            ResultSet set = st.executeQuery(query);
            
            BillObject bo;
            while(set.next()){
                bo = new BillObject(set.getString("username"),
                                    set.getInt("total_bill"),
                                    set.getString("date"),
                                    set.getString("address"));
                customers.add(bo);
            }
        }catch (SQLException ex) {
            Logger.getLogger(BillingDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers;
    }        
}