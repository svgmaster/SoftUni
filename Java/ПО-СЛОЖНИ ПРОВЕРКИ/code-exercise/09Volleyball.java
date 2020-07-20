package com.company;

import java.util.Scanner;

public class 09Volleyball {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String year = scan.nextLine();
        int p = Integer.parseInt(scan.nextLine());
        int h = Integer.parseInt(scan.nextLine());

        double gamesInSofia = (48-h) * 3.0 / 4.0;
        double gamesWeekend = p * (2.0 / 3.0);
        double totalGames = gamesInSofia + h + gamesWeekend;

        if("leap".equals(year)) {
            System.out.println((int)Math.floor(totalGames+totalGames*0.15));
        } else if("normal".equals(year)){
            System.out.println((int)Math.floor(totalGames));
        }
    }
}