package com.company;

public class Main {

    public static void main(String[] args) {
        Bar myBar = new Bar();
        Bowling myBowl = new Bowling();
        Home myHome = new Home();

        int drinks = myBar.drink();
        myBowl.bowling(drinks);
        myHome.homeComing(drinks);
    }
}
