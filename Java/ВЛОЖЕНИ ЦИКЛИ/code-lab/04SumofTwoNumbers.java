package com.company;

import java.util.Scanner;

public class 04SumofTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean founded = false;

        for (int a = n; a <= k; a++){
            for (int b = n; b <= k; b++){
                counter++;
                if(a+b == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, a, b, magicNum);
                    founded = true;
                    break;
                }
            }
            if(founded) {
                break;
            }
        }

        if(!founded){
            System.out.printf("%d combinations - neither equals %d", counter, magicNum);
        }
    }
}