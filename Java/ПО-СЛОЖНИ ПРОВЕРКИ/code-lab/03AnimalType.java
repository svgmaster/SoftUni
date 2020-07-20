package com.company;

import java.util.Scanner;

public class 03AnimalType {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String animal = scan.nextLine();

        switch(animal){
            case "dog":
                animal = "mammal";
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                animal = "reptile";
                break;

            default:
                animal = "unknown";
                break;
        }
        System.out.println(animal);
    }
}