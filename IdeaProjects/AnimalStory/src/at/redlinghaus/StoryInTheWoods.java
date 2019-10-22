package at.redlinghaus;

public class StoryInTheWoods {


    public void play() {
        Bear bear = new Bear("BobbyTheBear", 3, 2, 2, 500);
        Eagle eagle = new Eagle("EddyTheEagle", 0.5, 2, 1, 20);
        Bee bee = new Bee("Maja", 0.01, 0.01, 0.01, 0.01);

        Tree tree = new Tree(5, 2, 2, 20, true);

        bear.sleep();
        bear.wakeUp();
        bear.move();

        System.out.println();

        eagle.move();
        eagle.help();
        eagle.getHoney(tree, bear);
        eagle.eat();
        eagle.eat();
        eagle.eat();

        System.out.println();

        bear.eat();

        bee.move();
        bee.work(tree);

        eagle.move();
        eagle.help();
        eagle.getHoney(tree, bear);

        bear.wakeUp();
        bear.eat();
    }
}
