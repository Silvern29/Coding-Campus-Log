package com.company;

public class Main {

    public static void main(String[] args) {
        Bar lokal = new Bar();
        Bowling bahn = new Bowling();

        lokal.drink(20);

        bahn.bowling(lokal.checkAlc(), lokal.getDrinks());

        if (lokal.getDrinks() <= 1) {
            System.out.println("Du gehst dich noch Duschen, Zähne putzen und ziehst dir deine Schlafkleidung an.");
        } else if (lokal.getDrinks() < 3) {
            System.out.println("Du gehst dich noch Duschen, Zähne putzen und ziehst dir deine Schlafkleidung an. Du bemerkst, dass du Hunger hast, gehst zum Kühlschrank und isst alle Kekse die du findest.");
            int kekse = (int) (Math.floor(Math.random() * 10));
            for (int i = 1; i <= kekse; i++) {
                System.out.printf("Keks Nr. %d gegessen%n", i);
            }
        } else {
            for (int i = 1; i <= 15 - lokal.getDrinks(); i++) {
                System.out.printf("%d. Stufe%n", i);
            }
            System.out.println("Jetzt muss ich schlafen!");
        }

    }
}
