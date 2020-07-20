package com.company;

import java.util.Scanner;

public class 08_Scholarship {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double income  = Double.parseDouble(scan.nextLine());
        double average = Double.parseDouble(scan.nextLine());
        double salary  = Double.parseDouble(scan.nextLine());

        double  socialScholarship    = 0;
        double  excellentScholarship = 0;
        boolean getScholarship       = false;

        if (income < salary && average > 4.50) {
            socialScholarship = Math.floor (salary * 0.35);
            getScholarship = true;
        }
        if (average >= 5.50) {
            excellentScholarship = Math.floor (average * 25);
            getScholarship = true;
         }
         if (getScholarship) {
             if (excellentScholarship > socialScholarship) {
                 System.out.printf ("You get a scholarship for excellent results %.0f BGN", excellentScholarship);
             }
             else
                 System.out.printf ("You get a Social scholarship %.0f BGN", socialScholarship);
         } else {
                 System.out.println("You cannot get a scholarship!");
         }
    }
}