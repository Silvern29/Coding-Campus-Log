package at.redlinghaus;

public class Human implements Singer {
    private String name;

    public Human(String name){
        this.name = name;
    }

    @Override
    public void sing() {
        System.out.println(this + " sings");
    }

    @Override
    public String toString() {
        return name;
    }
}
