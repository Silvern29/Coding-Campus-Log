package com.company;

public class Main {

    public static void main(String[] args) {
        String[] pw = new String[4];
        String[] chars = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "_", "!", "§", "$", "&", "?"};

        for (int i = 0; i < 4; i++) {
            pw[i] = chars[(int) (Math.floor(Math.random() * chars.length))];
        }

        System.out.printf("Das generierte Passwort heißt: ");
        for (String el : pw) {
            System.out.printf(el);
        }
        System.out.println();

        System.out.printf("Das gefundene Passwort ist: ");
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                for (int k = 0; k < chars.length; k++) {
                    for (int l = 0; l < chars.length; l++) {
                        if (chars[i] == pw[0] && chars[j] == pw[1] && chars[k] == pw[2] && chars[l] == pw[3]) {
                            System.out.println(chars[i] + chars[j] + chars[k] + chars[l]);
                        }
                    }
                }
            }
        }
    }
}