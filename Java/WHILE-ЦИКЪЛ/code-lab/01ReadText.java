﻿package com.company;

import java.util.Scanner;

public class 01ReadText {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!"Stop".equals(input)) {
            System.out.println(input);
            input = scanner.nextLine();
        }
    }
}