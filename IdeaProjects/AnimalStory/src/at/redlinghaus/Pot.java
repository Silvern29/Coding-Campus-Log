package at.redlinghaus;

public class Pot extends StaticThing {
    boolean isFull;
    Food potContent;

    public Pot(double height, double width, double length, double weight) {
        super(height, weight, width, length);
        this.potContent = new Honey("Honey", 0.2, 0.1, 0.1, 0.5);
        isFull = true;
    }

    public boolean isFull(){
        return this.potContent.weight > 0;
    }
}
