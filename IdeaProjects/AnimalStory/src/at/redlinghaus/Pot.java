package at.redlinghaus;

public class Pot extends StaticThing {
    boolean isFull;

    public Pot(int height, int weight, int width, int length) {
        super(height, weight, width, length);
        isFull = false;
    }
}
