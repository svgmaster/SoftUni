package com.svgsoftware;

import java.util.Scanner;

public class 05PasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (char c = 'a'; c < 'a' + l; c++) {
                    for (char x = 'a'; x < 'a' + l; x++) {
                        for (int m = 1; m <= n; m++) {
                            if(m > i && m > j){
                                System.out.printf("%d%d%c%c%d ", i, j, c, x, m);
                            }
                        }
                    }
                }
            }
        }
    }
}
