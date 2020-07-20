package com.company;

import java.util.Scanner;

public class 09_Yard_Greening {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double squareMaters = Double.parseDouble(scan.nextLine());

        double greeningCost = squareMaters * 7.61;
        double finalPrice = greeningCost - greeningCost * 0.18;
        double discount = greeningCost - finalPrice;

        System.out.printf("The final price is: %.2f lv.\n" +
                          "The discount is: %.2f lv.", finalPrice, discount);
    }
}