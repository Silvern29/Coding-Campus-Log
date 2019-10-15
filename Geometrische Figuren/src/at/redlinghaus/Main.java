package at.redlinghaus;

public class Main {

    public static void main(String[] args) {

        Printer myPrint = new Printer();
        Point myP1 = new Point(0,0);
        Point myP2 = new Point(4,5);
        Rectangle myRectang1 = new Rectangle(myP1, myP2);


        myPrint.draw(myRectang1);
        System.out.println("____________________________________________________________");
        myRectang1.moveR(10, 6);
        myPrint.draw(myRectang1);
        System.out.println("____________________________________________________________");
        myRectang1.rotateRight(1);
        myPrint.draw(myRectang1);
        System.out.println("____________________________________________________________");
        myRectang1.rotateRight(2);
        myPrint.draw(myRectang1);
        System.out.println("____________________________________________________________");




//        myPrint.draw(myRectang1.p1);
//        myPrint.draw(myRectang1.p2);
//        myPrint.draw(myRectang1.p3);
//        myPrint.draw(myRectang1.p4);

    }
}
