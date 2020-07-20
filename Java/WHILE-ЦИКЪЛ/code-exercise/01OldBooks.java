//55% in judge
package com.company;

import java.util.Scanner;

public class 01OldBooks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        String input = scanner.nextLine();
        int count = 0;
        boolean isFound = false;

        while (!"No More Books".equals(input)) {
            if(bookName.equals(input)) {
                isFound = true;
                System.out.printf("You checked %d books and found it.",count);
                break;
            }
            count++;
            input = scanner.nextLine();
        }

        if(!isFound)
        System.out.printf("The book you search is not here!%nYou checked %d books.",count);
    }
}