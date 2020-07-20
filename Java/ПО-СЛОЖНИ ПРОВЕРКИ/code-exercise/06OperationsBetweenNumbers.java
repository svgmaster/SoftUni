package com.company;

import java.util.Scanner;

public class 06OperationsBetweenNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a  = Integer.parseInt(scan.nextLine());
        int b  = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();

        String result = "";
        String odd = "";
        double sum = 0.00;


        switch (operator){
            case "+":
                sum = a + b;
                if(sum % 2 == 0) {
                    odd = "even";
                } else {
                    odd = "odd";
                }
                result = "" + a + " " + operator + " " + b + " = " + (int)sum + " - " + odd;
                break;
            case "-":
                sum = a - b;
                if(sum % 2 == 0) {
                    odd = "even";
                } else {
                    odd = "odd";
                }
                result = "" + a + " " + operator + " " + b + " = " + (int)sum + " - " + odd;
                break;
            case "*":
                sum = a * b;
                if(sum % 2 == 0) {
                    odd = "even";
                } else {
                    odd = "odd";
                }
                result = "" + a + " " + operator + " " + b + " = " + (int)sum + " - " + odd;
                break;
            case "/":
                if(b == 0) {
                    result = "Cannot divide " + a + " by zero";
                } else {
                    sum = (double)a / b;
                    result = String.format("" + a + " " + operator + " " + b + " = %.2f", sum);
                }
                break;
            case "%":
                if(b == 0) {
                    result = "Cannot divide " + a + " by zero";
                } else {
                    sum = a % b;
                    result = "" + a + " " + operator + " " + b + " = " + (int)sum;
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }

        System.out.println(result);

    }
}