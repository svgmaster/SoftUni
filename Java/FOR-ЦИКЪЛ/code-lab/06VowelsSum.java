package com.company;

import java.util.Scanner;

public class 06VowelsSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if('a' == letter) sum += 1;
            if('e' == letter) sum += 2;
            if('i' == letter) sum += 3;
            if('o' == letter) sum += 4;
            if('u' == letter) sum += 5;
        }
        System.out.println(sum);
    }
}