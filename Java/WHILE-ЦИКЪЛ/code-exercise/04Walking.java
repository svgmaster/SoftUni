package com.company;

import java.util.Scanner;

public class 04Walking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String steps = scanner.nextLine();

        int neededSteps = 10000;
        int stepsCounter = 0;

        while (!"Going home".equals(steps)) {
            stepsCounter += Integer.parseInt(steps);

            if(stepsCounter >= neededSteps) {
                break;
            }

            steps = scanner.nextLine();
        }

        if("Going home".equals(steps)) stepsCounter += Integer.parseInt(scanner.nextLine());

        if(stepsCounter >= neededSteps) {
            System.out.printf("Goal reached! Good job!%n");
            System.out.printf("%d steps over the goal!",(stepsCounter-neededSteps));
        } else {
            System.out.printf("%d more steps to reach goal.%n",neededSteps-stepsCounter);
        }
    }
}