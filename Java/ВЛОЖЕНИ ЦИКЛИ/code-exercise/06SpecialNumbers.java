package com.svgsoftware;

import java.util.Scanner;

public class 06SpecialNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            int firstDigit = i / 1000;
            int secondDigit = i / 100 % 10;
            int thirdDigit = i / 10 % 10;
            int forthDigit = i % 10;

            boolean firstCheck = firstDigit != 0 && n % firstDigit == 0;
            boolean secondCheck = secondDigit != 0 && n % secondDigit == 0;
            boolean thirdCheck = thirdDigit != 0 && n % thirdDigit == 0;
            boolean forthCheck = forthDigit != 0 && n % forthDigit == 0;

            if(firstCheck == true && secondCheck == true && thirdCheck == true && forthCheck == true) {
                System.out.printf("%d ", i);
            }
        }

    }
}
