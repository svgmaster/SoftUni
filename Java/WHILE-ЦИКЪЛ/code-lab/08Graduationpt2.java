package com.company;

import java.util.Scanner;

public class 08Graduationpt2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String scholarName = scanner.nextLine();

        double avarageGrade = 0;
        int count = 0;
        int lowGrade = 0;


        while (count < 12) {
            count++;
            double grade = Double.parseDouble(scanner.nextLine());
            if(grade < 4) {
                lowGrade++;
            }
            if(lowGrade == 2) {
                System.out.printf("%s has been excluded at %d grade",scholarName,count-1);
                break;
            }
            avarageGrade += grade;
        }

        if(lowGrade < 2)
        System.out.printf("%s graduated. Average grade: %.2f",scholarName,(double)avarageGrade/count);
    }
}