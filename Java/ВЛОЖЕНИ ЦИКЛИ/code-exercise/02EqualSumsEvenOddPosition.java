package com.svgsoftware;

import java.util.Scanner;

public class 02EqualSumsEvenOddPosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        for (int i = a; i <= b; i++) {
            String curNum = "" + i;
            int sumOdd = 0;
            int sumEven = 0;
            for (int j = 0; j < curNum.length(); j++) {
                int curDigit = Integer.parseInt("" + curNum.charAt(j));
                if(j % 2 == 0){
                    sumEven+= curDigit;
                } else {
                    sumOdd += curDigit;
                }
            }

            if(sumEven == sumOdd) {
                System.out.print(i + " ");
            }
        }
    }
}
