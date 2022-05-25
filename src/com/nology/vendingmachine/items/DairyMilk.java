package com.nology.vendingmachine.items;

public class DairyMilk extends ChocBars{
    public String name = "Dairy Milk";
    public double price = 1.50;
    public int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
