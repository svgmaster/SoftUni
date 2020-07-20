package com.company;

import java.util.Scanner;

public class 06Cake {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int wight = Integer.parseInt(scanner.nextLine());

        int cakeSize = length*wight;
        int cakeCount = 0;
        String peiceOfCake = scanner.nextLine();
        while (!"STOP".equals(peiceOfCake)) {

            cakeCount += Integer.parseInt(peiceOfCake);

            if(cakeCount>=cakeSize) {
                break;
            }

            peiceOfCake = scanner.nextLine();
        }

        if(cakeCount>cakeSize) {
            System.out.printf("No more cake left! You need %d pieces more.",cakeCount-cakeSize);
        } else {
            System.out.printf("%d pieces are left.",cakeSize-cakeCount);
        }
    }
}