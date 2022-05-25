package com.nology.vendingmachine.items;

public enum Item {
    TWIX(0.70, "Chocolate bar"), DAIRYMILK(1.50, "Chocolate bar"), COKE(1.50, "drink"), LUCOZADE(3.25, "drink"), MCCOYS(1.25, "crisps"), WALKERS(1.75, "crisps");

    private double price;
    private String category;
    private int quantity;

    Item(double price, String category) {
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
