package com.company;

import java.util.Scanner;

public class 04_Inches_to_Centimeters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double inches = Double.parseDouble(scan.nextLine());
        double calc = inches*2.54;

        System.out.printf("%.2f",calc);
    }
}