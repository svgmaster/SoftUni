package com.company;

import java.util.Scanner;

public class 03_Deposit_Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double depositSum   = Double.parseDouble(scan.nextLine());
        int    mouth        = Integer.parseInt(scan.nextLine());
        double interestRate = Double.parseDouble(scan.nextLine());

        //                                          числото го преобразуваме в %
        double sum = depositSum + mouth * ((depositSum*(interestRate/100))/12);

        System.out.printf("%.2f",sum);
    }
}