package at.redlinghaus;

import java.util.Date;

public class Woman extends Human {

    public Woman(String name, Date dateOfBirth, double weight, double height) {
        super(name, dateOfBirth, weight, height);
    }

    @Override
    public double getBMILimit() {
        return 23.5;
    }
}
