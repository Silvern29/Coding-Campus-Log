package at.redlinghaus;

public class Rectangle extends GeometricFigure{
    private int a, b, absA, absB;
    private double d;
    private Point m;
    private Point p1, p2, p3, p4;
    private Point[] points = new Point[4];

    public Rectangle(Point punkt1, Point punkt3){
        this.p1 = punkt1;
        this.p3 = punkt3;
        this.p2 = new Point(this.p3.getX(), this.p1.getY());
        this.p4 = new Point(this.p1.getX(), this.p3.getY());
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        points[3] = p4;
    }

    public void move(int xMove, int yMove) {
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

    public void updateSides() {
        this.absA = Math.abs(p1.getX() - p3.getX());
        this.absB = Math.abs(p1.getY() - p3.getY());
        this.a = p1.getX() - p3.getX();
        this.b = p1.getY() - p3.getY();
        this.d = Math.sqrt(absA*absA + absB*absB);
    }

    public Point findCounterP (Point angleP) {
        for(int i = 0; i < 4 ; i++){
            if (points[i].equals(angleP)) {
                return points[(i + 2) % 4];
            }
        }
        return null;
    }

    public int isPoint(int x, int y) {
        for (int l = 0; l < 4; l++) {
            if (this.getPoints()[l].getX() == x && this.getPoints()[l].getY() == y) {
                return l;
            }
        }
        return -1;
    }

    public int getMinX(){
        return Math.min(p1.getX(), p3.getX());
    }

    public int getMaxX(){
        return Math.max(p1.getX(), p3.getX());
    }

    public int getMinY(){
        return Math.min(p1.getY(), p3.getY());
    }

    public int getMaxY(){
        return Math.max(p1.getY(), p3.getY());
    }

    public void rotateLeft(Point angleP) {
        this.p1 = angleP;
        this.p3 = this.findCounterP(angleP);
        updateSides();

        if (p3 != null) {
            this.p3.setX(p1.getX() - b);
            this.p3.setY(p1.getY() + a);

            if (p1.getY() == p2.getY()) {
                this.p2.setX(p1.getX());
                this.p2.setY(p1.getY() + a);
            } else if (p1.getX() == p2.getX()) {
                this.p2.setX(p1.getX() - b);
                this.p2.setY(p1.getY());
            }
            if (p1.getY() == p4.getY()) {
                this.p4.setX(p1.getX());
                this.p4.setY(p1.getY() + a);
            } else if (p1.getX() == p4.getX()) {
                this.p4.setX(p1.getX() - b);
                this.p4.setY(p1.getY());
            }
        } else {
            System.out.println("Der Punkt ist kein Eckpunkt des Rechtecks");
        }
        Printer.draw(this);
    }

    public void rotateRight(Point angleP) {
        this.p1 = angleP;
        this.p3 = this.findCounterP(angleP);
        updateSides();

        if (p3 != null) {
            this.p3.setX(p1.getX() + b);
            this.p3.setY(p1.getY() - a);

            if (p1.getY() == p2.getY()) {
                this.p2.setX(p1.getX() + b);
                this.p2.setY(p1.getY());
            } else if (p1.getX() == p2.getX()) {
                this.p2.setX(p1.getX());
                this.p2.setY(p1.getY() - a);
            }
            if (p1.getY() == p4.getY()) {
                this.p4.setX(p1.getX() + b);
                this.p4.setY(p1.getY());
            } else if (p1.getX() == p4.getX()) {
                this.p4.setX(p1.getX());
                this.p4.setY(p1.getY() - a);
            }
        } else {
            System.out.println("Der Punkt ist kein Eckpunkt des Rechtecks");
        }
        Printer.draw(this);
    }

    public boolean isSquare(){
        updateSides();
        return a == b;
    }

    public Circle circumCircle(){
        updateSides();
        m = new Point((p1.getX() + p3.getX()) / 2, (p1.getY() + p3.getY()) / 2);
        return new Circle(d / 2.0, m);
    }

    public void scale(int factor){

    }

    public Point[] getPoints() {
        return points;
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

    @Override
    public double calculateArea() {
        updateSides();
        return a * b;
    }
}
