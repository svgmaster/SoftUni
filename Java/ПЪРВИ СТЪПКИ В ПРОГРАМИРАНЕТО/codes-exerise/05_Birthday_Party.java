package com.company;

import java.util.Scanner;

public class 05_Birthday_Party {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rentRoomCost    = Integer.parseInt(scan.nextLine());

        double cakeCost     = rentRoomCost * 0.20;
        double drinksCost   = cakeCost - cakeCost * 0.45;
        double animatorCost = rentRoomCost / 3;

        double budget = rentRoomCost + cakeCost + drinksCost + animatorCost;

        System.out.printf("%.1f",budget);
    }
}