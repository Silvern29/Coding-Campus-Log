package at.redlinghaus;

public class Main {

    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 10;

        a += b++ / 2 * ++a - 3;
        System.out.println("a = 5, b = 10");
        System.out.println("a += b++ / 2 * ++a - 3");
        System.out.printf("a = %d, b = %d%n", a, b);
    }
}
