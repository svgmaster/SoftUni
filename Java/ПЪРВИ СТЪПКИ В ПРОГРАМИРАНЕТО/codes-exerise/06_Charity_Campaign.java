package com.company;

import java.util.Scanner;

public class 06_Charity_Campaign {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int campaignDays    = Integer.parseInt(scan.nextLine());
        int confectioners   = Integer.parseInt(scan.nextLine());
        int cakes           = Integer.parseInt(scan.nextLine());
        int waffles         = Integer.parseInt(scan.nextLine());
        int pancakes        = Integer.parseInt(scan.nextLine());

        double cakeCost     = cakes * 45;
        double wafflesCost  = waffles * 5.80;
        double pancakesCost = pancakes * 3.20;

        double budgetConf = (cakeCost+wafflesCost+pancakesCost) * confectioners;
        double budgetAll = budgetConf * campaignDays;

        double budget = budgetAll - (budgetAll / 8);

        System.out.printf("%.2f",budget);
    }
}