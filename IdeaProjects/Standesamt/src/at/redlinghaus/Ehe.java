package at.redlinghaus;

import java.util.Date;

public class Ehe {
    String dateOfMarriage;
    Person partner1;
    Person partner2;
    boolean isOk;

    public Ehe (Person p1, Person p2) {
        this.partner1 = p1;
        this.partner2 = p2;
        this.dateOfMarriage = new Date().toString();
        isOk = true;
        this.partner1.setMarried(true);
        this.partner2.setMarried(true);
    }

    @Override
    public String toString() {
        return "Ehe{" +
                "dateOfMarriage='" + dateOfMarriage + '\'' +
                ", partner1=" + partner1 +
                ", partner2=" + partner2 +
                ", isOk=" + isOk +
                '}';
    }
}
