package com.company;

import java.util.Scanner;

public class 08OnTimefortheExam {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int examHour       = Integer.parseInt(scan.nextLine());
        int examMinutes    = Integer.parseInt(scan.nextLine());
        int arrivalHour    = Integer.parseInt(scan.nextLine());
        int arrivalMinutes = Integer.parseInt(scan.nextLine());

		int examTime = examMinutes + examHour * 60;
        int arrivalTime = arrivalMinutes + arrivalHour * 60;
        int difference;

        if (arrivalTime > examTime) {
            System.out.println("Late");
            difference = arrivalTime - examTime;
            if (difference < 60) {
                System.out.printf("%d minutes after the start", difference); /
            } else if (difference >= 60 && difference % 60 != 0) 
            {
                if (difference % 60 < 10) {
                    System.out.printf("%d:0%d hours after the start", difference / 60, difference % 60); //“hh:mm hours after the start”
                } else {
                    System.out.printf("%d:%d hours after the start", difference / 60, difference % 60); //“hh:mm hours after the start”
                }
            } else if (difference >= 60 && difference % 60 == 0)
            {
                System.out.printf("%d:00 hours after the start", difference / 60);
            }
        } else if (arrivalTime <= examTime && arrivalTime >= (examTime - 30)) {
            difference = examTime - arrivalTime;
            if (difference == 0) {
                System.out.println("On time");
            } else {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", difference);
            }
        } else if (arrivalTime <= examTime && (examTime - 30) > arrivalTime) {
            difference = examTime - arrivalTime;
            System.out.println("Early");
            if (difference >= 60) {
                if (difference % 60 != 0) {
                    if (difference % 60 < 10) {
                        System.out.printf("%d:0%d hours before the start", difference / 60, difference % 60); 
                    } else {
                        System.out.printf("%d:%d hours before the start", difference / 60, difference % 60); //“hh:mm hours before the start”
                    }
                } else if (difference % 60 == 0) {
                    System.out.printf("%d:00 hours before the start", difference / 60);
                }
            } else {
                System.out.printf("%d minutes before the start", difference); 
            }
        }
    }
}