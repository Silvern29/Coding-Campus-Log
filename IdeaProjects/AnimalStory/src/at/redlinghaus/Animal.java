package at.redlinghaus;

abstract public class Animal extends Thing {
    boolean eatsHoney, canFly;

    public Animal(int height, int weight, int width, int length) {
        super(height, weight, width, length);
    }
}
