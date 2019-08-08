package com.dangsan.cart.model;

import java.util.List;

public class Cart {
    private int amount = 0;
    private List<Product> products;
    private double total = 0;

    public Cart() {
    }

    public Cart(int amount, List<Product> products, double total) {
        this.amount = amount;
        this.products = products;
        this.total = total;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void addProductToCart(Product product){
        this.products.add(product);
    }

    public void removeProductInCart(Product product){
        this.products.remove(product);
    }

    public void removeAllProductInCart(){
        this.products.removeAll(products);
    }
}
