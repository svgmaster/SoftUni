﻿package com.company;

import java.util.Scanner;

public class 02NumbersN1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}