package com.company;

import java.util.Scanner;

public class 01AgencyProfit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String aircraftCompany = scanner.nextLine();
        int ticketNumber = Integer.parseInt(scanner.nextLine());
        int childrenTicketNumber = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        double servicePrice = Double.parseDouble(scanner.nextLine());

        double priceChildren = ticketPrice - ticketPrice * 0.70;
        double totalPricePerMen = ticketPrice + servicePrice;
        double totalChildrenPrice = priceChildren + servicePrice;

        double totalPrice = (totalChildrenPrice * childrenTicketNumber) + (totalPricePerMen * ticketNumber);
        double profit = totalPrice * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", aircraftCompany, profit);
    }
}