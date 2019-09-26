import java.util.Arrays;
import java.util.Date;

public class BruteForceTest {
    public static String password = "ZZZZZ";
    public static char[] charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static char[] currentGuess = new char[1];
    public String username = "";

    public BruteForceTest() {
        Arrays.fill(currentGuess, charset[0]);
    }

    public static void bruteForce() {
        String attempt = "";
        Date start = new Date();
        while (true) {
            if (attempt.equals(password)) {
                Date end = new Date();
                System.out.println("Password: " + attempt + "\nTotal time to crack: " + ((end.getTime() - start.getTime()) / 1000) + " seconds." + "\n");
                break;
            }
            attempt = in.toString();
            // System.out.println("Tried: " + attempt);
            in.increment();
        }
    }

    public void increment() {
        int index = currentGuess.length - 1;
        while (index >= 0) {
            if (currentGuess[index] == charset[charset.length - 1]) {
                if (index == 0) {
                    currentGuess = new char[currentGuess.length + 1];
                    Arrays.fill(currentGuess, charset[0]);
                    break;
                } else {
                    currentGuess[index] = charset[0];
                    index--;
                }
            } else {
                currentGuess[index] = charset[Arrays.binarySearch(charset, currentGuess[index]) + 1];
                break;
            }
        }
    }

    public String toString() {
        return String.valueOf(currentGuess);
    }
}