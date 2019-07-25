package com.dangsan.cart.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private double oldPrice;
    private double newPrice;

    public Product() {
    }

    public Product(String name, double oldPrice, double newPrice) {
        this.name = name;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
    }

    @Override
    public String toString() {
        return String.format("Product[id=%d, name='%s', oldPrice=%f, newPrice=%f]", id, name, oldPrice, newPrice);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(double newPrice) {
        this.newPrice = newPrice;
    }
}
