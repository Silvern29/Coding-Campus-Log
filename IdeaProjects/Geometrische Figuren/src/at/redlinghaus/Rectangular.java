package at.redlinghaus;

public class Rectangular {
    private int a, b;
    private Point m;
    private Point p1, p3;

    public Rectangular(Point Punkt1, Point Punkt3){
        this.p1 = Punkt1;
        this.p3 = Punkt3;
        this.a = p3.getX() - p1.getX();
        this.b = p3.getY() - p1.getY();
        this.m = new Point((p3.getX()-p1.getX())/2+p1.getX(),(p3.getY()-p1.getY())/2+p1.getY());
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
