package com.company;

public class Main {

    public static void main(String[] args) {
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
        int start = 2;
        String weekDays = " Mo | Di | Mi | Do | Fr | Sa | So |";

        for (int k = 0; k < 12; k++) {
            int daysGone = 0;
            if (k > 0) {
                for (int l = 0; l < k; l++) {
                    daysGone += daysInMonth[l];
                }
                start = (daysGone + 2) % 7;
            }
            System.out.printf(" %s 2020 %n %d days are gone%n", months[k], daysGone);
            System.out.println(weekDays);

            for (int i = 0; i < start; i++) {
                System.out.printf("     ");
            }

            for (int j = 1; j <= daysInMonth[k]; j++) {
                if (j < 10) {
                    System.out.printf(" 0%d |", j);
                    if ((j + start) % 7 == 0) {
                        System.out.println();
                    }
                } else {
                    System.out.printf(" %d |", j);
                    if ((j + start) % 7 == 0) {
                        System.out.println();
                    }
                }
            }
            System.out.println();
            System.out.println();
        }
    }
}
