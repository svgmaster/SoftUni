package com.company;

import java.util.Scanner;

public class 05Journey {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget  = Double.parseDouble(scan.nextLine());
        String season  = scan.nextLine();

        double totalPrice = 0.0;
        String destination = "";
        String place = "";

        switch (season){
            case "summer":
                place = "Camp";
                if(budget <= 100) {
                    destination = "Bulgaria";
                    totalPrice = budget * 0.30;
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    totalPrice = budget * 0.40;
                } else if (budget > 1000) {
                    destination = "Europe";
                    place = "Hotel";
                    totalPrice = budget * 0.90;
                }
                break;
            case "winter":
                place = "Hotel";
                if(budget <= 100) {
                    destination = "Bulgaria";
                    totalPrice = budget * 0.70;
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    totalPrice = budget * 0.80;
                } else if (budget > 1000) {
                    destination = "Europe";
                    totalPrice = budget * 0.90;
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + season);
        }

        System.out.println("Somewhere in " + destination);
        System.out.printf("%s - %.2f", place, totalPrice);

    }
}