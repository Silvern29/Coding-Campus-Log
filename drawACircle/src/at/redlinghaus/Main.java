package at.redlinghaus;

import java.util.Scanner;

public class Main {
    public static void circle(int xM, int yM, int r) {
        for (int i = 0;i <= yM + r; i++) {
            for (int j = 0;j <=xM + r; j++) {
                System.out.print(Math.abs((j-xM)*(j-xM) + (i-yM)*(i-yM) - r*r) < r ? ")" : " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        System.out.printf("Bitte gib den gewünschten Radius ein: ");
        int r = myScan.nextInt();

        System.out.printf("Gib x und y Koordinate des Mittelpunktes ein!%nX: ");
        int x = myScan.nextInt();
        System.out.printf("Y: ");
        int y = myScan.nextInt();

        circle(x,y,r);
    }
}