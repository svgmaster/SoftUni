package com.company;

import java.util.Scanner;

public class 07_Fruit_Market {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double strawberryCost  = Double.parseDouble(scan.nextLine());
        double bananasKG       = Double.parseDouble(scan.nextLine());
        double orangesKG       = Double.parseDouble(scan.nextLine());
        double raspberriesKG   = Double.parseDouble(scan.nextLine());
        double strawberryKG    = Double.parseDouble(scan.nextLine());

        double raspberriesCost = strawberryCost * 0.50;
        double orangesCost     = raspberriesCost - raspberriesCost * 0.40;
        double bananasCost     = raspberriesCost - raspberriesCost * 0.80;

        double budget = (bananasCost * bananasKG) +
        		(orangesCost * orangesKG) +
                (raspberriesCost * raspberriesKG) +
        		(strawberryCost * strawberryKG);

        System.out.printf("%.2f",budget);
    }
}