package com.company;

import java.util.Scanner;

public class 02_Bonus_Score {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int points = Integer.parseInt(scan.nextLine());

        double bonusPoints = 0.0;
        double totalBonusPoints = 0.0;

        if(points <= 100) {
            bonusPoints = 5;
            totalBonusPoints = points + bonusPoints;
        } else if (points > 100 && points <= 1000) {
            bonusPoints = points * 0.20;
            totalBonusPoints = points + bonusPoints;
        } else if (points > 1000) {
            bonusPoints = points * 0.10;
            totalBonusPoints = points + bonusPoints;
        }

        if(points % 2 == 0) {
            bonusPoints++;
            totalBonusPoints += 1;
        } else if(points % 5 == 0) {
            bonusPoints += 2;
            totalBonusPoints += 2;
        }

        System.out.println(bonusPoints);
        System.out.printf("%.1f",totalBonusPoints);
    }
}