package at.redlinghaus;

public class PersonalManagement {
    static final String company = "Müller Milch";
    static final String compStreet = "Auf der Brücke 8";
    static final int compZip = 87568;
    static final String compCity = "Entenhausen";
    static final String compEmail = "entenhausen2@mueller.de";

    public static void main(String[] args) {
        Person joe = new Person("Josef", "Meier");
        Person tic = new Person("Tic", "Duck", "Unter der Brücke 35, 87568 Entenhausen");
        Person track = new Person("Track", "Duck", "Unter der Brücke 5, 87568 Entenhausen", 25);

        joe.setCompanyAdress();
        tic.setCompanyAdress();
        track.setCompanyAdress();

        System.out.println(joe.getCompanyAdress());
        joe.setAge(joe.getAge() + 1);

        joe.printPersonData(25);
        System.out.println();
        tic.printPersonData("Müller");
        System.out.println();
        track.printPersonData();
    }
}
