package at.redlinghaus;

abstract public class Animal extends Thing {
    boolean canFly, isHungry;
    String name;
    Food[] foods = new Food[3];

    public Animal(String name, double height, double width, double length, double weight) {
        super(height, width, length, weight);
        this. isHungry = false;
        this.name = name;
    }

    abstract public void move();

    abstract public void eat(Food food);

    @Override
    public String toString() {
        return name + " ";
    }
}
