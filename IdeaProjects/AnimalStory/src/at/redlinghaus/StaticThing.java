package at.redlinghaus;

abstract public class StaticThing extends Thing {
    protected boolean isEatable;

    public StaticThing(double height, double width, double length, double weight) {
        super(height, width, length, weight);
        isEatable = false;
    }
}
