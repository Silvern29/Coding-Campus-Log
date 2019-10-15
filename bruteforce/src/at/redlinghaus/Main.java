package at.redlinghaus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char [] poss = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        String pw = "";
        String forc = "";
        Scanner myScan = new Scanner(System.in);

        System.out.printf("Wieviele Stellen hat dein Passwort? ");
        int dig = myScan.nextInt();
        char [] guess = new char[dig];

        for (int i = 0; i < dig; i++) {
            pw += poss[( int ) Math.floor(Math.random()*10)];
        }
        System.out.printf("Zufälliges Passwort: ");
        System.out.println(pw);

//        for (int k = 0; k < dig; k++) {
        for (int i = 0; i < dig; i++) {
            for (int j = 0; j < poss.length; j++) {
                guess[i] = poss[j];
                String result = new String(guess);
                if (result.equals(pw)) {
                    System.out.printf("Guess Passwort: ");
                    System.out.println(guess);
                    break;
                }
            }
        }
//        }
    }
}
