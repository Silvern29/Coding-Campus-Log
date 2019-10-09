package at.redlinghaus;

import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {

        Printer myPrint = new Printer();
        Point myP1 = new Point(0,0);
        Point myP2 = new Point(4,5);
        Rectangular myRectang1 = new Rectangular(myP1, myP2);

//        myPrint.draw(myRectang1);

        myRectang1.moveRectang(10, 6);
        myPrint.draw(myRectang1.p1);
        myPrint.draw(myRectang1.p2);
        myPrint.draw(myRectang1.p3);
        myPrint.draw(myRectang1.p4);

    }
}
