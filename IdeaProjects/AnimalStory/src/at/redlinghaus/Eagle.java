package at.redlinghaus;

public class Eagle extends Animal {
    protected boolean canFly;
    protected boolean eatsHoney;

    public Eagle(int height, int weight, int width, int length) {
        super(height, weight, width, length);
        canFly = true;
        eatsHoney = false;
    }
}
