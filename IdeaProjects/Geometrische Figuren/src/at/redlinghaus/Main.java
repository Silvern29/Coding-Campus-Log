package at.redlinghaus;

import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
        Rectangular myRectang1 = new Rectangular(new Point(2,3), new Point(4, 5));
        System.out.println(myRectang1);

        Printer myPrint = new Printer();
        Point myP1 = new Point(2,3);

        myPrint.draw(myP1);

    }
}
