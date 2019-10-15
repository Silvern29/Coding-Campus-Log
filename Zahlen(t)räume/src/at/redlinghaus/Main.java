package at.redlinghaus;

import java.util.Scanner;

public class Main {
    static Scanner myScan = new Scanner(System.in);
    static int num;
    static boolean isCorrect = false;

    public static void choice() {
        System.out.printf("Bitte gib eine Zahl von 1 bis 10 ein: ");
        num = myScan.nextInt();
    }

    public static void main(String[] args) {
        while (!isCorrect) {
            choice();
            if (num <= 0 || num > 10) {
                System.out.println("Falsche Eingabe! Bitte versuche es erneut.");
            } else {
                isCorrect = true;
            }
        }

        switch (num) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Ziemlich niedrig!");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Nah dran!");
                break;
            case 10:
                System.out.println("Gratuliere! Jackpot!!");
                break;
            default:
                System.out.println("Da ist was schief gegangen!");
                break;
        }
    }
}
