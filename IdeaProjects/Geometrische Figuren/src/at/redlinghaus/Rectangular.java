package at.redlinghaus;

public class Rectangular {
    public int a, b;
    private Point m;
    public Point p1, p2, p3, p4;

    public Rectangular(Point punkt1, Point punkt3){
        this.p1 = new Point(Math.min(punkt1.getX(), punkt3.getX()), Math.min(punkt1.getY(), punkt3.getY()));
        this.p3 = new Point(Math.max(punkt1.getX(), punkt3.getX()), Math.max(punkt1.getY(), punkt3.getY()));
        this.p2 = new Point(this.p3.getX(), this.p1.getY());
        this.p4 = new Point(this.p1.getX(), this.p3.getY());
        this.a = p3.getX() - p1.getX();
        this.b = p3.getY() - p1.getY();
        this.m = new Point((p3.getX()-p1.getX())/2+p1.getX(),(p3.getY()-p1.getY())/2+p1.getY());
    }

    public void moveR(int xMove, int yMove) {
        this.p1.setX(this.p1.getX() + xMove);
        this.p1.setY(this.p1.getY() + yMove);
        this.p3.setX(this.p3.getX() + xMove);
        this.p3.setY(this.p3.getY() + yMove);
    }

    public void rotate(Point drehPunkt) {
        if(drehPunkt.equals(p1) || drehPunkt.equals(p2) || drehPunkt.equals(p3) || drehPunkt.equals(p4)) {
            this.p1 = drehPunkt;
            this.p3.setX(drehPunkt.getX() + this.b);
            this.p3.setY(drehPunkt.getY() - this.a);
        } else {
            System.out.println("Der Punkt ist kein Eckpunkt des Rechtecks");
        }
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
