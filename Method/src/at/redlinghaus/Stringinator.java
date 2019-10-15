package at.redlinghaus;

public class Stringinator {
    String vowels = "aeiou";

    public int countVowel(String str) {
        int count = 0;
        for (char el : str.toCharArray()) {
            for (char vow : vowels.toCharArray()) {
                if (el == vow) {
                    count++;
                }
            }
        }
        return count;
    }
}
