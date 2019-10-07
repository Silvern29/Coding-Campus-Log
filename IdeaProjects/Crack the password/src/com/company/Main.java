package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Password pw = new Password();


        System.out.printf("Dein generiertes Passwort heißt: ");
        System.out.println(pw);

        System.out.printf("Das gefundene Passwort ist: ");
        System.out.println(Arrays.toString(pw.decypher(pw.getPass())));
    }
}