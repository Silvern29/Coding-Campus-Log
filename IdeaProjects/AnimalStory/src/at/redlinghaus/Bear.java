package at.redlinghaus;

public class Bear extends Animal {
    boolean isSleeping;

    public Bear(int height, int weight, int width, int length) {
        super(height, weight, width, length);
        canFly = false;
        eatsHoney = true;
        isSleeping = true;
    }
}
