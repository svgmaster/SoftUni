package com.company;

import java.util.Scanner;

public class 01Cinema {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String projection  = scan.nextLine();
        int row = Integer.parseInt(scan.nextLine());
        int columns  = Integer.parseInt(scan.nextLine());

        double price = 0.0;
        if("Premiere".equals(projection)) {
            price = row * columns * 12.0;
        } else if ("Normal".equals(projection)) {
            price = row * columns * 7.50;
        } else if ("Discount".equals(projection)) {
            price = row * columns * 5.0;
        }

        System.out.printf("%.2f leva",price);
    }
}