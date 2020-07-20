package com.company;

import java.util.Scanner;

public class 03Vacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());

        int daysCount = 0;
        int spadingCount = 0;

        while (ownedMoney < neededMoney && spadingCount < 5) {
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            daysCount++;

            if("save".equals(action)){
                ownedMoney += money;
                spadingCount = 0;
            } else if ("spend".equals(action)) {
                ownedMoney -= money;
                spadingCount++;
                if(ownedMoney < 0){
                    ownedMoney = 0;
                }
            }
        }

        if(spadingCount == 5) {
            System.out.println("You can't save the money.");
            System.out.println(daysCount);
        } else if(ownedMoney >= neededMoney){
            System.out.printf("You saved the money for %d days.",daysCount);
        }
    }
}