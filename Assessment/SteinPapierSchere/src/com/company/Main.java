package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        int pPoints = 0;
        int npcPoints = 0;
        String[] options = {"Stein", "Papier", "Schere"};

        while (pPoints < 3 && npcPoints < 3) {

            System.out.print("Wähle zwischen Stein(1), Papier(2) und Schere(3)! ");
            int pChoice = myScan.nextInt();
            myScan.nextLine();

            int npcChoice = (int)(Math.ceil(Math.random() * 3));

            System.out.println("Stein, Papier, Schere");
            System.out.printf("%s VS %s%n", options[pChoice - 1], options[npcChoice - 1]);

            if ((pChoice == 1 && npcChoice == 3) ||
                (pChoice == 2 && npcChoice == 1) ||
                (pChoice == 3 && npcChoice == 2)) {
                System.out.printf("Du hast mit %s gewonnen%n", options[pChoice-1]);
                pPoints++;
            } else if ((pChoice == 1 && npcChoice == 2) ||
                        (pChoice == 2 && npcChoice == 3) ||
                        (pChoice == 3 && npcChoice == 1)){
                System.out.printf("Du hast mit %s verloren%n", options[pChoice-1]);
                npcPoints++;
            } else {
                System.out.println("Unentschieden!");
            }
            System.out.printf("Neuer Punktestand:%nPlayer | PC%n%d      | %d%n%n", pPoints, npcPoints);
        }
        if (pPoints == 3) {
            System.out.println("Gratuliere du hast gewonnen!");
        } else {
            System.out.println("Schade, du hast verloren!");
        }
    }
}
