package at.redlinghaus;

import java.util.LinkedList;
import java.util.List;

public class Rectangle {
    public int a, b;
    private Point m;
    public Point p1, p2, p3, p4;
    List<Point> points;

    public Rectangle(Point punkt1, Point punkt3){
        this.p1 = punkt1;
//        this.p1 = new Point(Math.min(punkt1.getX(), punkt3.getX()), Math.min(punkt1.getY(), punkt3.getY()));
        this.p3 = punkt3;
//        this.p3 = new Point(Math.max(punkt1.getX(), punkt3.getX()), Math.max(punkt1.getY(), punkt3.getY()));
        this.p2 = new Point(this.p3.getX(), this.p1.getY());
        this.p4 = new Point(this.p1.getX(), this.p3.getY());
//        this.a = p3.getX() - p1.getX();
//        this.b = p3.getY() - p1.getY();
//        this.m = new Point((p3.getX()-p1.getX())/2+p1.getX(),(p3.getY()-p1.getY())/2+p1.getY());
        this.points = new LinkedList<>();
        points.add(p1);
        points.add(p2);
        points.add(p3);
        points.add(p4);
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
    }

    public void rotateRight(int indexAngle) {
//        if(angle.equals(p1) || drehPunkt.equals(p2) || drehPunkt.equals(p3) || drehPunkt.equals(p4)) {
        this.p1 = points.get(indexAngle);
        this.p2 = points.get((indexAngle + 1) % 4);
        this.p3 = points.get((indexAngle + 2) % 4);
        this.p4 = points.get((indexAngle + 3) % 4);

        int a = Math.abs(p1.getX() - p3.getX());
        int b = Math.abs(p1.getY() - p3.getY());

        this.p2.setX(p1.getX());
        this.p2.setY(p1.getY() - a);

        this.p3.setX(p1.getX() + a);
        this.p3.setY(p1.getY() - b);

        this.p4.setX(p1.getX() + b);
        this.p4.setY(p1.getY());
//        } else {
//            System.out.println("Der Punkt ist kein Eckpunkt des Rechtecks");
//        }
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "a=" + a +
                ", b=" + b +
                ", m=" + m +
                ", p1=" + p1 +
                ", p3=" + p3 +
                '}';
    }
}
