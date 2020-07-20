package com.company;

import java.util.Scanner;

public class 06VetParking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double totalSum = 0.0;

        for(int day = 1; day <= days; day++){

            double sum = 0;
            for(int hour = 1; hour <= hours; hour++){

                if(day % 2 == 0 && hour % 2 == 1){
                    sum += 2.50;
                    totalSum += 2.50;
                } else if(day % 2 == 1 && hour % 2 == 0){
                    sum += 1.25;
                    totalSum += 1.25;
                } else {
                        sum += 1;
                        totalSum += 1;
                }
            }

            System.out.printf("Day: %d - %.2f leva%n", day, sum);
        }
        System.out.printf("Total: %.2f leva",totalSum);
    }
}