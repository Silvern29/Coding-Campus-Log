package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Schere Stein Papier
 */
public class SchereSteinPapier {

    public static void main(String[] args) {
        int scoreHumans = 0;
        int scoreAI = 0;
        int gameCounter = 0;

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen bei SchereSteinPapier Reload.");

        String[] options = { "Schere", "Stein", "Papier" };

        while (true) {
            int choiceAI = rand.nextInt(3) + 1;
            System.out.println("Wähle zwischen Schere (1), Stein (2) und Papier (3).");
            int choiceHuman = scanner.nextInt();

            boolean humanWon = false;
            boolean aiWon = false;
            if (choiceHuman == 1 && choiceAI == 3) {
                humanWon = true;
            } else if (choiceHuman == 2 && choiceAI == 1) {
                humanWon = true;
            } else if (choiceHuman == 3 && choiceAI == 2) {
                humanWon = true;
            } else if (choiceAI == 1 && choiceHuman == 3) {
                aiWon = true;
            } else if (choiceAI == 2 && choiceHuman == 1) {
                aiWon = true;
            } else if (choiceAI == 3 && choiceHuman == 2) {
                aiWon = true;
            }

            System.out.println(options[choiceHuman - 1] + " VS " + options[choiceAI - 1]);

            if (humanWon) {
                scoreHumans++;
                System.out.println("Gratuliere, you did it!");
            } else if (aiWon) {
                scoreAI++;
                System.out.println("Nope, AI won!");
            } else {
                System.out.println("Unentschieden!!!");
            }

            // Punkteausgabe
            System.out.println("Humans\tAI\tSpiel");
            System.out.println(scoreHumans + "\t" + scoreAI + "\t" + ++gameCounter);
        }
    }
}
