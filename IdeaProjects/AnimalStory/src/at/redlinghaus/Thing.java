package at.redlinghaus;

abstract public class Thing {
    protected double height, weight, width, length;

    public Thing(double height, double width, double length, double weight) {
        this.height = height;
        this.weight = weight;
        this.width = width;
        this.length = length;
    }
}
