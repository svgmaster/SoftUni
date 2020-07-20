package com.company;

import java.util.Scanner;

public class 06_Godzilla_vs_Kong {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget  = Double.parseDouble(scan.nextLine());
        int    extras  = Integer.parseInt(scan.nextLine());
        double clothes = Double.parseDouble(scan.nextLine());

        double decorCost   = budget * 0.1;
        double clothesCost = extras * clothes;

        if(extras >= 150) clothesCost = clothesCost - clothesCost * 0.1;

        double totalBudget = decorCost + clothesCost;

        if(totalBudget <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget-totalBudget);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",totalBudget-budget);
        }
    }
}