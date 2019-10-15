package com.company;

import java.util.Arrays;

public class Password {
    final String[] CHARS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "_", "!", "§", "$", "&", "?"};

    private String[] pass = new String[4];

    public Password(){
        newPassword();
    }

    public String[] getPass() {
        return pass;
    }

    @Override
    public String toString() {
        String output = "";
        for (String el : pass) {
            output += el;
        }
        return output;
    }

    public void newPassword(){
        for (int i = 0; i < 4; i++) {
            pass[i] = CHARS[(int) (Math.floor(Math.random() * CHARS.length))];
        }
    }

    public String[] decypher(String[] password) {
        password = this.pass;
        for (int i = 0; i < CHARS.length; i++) {
            for (int j = 0; j < CHARS.length; j++) {
                for (int k = 0; k < CHARS.length; k++) {
                    for (int l = 0; l < CHARS.length; l++) {
                        if (CHARS[i] == password[0] && CHARS[j] == password[1] && CHARS[k] == password[2] && CHARS[l] == password[3]) {
                            String [] result = {CHARS[i], CHARS[j], CHARS[k], CHARS[l]};
                            return result;
                        }
                    }
                }
            }
        } return null;
    }
}
