package at.redlinghaus;

public class Bear extends Animal {
    private boolean isSleeping;
    private Food food;

    public Bear(String name, double height, double width, double length, double weight) {
        super(name, height, width, length, weight);
        canFly = false;
        isSleeping = true;
    }

    public void sleep() {
        System.out.println("Ccccccchrrrrrrrrrrrrr");
        isSleeping = true;
    }

    public void wakeUp() {
        System.out.println(this + "wakes up and is hungry!");
        isSleeping = false;
    }

    public void askForHelp() {

    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public void move() {
        System.out.println(this + "walks around and looks for a honey pot.");

    }

    @Override
    public void eat() {
        food.weight -= 0.1;
        if (food.weight <= 0) {
            System.out.println(this + "eats his honey and falls asleep!");
            sleep();
        } else {
            System.out.println(this + "eats his honey!");
            eat();
        }
    }
}
