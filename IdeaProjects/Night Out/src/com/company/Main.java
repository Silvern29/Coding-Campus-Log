package com.company;

public class Main {

    public static void main(String[] args) {
        Bar lokal = new Bar();
        Bowling bahn = new Bowling();

        for (int i = 0; i < 50; i++) {
            int derDrink = (int) (Math.floor(Math.random() * 250) + 1);
            lokal.checkDrink(derDrink);
        }

        if (lokal.checkAlc()) {
            for (int i : bahn.gameChart) {
                System.out.println(bahn.bowlen(i));
            }
        } else {
            System.out.printf("Du hattest %d Drinks! Du kommst hier nicht rein!%n", lokal.drinks);
        }

        bahn.pullUpsWhile(20);

        if (lokal.drinks <= 1) {
            System.out.println("Du gehst dich noch Duschen, Zähne putzen und ziehst dir deine Schlafkleidung an.");
        } else if (lokal.drinks < 3) {
            System.out.println("Du gehst dich noch Duschen, Zähne putzen und ziehst dir deine Schlafkleidung an. Du bemerkst, dass du Hunger hast, gehst zum Kühlschrank und isst alle Kekse die du findest.");
            int kekse = (int) (Math.floor(Math.random() * 10));
            for (int i = 1; i <= kekse; i++) {
                System.out.printf("Keks Nr. %d gegessen%n", i);
            }
        } else {
            for (int i = 1; i <= 15 - lokal.drinks; i++) {
                System.out.printf("%d. Stufe%n", i);
            }
            System.out.println("Jetzt muss ich schlafen!");
        }

    }
}
