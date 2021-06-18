package com.Register;

import com.Connection.MyConnection;

public class Register extends MyConnection {
    // instance variable
    private String fullName, email, username, password, confirmPassword, phoneNumber;
    // ------------------------------------------------
    
    // Constructor
    public Register(String username) {
        this.username = username;
    }    
    
    public Register() {
        this.fullName = fullName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
    // ------------------------------------------------
    
    // Setter Method
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    // ------------------------------------------------
    
    // Getter Method
    public String getFullName() {
        return fullName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    // ------------------------------------------------
}