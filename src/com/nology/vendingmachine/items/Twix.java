package com.nology.vendingmachine.items;

public class Twix extends ChocBars{
    public String name = "Twix";
    public double price = 0.70;
    public int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
