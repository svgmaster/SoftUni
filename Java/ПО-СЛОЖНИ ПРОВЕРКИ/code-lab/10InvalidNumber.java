﻿package com.company;

import java.util.Scanner;

public class 10InvalidNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        if(!(number >= 100 && number <= 200) && number != 0){
            System.out.println("invalid");
        }
    }
}