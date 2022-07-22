package com.myntra.model.entity;

import javax.persistence.*;

/**
 *  MVC
 *  Controller  => Dao
 *
 *  - Presentation Logic
 *  - Business Logic
 *  - Data Logic
 */
@Entity
@Table(name = "product")
public class ClothingItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String type;
    @Column
    private String size;
    @Column
    private String imgUrl;
    @Column
    private double price;
    @Column
    private int quantity;

    public ClothingItem() {

    }

    public ClothingItem(long id, String type, String size, String imgUrl, double price, int quantity) {
        this.id = id;
        this.type = type;
        this.size = size;
        this.imgUrl = imgUrl;
        this.price = price;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
