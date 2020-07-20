package com.company;

import java.util.Scanner;

public class 02Safari {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double liters = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double expenses = liters * 2.10 + 100;

        if(day.equals("Saturday")) {
            expenses = expenses - 0.10 * expenses;
        } else if(day.equals("Sunday")) {
            expenses = expenses - 0.20 * expenses;
        }

        if(budget >= expenses) {
            double leftMoney = budget - expenses;
            System.out.printf("Safari time! Money left: %.2f lv.",leftMoney);
        } else {
            double needMoney = expenses - budget;
            System.out.printf("Not enough money! Money needed: %.2f lv.",needMoney);
        }
    }
}