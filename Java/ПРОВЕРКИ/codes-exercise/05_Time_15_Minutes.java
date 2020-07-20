package com.company;

import java.util.Scanner;

public class 05_Time_15_Minutes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours   = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int hour   = hours;
        int minute = minutes;

        if(minutes <= 59) {
            minute += 15;

            if(minute > 59) {
                minute -= 60;
                hour = hours + 1;

                if(hour > 23)  hour -= 24;

                if(minute < 9) {
                    System.out.printf("%d:0%d", hour, minute);
                } else {
                    System.out.printf("%d:%d", hour, minute);
                }
            } else {
                System.out.printf("%d:%d", hour, minute);
            }
        }
    }
}