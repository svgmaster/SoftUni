package com.company;

import java.util.Scanner;

public class 02Password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user  = scanner.nextLine();
        String pass  = scanner.nextLine();
        String input = scanner.nextLine();

        while (!pass.equals(input)) {
            input = scanner.nextLine();
        }

        System.out.println("Welcome " + user + "!");
    }
}