package at.redlinghaus;

public class Animal implements Singer {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    @Override
    public void sing() {
        System.out.println(this + " barks");
    }

    @Override
    public String toString() {
        return name;
    }
}
