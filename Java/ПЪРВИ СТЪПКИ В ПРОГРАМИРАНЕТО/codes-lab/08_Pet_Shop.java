package com.company;

import java.util.Scanner;

public class 08_Pet_Shop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dogNumbers = Integer.parseInt(scan.nextLine());
        int otherAnimals = Integer.parseInt(scan.nextLine());
        
        double dogFoodCost = dogNumbers * 2.50;
        int otherFoodCost = otherAnimals * 4;
        double sum = dogFoodCost + otherFoodCost;

        System.out.printf("%.1f lv.",sum);
    }
}