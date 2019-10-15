package at.redlinghaus;

public class Main {
    public static void main(String[] args) {
        double a = 5;
        double b = 10;

        System.out.println(add(a,b));
        System.out.println(sub(a,b));
        System.out.println(mult(a,b));
        System.out.println(div(a,b));
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mult(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Value of b cannot be \"0\"!");
        } else {
            return a/b;
        }
    }
}
