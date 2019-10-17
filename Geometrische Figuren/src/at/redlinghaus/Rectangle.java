package at.redlinghaus;

public class Rectangle {
    public int a, b;
    public Point p1, p2, p3, p4;

    public Rectangle(Point punkt1, Point punkt3){
        this.p1 = punkt1;
        this.p3 = punkt3;
        this.p2 = new Point(this.p3.getX(), this.p1.getY());
        this.p4 = new Point(this.p1.getX(), this.p3.getY());
    }

    public void moveR(int xMove, int yMove) {
        this.p1.setX(this.p1.getX() + xMove);
        this.p1.setY(this.p1.getY() + yMove);
        this.p2.setX(this.p2.getX() + xMove);
        this.p2.setY(this.p2.getY() + yMove);
        this.p3.setX(this.p3.getX() + xMove);
        this.p3.setY(this.p3.getY() + yMove);
        this.p4.setX(this.p4.getX() + xMove);
        this.p4.setY(this.p4.getY() + yMove);
        Printer.draw(this);
    }

    public void rotateRight(Point angleP) {

        this.p1 = angleP;
        this.p3.setX(p1.getX() + (p3.getY() - p1.getY()));
        this.p3.setY(p1.getY() - (p3.getX() - p1.getX()));
        Printer.draw(this);
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "a=" + a +
                ", b=" + b +
                ", p1=" + p1 +
                ", p3=" + p3 +
                '}';
    }
}
