package com.company;

import java.util.Scanner;

public class 05_Greeting_by_Name {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        System.out.printf("Hello, %s!",name);
    }
}