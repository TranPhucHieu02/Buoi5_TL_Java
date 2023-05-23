package com.example.buoi5.Model;

public class Product {
    private int id;
    private String name;
    private String image;
    private long price;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }
    public Product() {
    }
    public Product(int id, String name, String image, long price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
    }
}
