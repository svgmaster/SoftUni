package com.company;

import java.util.Scanner;

public class 01FoodDelivery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double sumMenus = chickenMenu * 10.35 + fishMenu * 12.40 + vegetarianMenu * 8.15;

        double dessertPrice = 0.2 * sumMenus;

        double totalSum = sumMenus + dessertPrice + 2.50;

        System.out.printf("Total: %.2f", totalSum);
    }
}