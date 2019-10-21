package at.redlinghaus;

public class Eagle extends Animal {

    public Eagle(String name, double height, double width, double length, double weight) {
        super(name, height, width, length, weight);
        canFly = true;
        foods[0] = new EagleFood("Fox skewer", 0.2, 0.1, 0.3, 0.5);
        foods[1] = new EagleFood("Owl with sugar cast", 0.2, 0.1, 0.3, 0.5);
        foods[2] = new EagleFood("Snake puree", 0.2, 0.1, 0.3, 0.5);
    }

    public void help (){
        System.out.println(this + "offers his help to the bear!");
    }

    public Pot getHoney (Tree tree) {
        System.out.println(this + "gets the honey pot from the tree and gives it.");
        Pot pot = tree.potOnTheTree;
        tree.potOnTheTree = null;
        return pot;
    }

    @Override
    public void move() {
        System.out.println(this + "flys around and sees a hungry bear.");
    }

    @Override
    public void eat(Food food) {
        int rnd = (int) (Math.random()*3);
        System.out.println(this + "doesn't try the honey and helps himself to a tasty " + foods[rnd]);
    }
}
