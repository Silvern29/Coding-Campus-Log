package at.redlinghaus;

public class Main {

    public static void main(String[] args) {
        Human h = new Human("John");
        Animal a = new Animal("Bello");
        Machine m = new Machine("Robot");

        h.sing();
        a.sing();
        m.sing();
    }
}
