package com.company;

import java.util.Scanner;

public class 03AluminumJoinery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String delivery = scanner.nextLine();

        double price;
        double discount = 0;
        double totalPrice = 0;

        if(count > 10) {
            switch (type){
                case "90X130":
                    price = 110 * count;
                    if(count > 30 && count <= 60) {
                        discount = price - price * 0.05;
                    } else if(count > 60){
                        discount = price - price * 0.08;
                    } else if(count <= 30){
                        discount = price;
                    }
                    break;
                case "100X150":
                    price = 140 * count;
                    if(count > 40 && count <= 80) {
                        discount = price - price * 0.06;
                    } else if(count > 80){
                        discount = price - price * 0.10;
                    } else if(count <= 40){
                        discount = price;
                    }
                    break;
                case "130X180":
                    price = 190 * count;
                    if(count > 20 && count <= 50) {
                        discount = price - price * 0.07;
                    } else if(count > 50){
                        discount = price - price * 0.12;
                    } else if(count <= 20){
                        discount = price;
                    }
                    break;
                case "200X300":
                    price = 250 * count;
                    if(count > 25 && count <= 50) {
                        discount = price - price * 0.09;
                    } else if(count > 50){
                        discount = price - price * 0.14;
                    } else if(count <= 25){
                        discount = price;
                    }
                    break;
            }

            totalPrice = discount; 
          
            if(delivery.equals("With delivery")){
                totalPrice = discount + 60;
            } else if(delivery.equals("Without delivery")) {
                totalPrice = discount;
            }

            if(count > 99) {
                totalPrice = totalPrice - totalPrice * 0.04;
            }

            System.out.printf("%.2f BGN", totalPrice);
        } else {
            System.out.println("Invalid order");
        }
    }
}