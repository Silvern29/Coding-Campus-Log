package at.redlinghaus;

public class Machine implements Singer {
    private String name;

    public Machine(String name){
        this.name = name;
    }

    @Override
    public void sing() {
        System.out.println(this + " rattles");
    }

    @Override
    public String toString() {
        return name;
    }
}
