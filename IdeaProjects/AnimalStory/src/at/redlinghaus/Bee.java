package at.redlinghaus;

public class Bee extends Animal {

    public Bee(String name, double height, double width, double length, double weight) {
        super(name, height, width, length, weight);
    }

    public void work(Tree tree) {
        while (!tree.getHiveOnTheTree().isFull()) {
            System.out.println(this + "works hard to fill the hive with honey.");
            tree.getHiveOnTheTree().getHiveContent().weight += 0.1;
        }
    }

    @Override
    public void move() {
        System.out.println(this + "flys around to gather.");
    }

    @Override
    public void eat() {
    }
}
