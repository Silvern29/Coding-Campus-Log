package at.redlinghaus;

public class Bear extends Animal {
    boolean isSleeping;

    public Bear(String name, double height, double width, double length, double weight) {
        super(name, height, width, length, weight);
        canFly = false;
        isSleeping = true;
        Thing[] food;
    }

    public void sleep(){
        System.out.println("Ccccccchrrrrrrrrrrrrr");
        isSleeping = true;
    }

    public void wakeUp(){
        System.out.println(this + "wakes up and is hungry!");
        isSleeping = false;
    }

    public void askForHelp(){

    }

    @Override
    public void move() {
        System.out.println(this + "walks around and looks for a honey pot.");

    }

    @Override
    public void eat(Food honey) {
        honey.weight += 0.5;
        if (honey.weight == 0) {
            System.out.println(this + "eats his honey and falls asleep!");
            sleep();
        } else{
            System.out.println(this + "eats his honey!");
            eat(honey);
        }
    }
}
