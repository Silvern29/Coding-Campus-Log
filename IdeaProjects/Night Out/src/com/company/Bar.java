package com.company;

public class Bar {
    int drinks = 0;
    public void countDrinks() {
        drinks++;
    }

    public void checkDrink(int ml) {
        if (ml == 250) {
            System.out.println("Das Glas ist noch voll.");
        } else if (ml < 250 && ml >= 20) {
            System.out.println("Das Glas ist nicht mehr voll.");
        } else {
            System.out.println("Kellner, neues Bier!");
            countDrinks();
        }
    }

    public boolean checkAlc() {
        return drinks < 4;
    }
}
