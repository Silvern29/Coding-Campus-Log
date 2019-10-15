package at.redlinghaus;

import java.util.Scanner;

public class Main {
    static double a, b;
    static String op;
    static Calculations calc = new Calculations();
    static Scanner myScan = new Scanner(System.in);

    public static void main(String[] args) {
        input();
        System.out.println(calc());
    }

    public static void input() {
        System.out.print("Bitte gib deine Rechnung ein und bestätige die Eingaben mit Enter: ");
        boolean isCorrect = false;
        do {
            a = myScan.nextInt();
            isCorrect = true;
        } while (!isCorrect);

        isCorrect = false;
        do {
            op = myScan.next();
            isCorrect = true;
        } while (!isCorrect);

        isCorrect = false;
        do {
            b = myScan.nextInt();
            isCorrect = true;
        } while (!isCorrect);
    }

    public static double calc(){
        double result = 0;
        switch (op) {
            case "+":
                result = calc.add(a,b);
                break;
            case "-":
                result = calc.sub(a,b);
                break;
            case "*":
                result = calc.mult(a,b);
                break;
            case "/":
                result = calc.div(a,b);
                break;
            default:
                System.out.println("Ups!");
        }
        return result;
    }
}
