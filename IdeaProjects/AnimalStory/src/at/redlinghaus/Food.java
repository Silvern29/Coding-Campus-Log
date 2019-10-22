package at.redlinghaus;

abstract public class Food extends StaticThing {
    protected String name;

    public Food(String name, double height, double width, double length, double weight) {
        super(height, width, length, weight);
        this.name = name;
        this.isEatable = true;
    }

    @Override
    public String toString() {
        return name + "";
    }
}
