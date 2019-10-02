package com.company;

public class Bar {
    private int drinks = 0;

    public int getDrinks() {
        return drinks;
    }

    public void setDrinks(int drinks) {
        this.drinks = drinks;
    }

    public void drink(int checks) {
        for (int i = 0; i < checks; i++) {
            int derDrink = (int) (Math.floor(Math.random() * 250) + 1);
            if (derDrink == 250) {
                System.out.println("Das Glas ist noch voll.");
            } else if (derDrink < 250 && derDrink >= 20) {
                System.out.println("Das Glas ist nicht mehr voll.");
            } else {
                System.out.println("Kellner, neues Bier!");
                drinks++;
            }
        }
    }

    public boolean checkAlc() {
        return drinks < 4;
    }
}
