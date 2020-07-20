package com.company;

import java.util.Scanner;

public class 04_Vacation_Books_List {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bookPages    = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int daysCount    = Integer.parseInt(scan.nextLine());

        int sum = (bookPages / pagesPerHour) / daysCount;

        System.out.printf("%d",sum);
    }
}