package com.company;

public class Crypt {
    public String cryption(String text, int offset) {
        String result = "";
        int length = text.length();
        offset %= 26;
        if (offset < 0) {
            offset += 26;
        }

        for (int i = 0; i < length; i++) {
            char ltr = text.charAt(i);
            if (Character.isLetter(ltr)) {
                char newLtr = (char)(ltr + offset);
                if ((Character.isLowerCase(ltr) && newLtr > 'z') || (Character.isUpperCase(ltr) && newLtr > 'Z')) {
                    result += (char)(ltr - (26 - offset));
                } else {
                    result += (char)(newLtr);
                }
            } else {
                result += ltr;
            }
        }

        return result;
    }

    public String decode(String text, int offset) {
        return cryption(text, -offset);
    }

    public String encode(String text, int offset) {
        return cryption(text, offset);
    }
}
