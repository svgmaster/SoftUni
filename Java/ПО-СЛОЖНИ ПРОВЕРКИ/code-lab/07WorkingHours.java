package com.company;

import java.util.Scanner;

public class 07WorkingHours {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int workingTime = Integer.parseInt(scan.nextLine());
        String dayOfWeek = scan.nextLine();

        String openClose = "";

        switch(dayOfWeek){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if(workingTime >= 10 && workingTime <= 18) {
                    openClose = "open";
                } else {
                    openClose = "closed";
                }
                break;
            case "Sunday":
                openClose = "closed";
                break;
        }
        System.out.println(openClose);
    }
}