package com.company;

import java.util.Scanner;

public class 05SmallShop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        String city = scan.nextLine();
        Double quantity = Double.parseDouble(scan.nextLine());

        Double price = 0.0;

        switch (product){
            case "coffee":
                if("Sofia".equals(city)) {
                    price = quantity * 0.50;
                } else if("Plovdiv".equals(city)) {
                    price = quantity * 0.40;
                } else if("Varna".equals(city)) {
                    price = quantity * 0.45;
                }
                break;
            case "water":
                if("Sofia".equals(city)) {
                    price = quantity * 0.80;
                } else if("Plovdiv".equals(city)) {
                    price = quantity * 0.70;
                } else if("Varna".equals(city)) {
                    price = quantity * 0.70;
                }
                break;
            case "beer":
                if("Sofia".equals(city)) {
                    price = quantity * 1.20;
                } else if("Plovdiv".equals(city)) {
                    price = quantity * 1.15;
                } else if("Varna".equals(city)) {
                    price = quantity * 1.10;
                }
                break;
            case "sweets":
                if("Sofia".equals(city)) {
                    price = quantity * 1.45;
                } else if("Plovdiv".equals(city)) {
                    price = quantity * 1.30;
                } else if("Varna".equals(city)) {
                    price = quantity * 1.35;
                }
                break;
            case "peanuts":
                if("Sofia".equals(city)) {
                    price = quantity * 1.60;
                } else if("Plovdiv".equals(city)) {
                    price = quantity * 1.50;
                } else if("Varna".equals(city)) {
                    price = quantity * 1.55;
                }
                break;
        }
        System.out.println(price);
    }
}