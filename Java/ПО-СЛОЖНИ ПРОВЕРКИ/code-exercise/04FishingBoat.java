package com.company;

import java.util.Scanner;

public class 04FishingBoat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget  = Double.parseDouble(scan.nextLine());
        String season  = scan.nextLine();
        int fishers    = Integer.parseInt(scan.nextLine());

        double totalPrice = 0.0;

        switch (season){
            case "Summer":
                if(fishers <= 6) {
                    totalPrice = 4200 - 4200 * 0.10;
                } else if (fishers > 6 && fishers <= 11) {
                    totalPrice = 4200 - 4200 * 0.15;
                } else if (fishers > 11) {
                    totalPrice = 4200 - 4200 * 0.25;
                }
                if(fishers % 2 == 0) totalPrice = totalPrice - totalPrice * 0.05;
                break;
            case "Autumn":
                if(fishers <= 6) {
                    totalPrice = 4200 - 4200 * 0.10;
                } else if (fishers > 6 && fishers <= 11) {
                    totalPrice = 4200 - 4200 * 0.15;
                } else if (fishers > 11) {
                    totalPrice = 4200 - 4200 * 0.25;
                }
                break;
            case "Spring":
                if(fishers <= 6) {
                    totalPrice = 3000 - 3000 * 0.10;
                } else if (fishers > 6 && fishers <= 11) {
                    totalPrice = 3000 - 3000 * 0.15;
                } else if (fishers > 11) {
                    totalPrice = 3000 - 3000 * 0.25;
                }
                if(fishers % 2 == 0) totalPrice = totalPrice - totalPrice * 0.05;
                break;
            case "Winter":
                if(fishers <= 6) {
                    totalPrice = 2600 - 2600 * 0.10;
                } else if (fishers > 6 && fishers <= 11) {
                    totalPrice = 2600 - 2600 * 0.15;
                } else if (fishers > 11) {
                    totalPrice = 2600 - 2600 * 0.25;
                }
                if(fishers % 2 == 0) totalPrice = totalPrice - totalPrice * 0.05;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + season);
        }

        if(totalPrice <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", totalPrice - budget);
        }
    }
}