package at.redlinghaus;

public class Eagle extends Animal {

    public Eagle(String name, double height, double width, double length, double weight) {
        super(name, height, width, length, weight);
        canFly = true;
        foods[0] = new EagleFood("Fox skewer", 0.2, 0.1, 0.3, 0.5);
        foods[1] = new EagleFood("Owl with sugar cast", 0.2, 0.1, 0.3, 0.5);
        foods[2] = new EagleFood("Snake puree", 0.2, 0.1, 0.3, 0.5);
    }

    public void help() {
        System.out.println(this + "offers his help to the bear!");
    }

    public void getHoney(Tree tree, Bear bear) {
        System.out.println(this + "gets the honey from the tree and brings it down.");
        bear.setFood(tree.getHiveOnTheTree().getHiveContent());
        tree.getHiveOnTheTree().getHiveContent().weight = 0;
    }

    @Override
    public void move() {
        System.out.println(this + "flys around and sees the hungry bear.");
    }

    @Override
    public void eat() {
        int rnd = (int) (Math.random() * 3);
        System.out.println(this + "doesn't try the honey and helps himself to a tasty " + foods[rnd]);
    }
}
