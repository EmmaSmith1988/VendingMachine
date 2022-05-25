package com.nology.vendingmachine;

import com.nology.vendingmachine.items.DairyMilk;
import com.nology.vendingmachine.items.Twix;

import java.util.ArrayList;
import java.util.Scanner;

public class Machine {
    int limit = 10;
    Twix twix = new Twix();
    DairyMilk dairyMilk = new DairyMilk();

    public int randomNumber(){
        return (int) Math.floor(Math.random()*(limit+1));
    }

    public void startup(){
        twix.setQuantity(this.randomNumber());
        dairyMilk.setQuantity(this.randomNumber());
    }

    public void displayStock(){
        if(twix.getQuantity() == 0){
            System.out.println("Twix is out of stock");
        } else {
            System.out.println("Twix - " + twix.getQuantity());
        }
        if(dairyMilk.getQuantity() == 0){
            System.out.println("Dairy Milk is out of stock");
        } else {
            System.out.println("Dairy Milk - " + dairyMilk.getQuantity());
        }
    }

    public void takeUserInput(){
        System.out.println("What would you like to do: Buy? Refill? Check stock? -> ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if(userInput.equalsIgnoreCase("buy")){
            this.buy();
        };
    }

    public void buy(){
        System.out.println("Which item would you like to buy? -> ");
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextLine().equalsIgnoreCase("dairy milk")){
            System.out.println("That will be £" + dairyMilk.price + ", please.");
            System.out.println("How much money are you entering?");
            double moneyPaid = scanner.nextDouble();
            if(moneyPaid< dairyMilk.price){
                System.out.println("That's not enough, please pay £" + (dairyMilk.price-moneyPaid));
            } else if(moneyPaid== dairyMilk.price) {
                System.out.println("Thanks, here is your item");
            } else {
                System.out.println("Thanks, here is your item and your change - " + (moneyPaid- dairyMilk.price));
            }
        };
    }

    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.startup();
        machine.displayStock();
        machine.takeUserInput();



    }
}