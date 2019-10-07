package at.redlinghaus;

import java.util.Arrays;

public class Main {
    public static int[] arr = new int[10];

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        Stringinator myStringi = new Stringinator();

        for(int i = 0; i < 10; i++) {
            arr[i] = (int) Math.floor(Math.random()*50);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();


        System.out.print("Die kleinste Zahl deines Arrays lautet: ");
        System.out.println(myCalc.getSmallestNum(arr));
        System.out.println();

        System.out.print("Der Durchschnitt deines Arrays ist: ");
        System.out.println(myCalc.avgNum(arr));
        System.out.println();

        String input = "\"Das ist ein Testtext zum testen der Textcount-Testfunktion!\"";
        System.out.printf("Dein String %s enthält %d Vokale%n", input, myStringi.countVowel(input));
        System.out.println();

        System.out.printf("Die Summe deiner Zahlen ist: %d%n", myCalc.sumNums(3, 5));

    }
}
