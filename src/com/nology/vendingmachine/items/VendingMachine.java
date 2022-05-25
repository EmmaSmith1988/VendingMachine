package com.nology.vendingmachine.items;



public class VendingMachine {

    public int limit = 10;

    public void displayItems() {
        for(Item item: Item.values()){
            System.out.println(item.name() + ", price £" + item.getPrice() + ", quantity: " + item.getQuantity());
        }
    }

    public int randomNumber(){
        return (int) Math.floor(Math.random()*(limit+1));
    }

    public void startup(){
        for(Item item: Item.values()){
            item.setQuantity(randomNumber());
        }
    }



    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.startup();
        vendingMachine.displayItems();
    }
}
