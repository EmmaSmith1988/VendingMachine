package com.nology.vendingmachine.items;


import java.util.Scanner;

public class VendingMachine {

    public int limit = 10;

    public void displayItems() {
        for(Item item: Item.values()){
            if (item.getQuantity() == 0){
                System.out.println(item.name() + " is out of stock");
            } else {
                System.out.println(item.name() + ", price £" + item.getPrice() + ", quantity: " + item.getQuantity());
            }
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

    public void buy(){
        System.out.println("Which item would you like to buy? -> ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        for (Item item: Item.values()) {
            if(userInput.equalsIgnoreCase(String.valueOf(item))){
                System.out.println("That will be £" + item.getPrice() + ", please.");
                System.out.println("How much money are you entering?");
                double moneyPaid = scanner.nextDouble();
                if(moneyPaid< item.getPrice()){
                    System.out.println("That's not enough, please pay £" + (item.getPrice()-moneyPaid));
                } else if(moneyPaid== item.getPrice()) {
                    System.out.println("Thanks, here is your item");
                } else {
                    System.out.println("Thanks, here is your item and your change - £" + (moneyPaid- item.getPrice()));
                }
            }
        }
    }



    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.startup();
        vendingMachine.displayItems();
        vendingMachine.buy();
    }
}
