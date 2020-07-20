package com.company;

import java.util.Scanner;

public class 09Moving {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length= Integer.parseInt(scanner.nextLine());
        int height= Integer.parseInt(scanner.nextLine());

        int freeSpace = width * length * height;
        int boxSum = 0;

        String boxNumber = scanner.nextLine();

        while (!"Done".equals(boxNumber)) {
            boxSum += Integer.parseInt(boxNumber);

            if(freeSpace < boxSum) {
                System.out.printf("No more free space! You need %d Cubic meters more.",boxSum-freeSpace);
                break;
            }
            boxNumber = scanner.nextLine();
        }

        if(freeSpace > boxSum)
        System.out.printf("%d Cubic meters left.",freeSpace-boxSum);
    }
}