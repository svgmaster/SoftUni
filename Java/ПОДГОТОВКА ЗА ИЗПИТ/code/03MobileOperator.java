package com.company;

import java.util.Scanner;

public class 03MobileOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String years = scanner.nextLine();
        String type = scanner.nextLine();
        String hasInternet = scanner.nextLine();

        int months = Integer.parseInt(scanner.nextLine());

        double priceContract = 0.0;
        if(years.equals("one")) {
            switch (type) {
                case "Small":
                    priceContract = 9.98;
                    break;
                case "Middle":
                    priceContract = 18.99;
                    break;
                case  "Large":
                    priceContract =  25.98;
                    break;
                case  "ExtraLarge":
                    priceContract = 35.99;
                    break;
            }
        } else if(years.equals("two")) {
            switch (type) {
                case "Small":
                    priceContract = 8.58;
                    break;
                case "Middle":
                    priceContract = 17.09;
                    break;
                case  "Large":
                    priceContract =  23.59;
                    break;
                case  "ExtraLarge":
                    priceContract = 31.79;
                    break;
            }
        }

        if(hasInternet.equals("yes")) {
            if(priceContract <= 10){
                priceContract += 5.50;
            } else if(priceContract <= 30) {
                priceContract += 4.35;
            } else {
                priceContract += 3.85;
            }
        }

        if(years.equals("two")) {
            priceContract -= priceContract * 0.0375;
        }

        double sum = months * priceContract;
        System.out.printf("%.2f lv.",sum);
    }
}