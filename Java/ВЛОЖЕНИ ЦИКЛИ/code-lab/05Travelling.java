// 90% in judge
package com.company;

import java.util.Scanner;

public class 05Travelling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        double priceTrip = Double.parseDouble(scanner.nextLine());

        while(!destination.equals("End")) {
            double saveMoney = Double.parseDouble(scanner.nextLine());
            priceTrip -= saveMoney;
            if(priceTrip <= 0) {
                System.out.printf("Going to %s!%n",destination);
                destination = scanner.nextLine();
                if(destination.equals("End")) break;
                priceTrip = Double.parseDouble(scanner.nextLine());
            }
        }
    }
}