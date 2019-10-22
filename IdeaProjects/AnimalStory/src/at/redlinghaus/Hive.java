package at.redlinghaus;

public class Hive extends StaticThing {
    private boolean isFull;
    private Food hiveContent;

    public Hive(double height, double width, double length, double weight) {
        super(height, weight, width, length);
        this.hiveContent = new Honey("Honey", 0.2, 0.1, 0.1, 0.5);
        isFull = false;
    }

    public boolean isFull() {
        isFull = this.hiveContent.weight >= 1;
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public Food getHiveContent() {
        return hiveContent;
    }

    public void setHiveContent(Food hiveContent) {
        this.hiveContent = hiveContent;
    }
}
