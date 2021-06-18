package com.Interface;

import com.Admin.Billing;
import com.User.User;
import com.User.About;
import com.Connection.MyConnection;
import static com.Connection.MyConnection.getConnection;
import static com.Connection.MyConnection.sCon;
import com.Product.Checkout;
import static com.Product.Checkout.cartItemTable;
import com.Product.ProductInformation;
import com.Register.Register;
import com.User.ChangePassword;
import java.sql.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
/*
    executeQuery(): Mengeksekusi perintah select.
    next(): mengarahkan kursor maju satu baris.
    setRowCount(): Menentukan ulang jumlah baris di model.
*/

public interface MyInterface {
    // parameter username: didapatkan dari, user.in_username.setText(set.getString(2)) di Kelas LoginLayout dan constructor dengan 1 parameter username di Kelas User.
    public static void myProfile(String username) {
        Connection connection = null;
        connection = MyConnection.getConnection();
        try {
            // mengambil data full_name, email, username, phone_number dari database
            String query = "SELECT full_name, email, username, phone_number FROM register WHERE username='" + username + "'";
            // mengirim pernyataan
            Statement st = connection.createStatement();
            // query akan dieksekusi dan data akan ditampung oleh set
            ResultSet set = st.executeQuery(query);
            // Menampilkan hasil query
            if(set.next()) { // jika username ditemukan/terdaftar
                Register regis = new About(username); // Upcasting, About(subclass) -> Register(superclass).
                About about = (About)regis; // Downcasting, Register(superclass) -> About(subclass).
                about.setVisible(true); // memunculkan jendela Kelas About
                about.lbl_fullName_profile_about.setText(set.getString(1)); // mengambil data query value 1, yaitu full_name
                about.lbl_email_profile_about.setText(set.getString(2)); // mengambil data query value 2, yaitu email
                about.lbl_username_profile_about.setText(set.getString(3)); // mengambil data query value 3, yaitu username
                about.lbl_phoneNumber_profile_about.setText(set.getString(4)); // mengambil data query value 4, yaitu phone_number

                about.in_username.setText(set.getString(3));
                about.lbl_user_profile_about.setText(set.getString(1)); // mengambil data query value 1, yaitu full_name
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }  
    }
    
    // parameter username: didapatkan dari: constructor dengan 1 parameter username di Kelas About
    public static void myDashboard(String username) {
        Connection connection = null;
        connection = MyConnection.getConnection();
        
        try {
            // mengambil data full_name dari database
            String query = "SELECT full_name FROM register WHERE username='" + username + "'";
            // mengirim pernyataan
            Statement st = connection.createStatement();
            // query akan dieksekusi dan data akan ditampung oleh set
            ResultSet set = st.executeQuery(query);
            // Menampilkan hasil query
            if(set.next()) { // jika username ditemukan/terdaftar
                Register register = new User(username); // Upcasting, User(subclass) -> Register(superclass)
                User user = (User)register; // Downcasting, Register(superclass) -> User(subclass)
                user.setVisible(true); // memunculkan jendela Kelas User
                
                user.lbl_customerName.setText(set.getString(1)); // mengambil data query value 1, yaitu full_name
            }
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    // parameter username: didapatkan dari: constructor dengan 1 parameter username di Kelas ChangePassword
    public static void myChangePassword(String username) {
        Connection connection = null;
        connection = MyConnection.getConnection();
        
        try {
            // mengambil data username, password dari database
            String query = "SELECT username, password FROM register WHERE username='" + username + "'";
            // mengirim pernyataan
            Statement st = connection.createStatement();
            // query akan dieksekusi dan data akan ditampung oleh set
            ResultSet set = st.executeQuery(query);
            // Menampilkan hasil query
            if(set.next()) { // jika username ditemukan/terdaftar
                Register register = new ChangePassword(username); // Upcasting, ChangePassword(subclass) -> Register(superclass)
                ChangePassword cp = (ChangePassword)register; // Downcasting, Register(superclass) -> ChangePassword(subclass)
                cp.setVisible(true); // memunculkan jendela Kelas ChangePassword
                
                cp.in_username.setText(set.getString(1)); // mengambil data query value 1, yaitu username
                cp.in_password.setText(set.getString(2)); // mengambil data query value 2, yaitu password
            }
            
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void myUsernameBilling(String username) {
        Connection connection = null;
        connection = MyConnection.getConnection();
        
        try {
            // mengambil data username, password dari database
            String query = "SELECT username, password FROM register WHERE username='" + username + "'";
            // mengirim pernyataan
            Statement st = connection.createStatement();
            // query akan dieksekusi dan data akan ditampung oleh set
            ResultSet set = st.executeQuery(query);
            // Menampilkan hasil query  
            if(set.next()) { // jika username ditemukan/terdaftar
                Checkout c = new Checkout(username); // Membuat Objek Kelas Checkout
                c.setVisible(true); // memunculkan jendela Checkout
                
                // Membuat Tabel Model
                DefaultTableModel model = (DefaultTableModel) cartItemTable.getModel();
                model.setRowCount(0); // mengeset tabel menjadi 0 baris.
                int total = 0;
                Object[] data = new Object[4]; // deklarasi array of object menjadi 4 kolom
        
                for(int i = 0; i < ProductInformation.cartItem.size(); i++) { // looping data/item keranjang
                    data[0] = ProductInformation.cartItem.get(i).getProductName(); // kolom data Product Name
                    data[1] = String.format("%,d", ProductInformation.cartItem.get(i).getPrice()); // kolom data Price/Piece
                    data[2] = String.format("%,d", ProductInformation.cartItem.get(i).getQuantity()); // kolom data Quantity
                    data[3] = String.format("%,d", ProductInformation.cartItem.get(i).getPrice()*ProductInformation.cartItem.get(i).getQuantity()); // kolom data Total Price
                    
                    model.addRow(data); // menambahkan baris data pada Tabel Model
                    cartItemTable.setRowHeight(20); // mengeset tinggi baris tabel menjadi 20
                    // total diupdate dan menyimpan hitungan, semua ProductList (harga*quantity)
                    total += ProductInformation.cartItem.get(i).getPrice()*ProductInformation.cartItem.get(i).getQuantity();
                }
                c.billLabel.setText(String.format("%,d", total));
//                c.billLabel.setText(String.valueOf(total)); // mengeset label yang menyimpan nilai total sebagai String
                
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment(JLabel.CENTER);
                c.cartItemTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer); // Product Name
                c.cartItemTable.getColumnModel().getColumn(1).setCellRenderer(centerRenderer); // Price/Piece
                c.cartItemTable.getColumnModel().getColumn(2).setCellRenderer(centerRenderer); // Quantity
                c.cartItemTable.getColumnModel().getColumn(3).setCellRenderer(centerRenderer); // Total Price
                c.in_username.setText(set.getString(1)); // mengambil data query value 1, yaitu username
            }
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
