package at.redlinghaus;

public class Main {

    public static void main(String[] args) {
        boolean tired = false;
        int alter = 37;
        String name = "Florian";
        double missingSleep = 20257.5;

        //System.out.println(name + ", Alter: " + alter + ", fehlender Schlaf: " + missingSleep + "h, Müdigkeit: " + tired);
        System.out.printf("%s, Alter: %d, fehlender Schlaf: %,.2f h, Müdigkeit: %B%n", name, alter, missingSleep, tired);
    }
}
