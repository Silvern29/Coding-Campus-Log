package at.redlinghaus;

import java.util.Date;

public abstract class Human {
    protected String name;
    protected Date dateOfBirth;
    protected double weight;
    protected double height;

    public Human(String name, Date dateOfBirth, double weight, double height) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.weight = weight;
        this.height = height;
    }

    public double calcBMI(){
        double heightInM = height / 100;
        return weight / (heightInM * heightInM);
    }

    public boolean isBMIOk(double limit){
        return !(calcBMI() > limit);
    }

    abstract public double getBMILimit();

    public void checkBMI() {
        if (isBMIOk(this.getBMILimit())) {
            System.out.println("Alles OK hier!");
        } else {
            System.out.println("Dass du weniger essen sollst hab ich gesagt!!!");
        }
    }
}
