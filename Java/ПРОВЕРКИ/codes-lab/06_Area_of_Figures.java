package com.company;

import java.util.Scanner;

public class 06_Area_of_Figures {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String shape = scan.nextLine();

        switch(shape) {
            case "square":
                double a = Double.parseDouble(scan.nextLine());
                double squareArea = Math.pow(a, 2);
                System.out.printf("%.3f", squareArea);
                break;
            case "rectangle":
                double w = Double.parseDouble(scan.nextLine());
                double l = Double.parseDouble(scan.nextLine());
                double rectangleArea = w * l;
                System.out.printf("%.3f", rectangleArea);
                break;
            case "circle":
                double r = Double.parseDouble(scan.nextLine());
                double circleArea = Math.PI * Math.pow(r, 2);
                System.out.printf("%.3f", circleArea);
                break;
            case "triangle":
                double b = Double.parseDouble(scan.nextLine());
                double h = Double.parseDouble(scan.nextLine());
                double triangleArea = 0.5 * b * h;
                System.out.printf("%.3f", triangleArea);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + shape);
        }
    }
}