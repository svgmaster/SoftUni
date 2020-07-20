package com.company;

import java.util.Scanner;

public class 02AddBags {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceBags = Double.parseDouble(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());

        double pricePerBags = 0;
        double totalPrice = 0;

        if(weight < 10) {
            pricePerBags = priceBags * 0.20;
        } else if(weight >= 10 && weight <= 20) {
            pricePerBags = priceBags * 0.50;
        } else if( weight > 20) {
            pricePerBags = priceBags;
        }

        totalPrice = pricePerBags;

        if(days > 30) {
            totalPrice += pricePerBags * 0.10;
        } else if(days >= 7 && days <= 30) {
            totalPrice += pricePerBags * 0.15;
        } else if( days < 7) {
            totalPrice += pricePerBags * 0.40;
        }

        System.out.printf("The total price of bags is: %.2f lv. ", totalPrice * count);
    }
}