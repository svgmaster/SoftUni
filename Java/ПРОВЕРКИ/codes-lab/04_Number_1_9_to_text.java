﻿package com.company;

import java.util.Scanner;

public class 04_Number_1_9_to_text {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number  = Integer.parseInt(scan.nextLine());
        
        if(number == 1) {
        	System.out.println("One");
        } else if (number == 2) {
        	System.out.println("Two");
        } else if (number == 3) {
        	System.out.println("Three");
        }	else if (number == 4) {
        	System.out.println("Four");
        } else if (number == 5) {
        	System.out.println("Five");
        }	else if (number == 6) {
        	System.out.println("Six");
        } else if (number == 7) {
        	System.out.println("Seven");
        } else if (number == 8) {
        	System.out.println("Eight");
        } else if (number == 9) {
        	System.out.println("Nine");
        } else if (number >= 10) {
        	System.out.println("number too big");
        }
    }
}