package at.redlinghaus;

public class Main {

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Good Night";

        System.out.println(str1);
        System.out.println(str2);

        str1 = str1 + str2;
        System.out.println(str1);

        str1 = str2;
        System.out.println(str1);
        System.out.println(str2);
    }
}
