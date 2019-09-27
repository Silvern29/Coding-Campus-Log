package at.redlinghaus;

public class Shop {
    String[] artArr = {"Popcorn", "Cola", "Bier", "Haribo"};
    double[] priceArr = {4.20, 2.30, 2.10, 3.20};
    int[] anzArr = {1, 1, 1, 2};

    double brieftasche = 50.00;
    double total = 0;

    public void bon() {
        for (int i = 0; i < artArr.length; i++) {
            if (anzArr[i] != 0) {
                System.out.printf("  %-8s\t%2d x %4.2f EUR%n                       %6.2f EUR%n", artArr[i], anzArr[i], priceArr[i], anzArr[i] * priceArr[i]);
                total += anzArr[i] * priceArr[i];
            }
        }

        System.out.println("-----------------------------------");
        System.out.printf("  Gesamt               %6.2f EUR%n", total);
        System.out.printf("  Gegeben              %6.2f EUR%n%n", brieftasche);

        int rnd = (int) Math.floor(Math.random()*500);
        boolean isPrim = true;
        boolean isRound = false;

        if (rnd % 10 == 0) {
            isRound = true;
            isPrim = false;
        }

        if (!isRound) {
            for (int i = rnd - 1; i > 1; i--) {
                if (rnd % i == 0) {
                    isPrim = false;
                }
            }
        }

        System.out.printf("  Deine Zufallszahl ist %d. Dies ist %s.%n", rnd, isRound ? "eine runde Zahl" : isPrim ? "eine Primzahl" : "keine Glückszahl");

        if (isPrim || isRound) {
            System.out.println("  Gratuliuere! Du hast gewonnen und zahlst nichts für deinen Einkauf!");
        } else if (brieftasche - total >= 0) {
            System.out.printf("  Zurück               %6.2f EUR%n", brieftasche - total);
            brieftasche -= total;
        } else {
            System.out.printf("  Es fehlen noch %.2f EUR!%n", total - brieftasche);
        }
    }
}
