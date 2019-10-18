package at.redlinghaus;

public class Main {

    public static void main(String[] args) {

        Point myP1 = new Point(0,0);
        Point myP2 = new Point(8,4);
        Rectangle myRectang1 = new Rectangle(myP1, myP2);


        myPrint.draw(myRectang1);
        myRectang1.moveR(10, 6);
        myRectang1.rotateRight(myP1);
        myRectang1.rotateRight(myP1);




//        myPrint.draw(myRectang1.p1);
//        myPrint.draw(myRectang1.p2);
//        myPrint.draw(myRectang1.p3);
//        myPrint.draw(myRectang1.p4);

    }
}
