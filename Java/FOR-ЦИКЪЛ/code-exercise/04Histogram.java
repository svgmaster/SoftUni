package com.company;

import java.util.Scanner;

public class 04Histogram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int groupOne    = 0;
        int groupTwo    = 0;
        int groupThree  = 0;
        int groupFour   = 0;
        int groupFive   = 0;

        for (int i = 1; i <= n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if(number < 200) {
                groupOne++;
            } else if(number >= 200 && number <= 399) {
                groupTwo++;
            } else if(number >= 400 && number <= 599) {
                groupThree++;
            } else if (number >= 600 && number <= 799) {
                groupFour++;
            } else if (number >= 800) {
                groupFive++;
            }
        }

        System.out.printf("%.2f%%\n",(double)groupOne/n*100);
        System.out.printf("%.2f%%\n",(double)groupTwo/n*100);
        System.out.printf("%.2f%%\n",(double)groupThree/n*100);
        System.out.printf("%.2f%%\n",(double)groupFour/n*100);
        System.out.printf("%.2f%%",(double)groupFive/n*100);
                
    }
}