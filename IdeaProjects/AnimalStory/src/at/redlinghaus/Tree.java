package at.redlinghaus;

public class Tree extends StaticThing {
    protected boolean holdsPot;
    protected Pot potOnTheTree;

    public Tree(double height, double width, double length, double weight, boolean holdsPot) {
        super(height, weight, width, length);
        this.holdsPot = holdsPot;
        potOnTheTree = holdsPot ? new Pot(0.2, 0.1, 0.1, 0.5) : null;
    }
}
