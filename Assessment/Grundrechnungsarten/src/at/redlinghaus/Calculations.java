package at.redlinghaus;

public class Calculations {
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mult(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Value of b cannot be \"0\"!");
        } else {
            return a/b;
        }
    }
}
