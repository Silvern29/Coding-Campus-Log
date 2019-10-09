package at.redlinghaus;

public class Rectangular {
    private int a, b;
    private Point m;
    public Point p1, p2, p3, p4;

    public Rectangular(Point Punkt1, Point Punkt3){
        this.p1 = Punkt1;
        this.p2 = new Point(Punkt3.getX(), Punkt1.getY());
        this.p3 = Punkt3;
        this.p4 = new Point(Punkt1.getX(), Punkt3.getY());
        this.a = p3.getX() - p1.getX();
        this.b = p3.getY() - p1.getY();
        this.m = new Point((p3.getX()-p1.getX())/2+p1.getX(),(p3.getY()-p1.getY())/2+p1.getY());
    }

    public void moveRectang(int xMove, int yMove) {
        this.p1.setX(this.p1.getX() + xMove);
        this.p1.setY(this.p1.getY() + yMove);
        this.p3.setX(this.p3.getX() + xMove);
        this.p3.setY(this.p3.getY() + yMove);
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
