package com.Admin;

public class BillObject {
    private int bill;
    private String username, date, address;
 
    public BillObject(String username, int bill, String date, String address) {
        this.username = username;
        this.bill = bill;
        this.date = date;
        this.address = address;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setBill(int bill) {
        this.bill = bill;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public int getBill() {
        return bill;
    }
    
    public String getDate() {
        return date;
    }
    
    public String getAddress() {
        return address;
    }
}