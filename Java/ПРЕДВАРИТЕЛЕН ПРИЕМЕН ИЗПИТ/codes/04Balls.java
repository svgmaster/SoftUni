package com.company;

import java.util.Scanner;

public class 04Balls {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ballNumber = Integer.parseInt(scanner.nextLine());

        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int otherBalls = 0;
        int blackBalls = 0;

        int totalBallsPoints = 0;


        for (int i = 1; i <= ballNumber; i++) {
            String ballColor = scanner.nextLine();
            switch (ballColor){
                case "red":
                    totalBallsPoints += 5;
                    redBalls++;
                    break;
                case "orange":
                    totalBallsPoints += 10;
                    orangeBalls++;
                    break;
                case "yellow":
                    totalBallsPoints += 15;
                    yellowBalls++;
                    break;
                case "white":
                    totalBallsPoints += 20;
                    whiteBalls++;
                    break;
                case "black":
                    totalBallsPoints /= 2;
                    blackBalls++;
                    break;
                default:
                    otherBalls++;
                    break;
            }
        }

        System.out.printf("Total points: %d%n",totalBallsPoints);
        System.out.printf("Points from red balls: %d%n",redBalls);
        System.out.printf("Points from orange balls: %d%n",orangeBalls);
        System.out.printf("Points from yellow balls: %d%n",yellowBalls);
        System.out.printf("Points from white balls: %d%n",whiteBalls);
        System.out.printf("Other colors picked: %d%n",otherBalls);
        System.out.printf("Divides from black balls: %d",blackBalls);
    }
}