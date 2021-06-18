package com.Product;

public class ProductList {
    private String productName;
    private int price, quantity;
    private byte[] photo;
    
    public ProductList(String productName, int price, int quantity, byte[] photo) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.photo = photo;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }    
    
    public String getProductName() {
        return productName;
    }
    
    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public byte[] getPhoto() {
        return photo;
    }        
}
