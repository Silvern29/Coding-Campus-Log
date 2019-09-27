package at.redlinghaus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.printf("Bitte gib den gewünschten Radius ein: ");
        int r = myScan.nextInt();

        System.out.printf("Gib x und y Koordinate des Mittelpunktes ein!%nX: ");
        int x = myScan.nextInt();
        System.out.printf("Y: ");
        int y = myScan.nextInt();

        x -= r;
        y -= r;

        int start = r + x;
        for (int i = 0; i < y; i++) {
            System.out.println();
        }

        for (int j = 0; j < r; j++) {
            start--;
            for (int i = 0; i < start; i++) {
                System.out.printf(" ");
            }

            System.out.printf("#");

            for (int i = 0; i < j*2; i++) {
                System.out.printf(" ");
            }

            System.out.printf("#");
            System.out.println();
        }

        for (int j = r; j > 0; j--) {
            for (int i = 0; i < start; i++) {
                System.out.printf(" ");
            }

            System.out.printf("#");

            for (int i = 0; i < (j-1)*2; i++) {
                System.out.printf(" ");
            }

            System.out.printf("#");
            System.out.println();
            start++;
        }
    }
}
