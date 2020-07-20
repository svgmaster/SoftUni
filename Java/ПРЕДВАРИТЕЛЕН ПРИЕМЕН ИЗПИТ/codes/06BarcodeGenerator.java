package com.company;

import java.util.Scanner;

public class 06BarcodeGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        int firstDigitStart = start / 1000;
        int secondDigitStart = start / 100 % 10;
        int thirdDigitStart = start / 10 % 10;
        int forthDigitStart = start % 10;

        int firstDigitEnd = end / 1000;
        int secondDigitEnd = end / 100 % 10;
        int thirdDigitEnd = end / 10 % 10;
        int forthDigitEnd = end % 10;

        boolean checkFirstDigit = false;
        boolean checkSecondDigit = false;
        boolean checkThirdDigit = false;
        boolean checkForthDigit = false;

        for(int one = firstDigitStart; one <= firstDigitEnd; one++){
            for (int two = secondDigitStart; two <= secondDigitEnd; two++){
                for (int tree = thirdDigitStart; tree <= thirdDigitEnd; tree++){
                    for(int four = forthDigitStart; four <= forthDigitEnd; four++){
                        checkFirstDigit = one % 2 != 0 && one != 0;
                        checkSecondDigit= two % 2 != 0 && two != 0;
                        checkThirdDigit = tree % 2 != 0 && tree != 0;
                        checkForthDigit = four % 2 != 0 && four != 0;

                        if(checkFirstDigit && checkSecondDigit && checkThirdDigit && checkForthDigit){
                            System.out.printf("%d%d%d%d ", one, two, tree, four);
                        }
                    }
                }
            }
        }
    }
}