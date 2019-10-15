package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.printf("Bitte gib ein, wie hoch deine Pyramide werden soll: ");
        int level = myScanner.nextInt();
        int totalWidth = level * 2 - 1;

        for (int i = 0; i < level; i++) {
            int width = 0;

            if (i == 0) {
                width = i + 1;
            } else {
                width = i * 2 + 1;
            }

            for (int j = 0; j < (totalWidth - width) / 2; j++) {
                System.out.printf("  ");
            }
            for (int j = 0; j < width; j++) {
                System.out.printf("X ");
            }
            System.out.println();
        }

    }
}
