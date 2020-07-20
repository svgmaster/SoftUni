package com.company;

import java.util.Scanner;

public class 09FruitorVegetable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();

        switch(product){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                product = "fruit";
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                product = "vegetable";
                break;
            default:
                product = "unknown";
                break;
        }
        System.out.println(product);
    }
}