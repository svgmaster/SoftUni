﻿package com.company;

public class 01NumbersEndingin7 {

    public static void main(String[] args) {

        for (int i = 7; i <= 997; i++) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}