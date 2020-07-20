package com.company;

import java.util.Scanner;

public class 07CinemaTickets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int ticketCounter = 0;
        int studentCount = 0;
        int standardCount = 0;
        int kidCount = 0;

        while(!movie.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int getSeats = 0;

            while(true) {
                String ticketType = scanner.nextLine();
                if("End".equals(ticketType)){
                    break;
                }
                ticketCounter++;

                switch (ticketType){
                    case "student":
                        studentCount++;
                        break;
                    case "standard":
                        standardCount++;
                        break;
                    case "kid":
                        kidCount++;
                        break;
                }
                getSeats++;
                if(getSeats >= freeSeats){
                    break;
                }
            }

            double percentTotal = getSeats * 1.0 / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n",movie ,percentTotal);
            movie = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", ticketCounter);
        double percentStudent = studentCount * 1.0 / ticketCounter * 100;
        System.out.printf("%.2f%% student tickets.%n", percentStudent);
        double percentStandard = standardCount * 1.0 / ticketCounter * 100;
        System.out.printf("%.2f%% standard tickets.%n", percentStandard);
        double percentKid = kidCount * 1.0 / ticketCounter * 100;
        System.out.printf("%.2f%% kids tickets.", percentKid);
    }
}