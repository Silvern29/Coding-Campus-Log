package at.redlinghaus;

public class Main {

    public static void main(String[] args) {

        Point myP1 = new Point(0,0);
        Point myP2 = new Point(8,4);
        Rectangle myRectang1 = new Rectangle(myP1, myP2);


        Printer.draw(myRectang1);
        myRectang1.move(10, 10);
        myRectang1.rotateLeft(myP1);
        myRectang1.rotateRight(myP1);

        System.out.println(myRectang1.isSquare() ? "Es handelt sich um ein Quadrat" : "Dies ist kein Quadrat");
        System.out.printf("Der Umkreis ist: %s", myRectang1.circumCircle());
//        myRectang1.rotateLeft(myP2);
//        myRectang1.rotateLeft(myP2);
//        myRectang1.rotateLeft(myP2);
    }
}
