package com.company;

import java.util.Scanner;

public class 06MaxNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int maxNumber = Integer.MIN_VALUE;

        while (!"Stop".equals(input)) {
            if(maxNumber < Integer.parseInt(input)){
                maxNumber = Integer.parseInt(input);
            }

            input = scanner.nextLine();
        }

        System.out.printf("%d",maxNumber);
    }
}