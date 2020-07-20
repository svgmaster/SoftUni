package com.company;

import java.util.Scanner;

public class 03OddEvenPosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        double oddmaxnumber=-1000000000.0;
        double evenmaxnumber=-1000000000.0;
        double oddminnumber=1000000000.0;
        double evenminnumber=1000000000.0;
        double oddsum=0;
        double evensum=0;

        for (int i =1; i <=num; i ++){
            double currentnumber=Double.parseDouble(scanner.nextLine());
            if (i%2==0){
                evensum+=currentnumber;
                if (currentnumber>evenmaxnumber){
                    evenmaxnumber=currentnumber;
                }
                if (currentnumber<evenminnumber){
                    evenminnumber=currentnumber;
                }
            }
            else {
                oddsum+=currentnumber;
                if (currentnumber>oddmaxnumber){
                    oddmaxnumber=currentnumber;
                }
                if (currentnumber<oddminnumber){
                    oddminnumber=currentnumber;
                }
            }
        }

        System.out.printf("OddSum=%.2f,\n", oddsum);
        if (oddminnumber != 1000000000.0) {
            System.out.printf("OddMin=%.2f,\n", oddminnumber);
        } else {
            System.out.println("OddMin=No,");
        }
        if (oddmaxnumber != -1000000000.0) {
            System.out.printf("OddMax=%.2f,\n", oddmaxnumber);
        } else {
            System.out.println("OddMax=No,");
        }
        System.out.printf("EvenSum=%.2f,\n", evensum);
        if (evenminnumber != 1000000000.0) {
            System.out.printf("EvenMin=%.2f,\n", evenminnumber);
        } else {
            System.out.println("EvenMin=No,");
        }
        if (evenmaxnumber != -1000000000.0) {
            System.out.printf("EvenMax=%.2f\n", evenmaxnumber);
        } else {
            System.out.println("EvenMax=No");
        }
    }
}