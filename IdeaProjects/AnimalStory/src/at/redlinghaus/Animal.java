package at.redlinghaus;

abstract public class Animal extends Thing {
    protected boolean canFly, isHungry;
    protected String name;
    protected Food[] foods = new Food[3];

    public Animal(String name, double height, double width, double length, double weight) {
        super(height, width, length, weight);
        this.isHungry = false;
        this.name = name;
    }

    abstract protected void move();

    abstract protected void eat();

    @Override
    public String toString() {
        return name + " ";
    }
}
