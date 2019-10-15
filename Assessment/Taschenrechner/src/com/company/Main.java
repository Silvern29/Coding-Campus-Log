package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int brac = 0;
        String op = "+-*/";
        String num = "0123456789"; //TODO num.contains() funktioniert nicht, wenn result >=10 auf stack gepusht wird
        Stack<String> calc = new Stack<>();
        String regex = "[+-]?([0-9])+";
        String regex2 = "[*/)(]";
        Scanner myScan = new Scanner(System.in);

//        System.out.println("Bitte gib deine Rechnung ein: ");
//        String input = myScan.nextLine();
        String input = "(5+4)*((48-44)/2)";

        String[] inputArr = input.split("");
        System.out.println(Arrays.toString(inputArr));
        String[] testInputArr = new String[input.length()];
        Arrays.fill(testInputArr, "");
        int j = 0;
        for (int i = 0; i < inputArr.length; i++) {
            String tmp = "";
            if (inputArr[i].matches(regex2)) {
                    testInputArr[j] = inputArr[i];
            }
            while (inputArr[i].matches(regex)) {
                if (i != 0 && (inputArr[i-1].equals("-") || inputArr[i-1].equals("+"))) {
                    testInputArr[j] = inputArr[i-1];
                }
                testInputArr[j] += inputArr[i];
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(testInputArr));

        if (inputArr.length == 1) {
            System.out.println(inputArr[0]);
        } else {
            for (int i = 0; i < input.length(); i++) {
                if (inputArr[i].equals("(")) {
                    brac++;
                } else {
                    if (inputArr[i].equals(")") || i >= input.length() - 1) {
                        if (inputArr[i].equals(")")) {
                            brac--;
                        } else if (!inputArr[i].equals(")") && i == input.length() - 1) {
                            calc.push(inputArr[i]);
                        }

                        while (calc.size() > 2 + brac) {
                            String a = "";
                            String b = "";
                            int result = 0;
                            while (!calc.isEmpty() && calc.peek().matches(regex)) {
                                a = calc.pop() + a;
                            }
                            switch (calc.peek()) {
                                case "*":
                                    calc.pop();
                                    while (!calc.isEmpty() && num.contains(calc.peek())) {
                                        b = calc.pop() + b;
                                    }
                                    result = Integer.parseInt(b) * Integer.parseInt(a);
                                    break;
                                case "/":
                                    calc.pop();
                                    while (!calc.isEmpty() && num.contains(calc.peek())) {
                                        b = calc.pop() + b;
                                    }
                                    result = Integer.parseInt(b) / Integer.parseInt(a);
                                    break;
                                default:
                                    calc.pop();
                                    while (!calc.isEmpty() && calc.peek().matches(regex)) {
                                        b = calc.pop() + b;
                                    }
                                    result = Integer.parseInt(b) + Integer.parseInt(a);
                                    System.out.println(result);
                                    System.out.println(a);
                                    System.out.println(b);
                                    break;
                            }

                            if (calc.size() == 0 && brac > 0) {
                                brac--;
                            }

                            calc.push(Integer.toString(result));
                        }
                    } else if ((input.charAt(i) == '*' || input.charAt(i) == '/') && input.charAt(i + 1) != '(') {
                        String a = "";
                        String b = "";
                        int result = 0;
                        while (inputArr[i + 1].matches(regex)) {
                            i++;
                            a += inputArr[i];
                        }
                        while (!calc.isEmpty() && calc.peek().matches(regex)) {
                            b = calc.pop() + b;
                        }
                        if (input.charAt(i) == '*') {
                            result = Integer.parseInt(b) * Integer.parseInt(a);
                        } else {
                            result = Integer.parseInt(b) / Integer.parseInt(a);
                        }
                        calc.push(Integer.toString(result));
                    } else {
                        calc.push(inputArr[i]);
                    }
                }
                System.out.println(calc);
            }
            System.out.printf("Das Ergebnis ist: %s%n", Integer.parseInt(calc.pop()));
            System.out.println(Arrays.toString(inputArr));
        }
    }
}
