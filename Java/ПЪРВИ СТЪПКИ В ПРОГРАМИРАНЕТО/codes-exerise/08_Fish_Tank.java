package com.company;

import java.util.Scanner;

public class 08_Fish_Tank {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length      = Integer.parseInt(scan.nextLine());
        int width       = Integer.parseInt(scan.nextLine());
        int height      = Integer.parseInt(scan.nextLine());
        double percent  = Double.parseDouble(scan.nextLine());

        int    volumeOfTank     = length * width * height;
        double totalLitersWater = volumeOfTank * 0.001;
        double percentOfWater   = 1 - percent / 100;

        double totalLiters = totalLitersWater * percentOfWater;

        System.out.printf("%.2f",totalLiters);
    }
}