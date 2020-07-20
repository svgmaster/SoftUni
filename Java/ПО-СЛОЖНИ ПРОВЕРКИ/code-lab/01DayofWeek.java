package com.company;

import java.util.Scanner;

public class 01DayofWeek {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dayOfWeek = Integer.parseInt(scan.nextLine());

        String day = "";

        switch(dayOfWeek){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Error";
                break;
        }
        System.out.println(day);
    }
}