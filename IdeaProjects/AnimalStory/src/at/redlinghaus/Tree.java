package at.redlinghaus;

public class Tree extends StaticThing {
    private boolean holdsPot;
    private Hive hiveOnTheTree;

    public Tree(double height, double width, double length, double weight, boolean holdsPot) {
        super(height, weight, width, length);
        this.holdsPot = holdsPot;
        hiveOnTheTree = holdsPot ? new Hive(0.2, 0.1, 0.1, 0.5) : null;
    }

    public boolean isHoldsPot() {
        return holdsPot;
    }

    public void setHoldsPot(boolean holdsPot) {
        this.holdsPot = holdsPot;
    }

    public Hive getHiveOnTheTree() {
        return hiveOnTheTree;
    }

    public void setHiveOnTheTree(Hive hiveOnTheTree) {
        this.hiveOnTheTree = hiveOnTheTree;
    }
}
