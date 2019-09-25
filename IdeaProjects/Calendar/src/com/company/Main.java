package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
        String weekDays = " Mo | Di | Mi | Do | Fr | Sa | So |";
        Scanner myScan = new Scanner(System.in);

        System.out.printf("Bitte gib den gewünschten Monat ein (1 - 12): ");
        int m = myScan.nextInt() - 1;

        System.out.printf("Bitte gib das gewünschte Jahr ein: ");
        int y = myScan.nextInt();
        System.out.println();

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.YEAR, y);
        int start = cal.get(Calendar.DAY_OF_WEEK) - 2;

        int daysGone = 0;
        for (int l = 0; l < m; l++) {
            daysGone += daysInMonth[l];
        }
        start = (daysGone + start) % 7;
        System.out.printf(" %s %d %n %d days are gone%n", months[m], y, daysGone);
        System.out.println(weekDays);

        for (int i = 0; i < start; i++) {
            System.out.printf("     ");
        }

        for (int j = 1; j <= daysInMonth[m]; j++) {
            System.out.printf(" %2d |", j);
            if ((j + start) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
