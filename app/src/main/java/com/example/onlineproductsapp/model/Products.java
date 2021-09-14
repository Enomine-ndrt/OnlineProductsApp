package com.example.onlineproductsapp.model;

public class Products {
    Integer productid;
    String productName;
    String productQty;
    String productPrice;
    Integer imagenUrl;

    public Products(Integer productid,String productName, String productQty, String productPrice, Integer imagenUrl) {
        this.productid = productid;
        this.productName = productName;
        this.productQty = productQty;
        this.productPrice = productPrice;
        this.imagenUrl = imagenUrl;

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductQty() {
        return productQty;
    }

    public void setProductQty(String productQty) {
        this.productQty = productQty;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(Integer imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }
}
