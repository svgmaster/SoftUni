package com.company;

import java.util.Scanner;

public class 05BestPlayer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player = scanner.nextLine();

        int bestPlayerGoals = Integer.MIN_VALUE;
        String bestPlayer = "";

        while(!player.equals("END")){
            int goals = Integer.parseInt(scanner.nextLine());

            if(goals > bestPlayerGoals){
                bestPlayer = player;
                bestPlayerGoals = goals;
            }

            if(goals >= 10){
                break;
            }

            player = scanner.nextLine();
        }

        System.out.println(bestPlayer + " is the best player!");

        if(bestPlayerGoals >= 3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!",bestPlayerGoals);
        } else {
            System.out.printf("He has scored %d goals.",bestPlayerGoals);
        }
    }
}