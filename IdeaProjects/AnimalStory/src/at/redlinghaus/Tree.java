package at.redlinghaus;

public class Tree extends StaticThing {
    boolean hasPot;

    public Tree(int height, int weight, int width, int length, boolean hasPot) {
        super(height, weight, width, length);
        this.hasPot = hasPot;
    }
}
