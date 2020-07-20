package com.company;

import java.util.Scanner;

public class 06Building {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());

        for (int a = n; a >= 1; a--){
            for (int b = 0; b < k; b++){
                if(a == n) {
                    System.out.printf("L%d%d ",a,b);
                } else {
                    if(a % 2 == 0){
                        System.out.printf("O%d%d ",a,b);
                    } else {
                        System.out.printf("A%d%d ",a,b);
                    }
                }
            }
            System.out.println();
        }
    }
}