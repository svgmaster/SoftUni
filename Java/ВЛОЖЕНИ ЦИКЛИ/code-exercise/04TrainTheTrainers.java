package com.svgsoftware;

import java.util.Scanner;

public class 04TrainTheTrainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jury = Integer.parseInt(scanner.nextLine());
        double sumTotalGrades = 0;
        int presentationCounter = 0;
        while (true) {
            String presentation = scanner.nextLine();
            if(presentation.equals("Finish")){
                break;
            }

            double sumGrades = 0;

            for (int i = 1; i <= jury ; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                presentationCounter++;
                sumGrades += grade;
            }
            sumTotalGrades += sumGrades;
            double averageGrade = sumGrades / jury;
            System.out.printf("%s - %.2f.%n",presentation ,averageGrade);
        }
        double finalScore = sumTotalGrades / presentationCounter;
        System.out.printf("Student's final assessment is %.2f.", finalScore);
    }
}
