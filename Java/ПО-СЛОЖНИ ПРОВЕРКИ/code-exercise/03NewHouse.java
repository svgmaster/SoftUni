package com.company;

import java.util.Scanner;

public class 03NewHouse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flowerType  = scan.nextLine();
        int flowerCount     = Integer.parseInt(scan.nextLine());
        int budget          = Integer.parseInt(scan.nextLine());

        double totalPrice = 0.0;

        switch (flowerType){
            case "Roses":
                totalPrice = flowerCount * 5;

                if(flowerCount > 80) {
                    totalPrice = totalPrice - totalPrice * 0.1;
                }
                break;
            case "Dahlias":
                totalPrice = flowerCount * 3.8;

                if(flowerCount > 90) {
                    totalPrice = totalPrice - totalPrice * 0.15;
                }
                break;
            case "Tulips":
                totalPrice = flowerCount * 2.8;

                if(flowerCount > 80) {
                    totalPrice = totalPrice - totalPrice * 0.15;
                }
                break;
            case "Narcissus":
                totalPrice = flowerCount * 3;

                if(flowerCount < 120) {
                    totalPrice = totalPrice + totalPrice * 0.15;
                }
                break;
            case "Gladiolus":
                totalPrice = flowerCount * 2.5;

                if(flowerCount < 80) {
                    totalPrice = totalPrice + totalPrice * 0.2;
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + flowerType);
        }

        if(totalPrice <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, budget-totalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - budget);
        }
    }
}