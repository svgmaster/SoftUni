package com.company;

import java.util.Scanner;

public class 05Coins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());

        int coinCounter = 0;
        double coins = Math.round(sum * 100);
        while (true) {
            if(coins >= 200) {
                coins -= 200;
                coinCounter++;
            } else if (coins >= 100) {
                coins -= 100;
                coinCounter++;
            } else if (coins >= 50) {
                coins -= 50;
                coinCounter++;
            } else if (coins >= 20) {
                coins -= 20;
                coinCounter++;
            } else if (coins >= 10) {
                coins -= 10;
                coinCounter++;
            } else if (coins >= 5) {
                coins -= 5;
                coinCounter++;
            } else if (coins >= 2) {
                coins -= 2;
                coinCounter++;
            } else if (coins >= 1) {
                coins -= 1;
                coinCounter++;
            }
            if(coins <= 0) {
                break;
            }
        }
        System.out.print(coinCounter);
    }
}