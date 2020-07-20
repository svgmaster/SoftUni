package com.company;

import java.util.Scanner;

public class 03SumNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number  = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (number > sum) {
            sum += Integer.parseInt(scanner.nextLine());
        }

        System.out.println(sum);
    }
}