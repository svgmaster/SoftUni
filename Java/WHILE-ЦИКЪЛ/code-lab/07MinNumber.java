package com.company;

import java.util.Scanner;

public class 07MinNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int minNumber = Integer.MAX_VALUE;

        while (!"Stop".equals(input)) {
            if(minNumber > Integer.parseInt(input)){
                minNumber = Integer.parseInt(input);
            }

            input = scanner.nextLine();
        }

        System.out.printf("%d",minNumber);
    }
}