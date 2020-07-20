package com.company;

import java.util.Scanner;

public class 03_Square_Area {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int square = Integer.parseInt(scanner.nextLine());
        int sum = square*square;

        System.out.printf("%d",sum);
    }
}