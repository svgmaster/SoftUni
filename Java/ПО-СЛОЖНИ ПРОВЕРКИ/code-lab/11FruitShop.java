package com.company;

import java.util.Scanner;

public class 11FruitShop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        double price = 0.0;

        switch(day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit) {
                    case "banana":
                        price = quantity * 2.50;
                        break;
                    case "apple":
                        price = quantity * 1.20;
                        break;
                    case "orange":
                        price = quantity * 0.85;
                        break;
                    case "grapefruit":
                        price = quantity * 1.45;
                        break;
                    case "kiwi":
                        price = quantity * 2.70;
                        break;
                    case "pineapple":
                        price = quantity * 5.50;
                        break;
                    case "grapes":
                        price = quantity * 3.85;
                        break;
                    default:
                        day = "error";
                }
                break;
            case "Saturday":
            case "Sunday":
                switch (fruit) {
                    case "banana":
                        price = quantity * 2.70;
                        break;
                    case "apple":
                        price = quantity * 1.25;
                        break;
                    case "orange":
                        price = quantity * 0.90;
                        break;
                    case "grapefruit":
                        price = quantity * 1.60;
                        break;
                    case "kiwi":
                        price = quantity * 3.00;
                        break;
                    case "pineapple":
                        price = quantity * 5.60;
                        break;
                    case "grapes":
                        price = quantity * 4.20;
                        break;
                    default:
                        day = "error";
                }
                break;
            default:
                day = "error";
                break;
        }

        if("error".equals(day)) {
            System.out.println(day);
        } else {
            System.out.printf("%.2f", price);
        }

    }
}