package com.company;

public class Bar {
    public int drink() {
        int drinks = 0;
        for (int i = 0; i < 20; i++) {
            int myDrink = (int) (Math.floor(Math.random() * 250) + 1);
            if (myDrink == 250) {
                System.out.println("Das Glas ist noch voll.");
            } else if (myDrink < 250 && myDrink >= 20) {
                System.out.println("Das Glas ist nicht mehr voll.");
            } else {
                System.out.println("Kellner, neues Bier!");
                drinks++;
            }
        }
        return drinks;
    }
}