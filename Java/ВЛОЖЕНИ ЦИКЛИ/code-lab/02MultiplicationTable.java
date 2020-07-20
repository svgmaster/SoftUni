package com.company;

import java.util.Scanner;

public class 02MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int a = 1; a<= 10; a++){
            for (int b = 1; b <= 10; b++){
                int result = a * b;
                System.out.printf("%d * %d = %d%n",a,b,result);
            }
        }
    }
}