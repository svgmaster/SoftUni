package com.company;

import java.util.Scanner;

public class 04TouristShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String productName = scanner.nextLine();

        int countProducts = 0;
        double totalPrice = 0.0;

        while(!productName.equals("Stop")){

            double productPrice = Double.parseDouble(scanner.nextLine());
            countProducts++;

            if(countProducts % 3 == 0){
                productPrice /= 2;
            }

            budget -= productPrice;
            totalPrice += productPrice;

            if(budget < 0){
                System.out.printf("You don't have enough money!%n");
                System.out.printf("You need %.2f leva!",Math.abs(budget));
                break;
            }

            productName = scanner.nextLine();
        }

        if(productName.equals("Stop")){
            System.out.printf("You bought %d products for %.2f leva.",countProducts ,totalPrice);
        }
    }
}