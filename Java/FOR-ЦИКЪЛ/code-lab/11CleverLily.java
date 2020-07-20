package com.company;

import java.util.Scanner;

public class 11CleverLily {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washer = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) evenSum += i*5-1;
            else oddSum += toyPrice;
        }

        int price = oddSum + evenSum;

        if (washer <= price) {
            System.out.printf("Yes! %.2f", (price-washer));
        } else {
            System.out.printf("No! %.2f", (washer-price));
        }
    }
}