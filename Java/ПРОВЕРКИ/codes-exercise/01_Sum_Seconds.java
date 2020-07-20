package com.company;

import java.util.Scanner;

public class 01_Sum_Seconds {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int oneTime    = Integer.parseInt(scan.nextLine());
        int secondTime = Integer.parseInt(scan.nextLine());
        int thirdTime  = Integer.parseInt(scan.nextLine());

        int totalTime = oneTime + secondTime + thirdTime;

        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        if(seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}