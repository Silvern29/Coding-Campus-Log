package at.redlinghaus;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        while (i < 11) {
            int j = 1;
            while (j < 11) {
                System.out.printf("%2d X %2d = %3d   ", i, j, i*j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
