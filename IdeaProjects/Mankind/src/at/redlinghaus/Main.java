package at.redlinghaus;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Human> humanList = new LinkedList<>();

        Human w = new Woman("Sarah Müller", new Date(), 60, 165);
        humanList.add(w);

        Human m = new Man("Karl Maier", new Date(), 80, 165);
        humanList.add(m);

        for (Human el : humanList) {
            System.out.println();
            System.out.println(el instanceof Woman ? "Frau" : el instanceof Man ? "Herr" : "");
            System.out.println(el.name);
            System.out.println(el.getBMILimit());
            System.out.println(el.calcBMI());
            el.checkBMI();
        }
    }
}
