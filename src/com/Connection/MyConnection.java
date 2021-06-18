package com.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

/*
    Connection: interface yang menyediakan method untuk menghubungi database.
    Statement: inteface untuk mengeksekusi query secara statis.
    PreparedStatement: interface untuk mengeksekusi query secara dinamis.
    ResultSet: interface untuk menampung data hasil query.
    DriverManager: sebuah class yang mengelola driver.
    getConnection(): untuk mendapatkan/membangun koneksi.
    createStatement(): untuk mengirim pernyataan SQL ke database.
    Class.forName(): memanggil JDBC Driver/melakukan registrasi kelas driver.
 */

public class MyConnection extends javax.swing.JFrame {
    public Connection con;
    public static Connection sCon;
    public PreparedStatement preparedStatement = null;
    public static ResultSet resultSet = null;
    public static Statement statement;
    
    public static Connection getConnection() {
        try {
            // register driver yang akan dipakai
            Class.forName("com.mysql.jdbc.Driver");
            // membuat koneksi ke database yang akan diisi parameter(db_url, user, pass) dan disimpan oleh variabel sCon(menghubungkan ke database).
            sCon = DriverManager.getConnection("jdbc:mysql://localhost/db_vegetafruit", "root", "");
            // membuat objek statement dan disimpan oleh variabel statement(mengeksekusi query)
            statement = sCon.createStatement();
        }catch(Exception e) {
            // menangkap pesan kesalahan jika belum terhubung ke database(Apache MySQL)
            JOptionPane.showMessageDialog(null, "Unable to connect to database!\nMessage: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return sCon;
    }
}
