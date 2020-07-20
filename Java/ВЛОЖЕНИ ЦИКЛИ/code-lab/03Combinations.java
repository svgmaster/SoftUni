package com.company;

import java.util.Scanner;

public class 03Combinations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int a = 0; a<= n; a++){
            for (int b = 0; b <= n; b++){
                for (int i = 0; i <= n; i++) {
                    if(a+b+i == n) {
                        counter++;
                    }
                }
            }
        }

        System.out.println(counter);
    }
}