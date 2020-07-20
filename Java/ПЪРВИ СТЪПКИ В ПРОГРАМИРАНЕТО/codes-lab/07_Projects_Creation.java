package com.company;

import java.util.Scanner;

public class 07_Projects_Creation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String architectName = scan.nextLine();
        int projectNumber = Integer.parseInt(scan.nextLine());
        int projectHours = projectNumber*3;

        System.out.printf("The architect %s will need %d hours to complete" +
                " %d project/s.",architectName,projectHours,projectNumber);
    }
}