package com.company;

import java.util.Scanner;

public class 05DividerWithoutRemainder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        for (int i = 1; i <= num; i++){
            int number=Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0){
                p1++;
            }
            if (number % 3 == 0){
                p2++;
            }
            if (number % 4 == 0){
                p3++;
            }
        }

        double p1Result = (double) p1 / num * 100;
        double p2Result = (double) p2 / num * 100;
        double p3Result = (double) p3 / num * 100;

        System.out.printf("%.2f%%\n",p1Result);
        System.out.printf("%.2f%%\n",p2Result);
        System.out.printf("%.2f%%",p3Result);
    }
}