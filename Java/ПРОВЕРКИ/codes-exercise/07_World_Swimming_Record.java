package com.company;

import java.util.Scanner;

public class 07_World_Swimming_Record {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double worldRecord  = Double.parseDouble(scan.nextLine());
        double lengthMeters = Double.parseDouble(scan.nextLine());
        double timeSeconds  = Double.parseDouble(scan.nextLine());

        double swimmingTime   = lengthMeters * timeSeconds;
        double swimmingWater  = (int)(lengthMeters / 15) * 12.5;
        double totalSwimming  = swimmingTime + swimmingWater;

        if(worldRecord > totalSwimming) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalSwimming);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",totalSwimming-worldRecord);
        }
    }
}