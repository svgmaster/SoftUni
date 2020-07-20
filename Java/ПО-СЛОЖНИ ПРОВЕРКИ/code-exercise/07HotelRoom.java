package com.company;

import java.util.Scanner;

public class 07HotelRoom {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String mouth = scan.nextLine();
        int nights   = Integer.parseInt(scan.nextLine());

        double studioPrice = 0.0;
        double apartmentPrice = 0.0;
        
        switch (mouth) {
            case "May":
            case "October":
                studioPrice = 50 * nights;
                apartmentPrice = 65 * nights;

                if(nights > 7 && nights <= 14) {
                    studioPrice = studioPrice - studioPrice * 0.05;
                } else if (nights > 14) {
                    studioPrice = studioPrice - studioPrice * 0.30;
                }
                break;
            case "June":
            case "September":
                studioPrice = 75.20 * nights;
                apartmentPrice = 68.70 * nights;

                if (nights > 14) {
                    studioPrice = studioPrice - studioPrice * 0.20;
                }
                break;
            case "July":
            case "August":
                studioPrice = 76 * nights;
                apartmentPrice = 77 * nights;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + mouth);
        }

        if(nights > 14) apartmentPrice = apartmentPrice - apartmentPrice * 0.10;

        System.out.printf("Apartment: %.2f lv.\n",apartmentPrice);
        System.out.printf("Studio: %.2f lv.",studioPrice);
    }
}