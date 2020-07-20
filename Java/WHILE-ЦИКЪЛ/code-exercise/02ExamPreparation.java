package com.company;

import java.util.Scanner;

public class 02ExamPreparation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filedThreshold = Integer.parseInt(scanner.nextLine());

        int filedTimes = 0;
        int solvedProblems = 0;
        double gradeSum = 0;
        boolean isFiled = true;
        String lastProblem = "";

        while (filedTimes < filedThreshold) {
            String problemName = scanner.nextLine();
            if("Enough".equals(problemName)) {
                isFiled = false;
                break;
            }

            int grade = Integer.parseInt(scanner.nextLine());
            if(grade <= 4) {
                filedTimes++;
            }

            solvedProblems++;
            gradeSum += grade;
            lastProblem = problemName;
        }

        if(isFiled) {
            System.out.printf("You need a break, %d poor grades.", filedThreshold);
        } else {
            System.out.printf("Average score: %.2f%n",gradeSum / solvedProblems);
            System.out.printf("Number of problems: %d%n",solvedProblems);
            System.out.printf("Last problem: %s",lastProblem);
        }
    }
}