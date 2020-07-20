package com.company;

import java.util.Scanner;

public class 07_Toy_Shop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tourCost  = Double.parseDouble(scan.nextLine());
        int puzzles      = Integer.parseInt(scan.nextLine());
        int talkingDolls = Integer.parseInt(scan.nextLine());
        int teddyBears   = Integer.parseInt(scan.nextLine());
        int minions      = Integer.parseInt(scan.nextLine());
        int trucks       = Integer.parseInt(scan.nextLine());

        double puzzlesCost    = puzzles * 2.60;
        int talkingDollsCost  = talkingDolls * 3;
        double teddyBearsCost = teddyBears * 4.10;
        double minionsCost    = minions * 8.20;
        int trucksCost        = trucks * 2;

        int itemsCount = puzzles + talkingDolls + teddyBears + minions + trucks;

        double price = puzzlesCost + talkingDollsCost + teddyBearsCost + minionsCost + trucksCost;
        double discount = price - price * 0.25;
        double totalPrice = 0.0;

        if(itemsCount >= 50) {
            totalPrice  = discount - discount * 0.10;
        } else {
            totalPrice  = price - price * 0.10;
        }

        if(tourCost <= totalPrice){
            System.out.printf("Yes! %.2f lv left.", totalPrice - tourCost);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", tourCost - totalPrice);
        }
    }
}