package at.redlinghaus;

public class Honey extends StaticThing {
    boolean isSweet;

    public Honey(int height, int weight, int width, int length) {
        super(height, weight, width, length);
        isEatable = true;
    }
}
