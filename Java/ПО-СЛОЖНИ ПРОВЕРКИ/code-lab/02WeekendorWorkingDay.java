package com.company;

import java.util.Scanner;

public class 02WeekendorWorkingDay {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dayOfWeek = scan.nextLine();

        String day = "";

        switch(dayOfWeek){
            case "Monday":

            case "Tuesday":

            case "Wednesday":

            case "Thursday":

            case "Friday":
                day = "Working day";
                break;
            case "Saturday":

            case "Sunday":
                day = "Weekend";
                break;
            default:
                day = "Error";
                break;
        }
        System.out.println(day);
    }
}