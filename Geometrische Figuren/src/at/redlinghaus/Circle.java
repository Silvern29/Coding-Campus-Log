package at.redlinghaus;

public class Circle {
    private double radius;
    private Point m;

    public Circle (double radius, Point mittelpunkt){
        this.radius = radius;
        this.m = mittelpunkt;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", m=" + m +
                '}';
    }
}
