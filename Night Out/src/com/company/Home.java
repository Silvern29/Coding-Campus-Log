package com.company;

public class Home {
    public int stairs(int drinks) {
        return 15 - drinks;
    }

    public void homeComing(int drinks) {
        if (drinks <= 1) {
            System.out.println("Du gehst dich noch Duschen, Zähne putzen und ziehst dir deine Schlafkleidung an.");
        } else if (drinks < 3) {
            System.out.println("Du gehst dich noch Duschen, Zähne putzen und ziehst dir deine Schlafkleidung an. Du bemerkst, dass du Hunger hast, gehst zum Kühlschrank und isst alle Kekse die du findest.");
            int kekse = (int) (Math.floor(Math.random() * 10));
            for (int i = 1; i <= kekse; i++) {
                System.out.printf("Keks Nr. %d gegessen%n", i);
            }
        } else {
            for (int i = 1; i <= stairs(drinks); i++) {
                System.out.printf("%d. Stufe%n", i);
            }
            System.out.println("Jetzt muss ich schlafen!");
        }
    }

}
