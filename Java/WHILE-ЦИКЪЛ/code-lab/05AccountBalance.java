package com.company;

import java.util.Scanner;

public class 05AccountBalance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fee = scanner.nextLine();

        double totalBalance = 0;

        while (!"NoMoreMoney".equals(fee)) {

            if(Double.parseDouble(fee) < 0){
                System.out.println("Invalid operation!");
                break;
            }

            totalBalance += Double.parseDouble(fee);
            System.out.printf("Increase: %.2f\n",Double.parseDouble(fee));
            fee = scanner.nextLine();
        }

        System.out.printf("Total: %.2f",totalBalance);
    }
}