package at.redlinghaus;

abstract public class StaticThing extends Thing {
    boolean isEatable;

    public StaticThing(int height, int weight, int width, int length) {
        super(height, weight, width, length);
        isEatable = false;
    }
}
