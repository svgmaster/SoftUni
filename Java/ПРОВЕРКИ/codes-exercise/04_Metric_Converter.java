package com.company;

import java.util.Scanner;

public class 04_Metric_Converter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double length = Double.parseDouble(scan.nextLine());
        String dimension = scan.nextLine();
        String type = scan.nextLine();

        double convert = 0.0;

        if (dimension.equals("m")) {
            if (type.equals("mm")) {
                convert = length * 1000;
            } else if(type.equals("cm")) {
                convert = length * 100;
            }
        } else if (dimension.equals("cm")) {
            if (type.equals("mm")) {
                convert = length * 10;
            } else if(type.equals("m")) {
                convert = length * 0.01;
            }
        } else if   (dimension.equals("mm")) {
            if (type.equals("cm")) {
                convert = length * 0.1;
            } else if(type.equals("m")) {
                convert = length * 0.001;
            }
        }

        System.out.printf("%.3f",convert);
    }
}