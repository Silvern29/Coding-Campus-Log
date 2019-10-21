package at.redlinghaus;

import java.util.Date;

public class Man extends Human {

    public Man(String name, Date dateOfBirth, double weight, double height) {
        super(name, dateOfBirth, weight, height);
    }

    @Override
    public double getBMILimit() {
        return 24.5;
    }
}
