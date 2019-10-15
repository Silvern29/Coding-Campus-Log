package at.redlinghaus;

public class Main {

    public static void main(String[] args) {

        int result;

        for (int number1 = 1; number1 < 11; number1++) {
            for (int number2 = 1; number2 < 11; number2++) {
                result = number1 * number2;
                System.out.printf("%2d x %2d = %2d    ", number1, number2, result);
            }
            System.out.println();
        }
    }
}
