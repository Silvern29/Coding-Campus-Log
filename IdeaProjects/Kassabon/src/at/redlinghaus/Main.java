package at.redlinghaus;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        String [] artArr = {"Wurst", "Käse", "Brot", "DVD"};
        double [] priceArr = {4.20, 2.30, 2.10, 12.00};
        int [] anzArr = {1, 1, 1, 2};

        double brieftasche = 50.00;
        double total = 0;

        for (int i = 0; i < artArr.length; i++) {
            if (anzArr[i] != 0) {
                System.out.printf("  %s\t%3d x %6.2f EU%n                       %6.2f EUR%n", artArr[i], anzArr[i], priceArr[i], anzArr[i] * priceArr[i]);
                total += anzArr[i] * priceArr[i];
            }
        }

        System.out.println("-----------------------------------");
        System.out.printf("  Gesamt               %6.2f EUR%n", total);
        System.out.printf("  Gegeben              %6.2f EUR%n%n", brieftasche);

        if (brieftasche - total >= 0) {
            System.out.printf("  Zurück               %6.2f EUR%n", brieftasche - total);
        } else {
            System.out.printf("  Es fehlen noch %.2f EUR!%n", total - brieftasche);
        }

    }
}
