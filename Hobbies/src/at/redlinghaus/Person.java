package at.redlinghaus;

public class Person implements Singing, Dancing, Painting {
    private String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public void dance(){
        System.out.println(this + " dances");
    }

    @Override
    public void paint() {
        System.out.println(this + " paints");
    }

    @Override
    public void sing() {
        System.out.println(this + " sings");
    }

    @Override
    public String toString() {
        return name + "";
    }
}
