package at.redlinghaus;

import java.util.LinkedList;
import java.util.List;

public class Amt {
    private List<Ehe> register = new LinkedList<>();
    private List<String> appoint = new LinkedList<>();

    public void getApp(){
        for (String el : appoint){
            System.out.println(el);
        }
    }

    public void setApp(String app) {
        boolean isFree = true;
        for( String el : appoint){
            if(app.equals(el)){
                isFree = false;
            }
        }
        if (isFree) {
            appoint.add(app);
        } else {
            System.out.println("Der Termin ist bereits vergeben!");
        }
    }

    public boolean isOldEnough (Person p1, Person p2) {
        return p1.getAge() > 17 && p2.getAge() > 17;
    }

    public boolean isMarried (Person p1, Person p2) {
        return p1.isMarried() && p2.isMarried();
    }

    public Ehe marry(Person p1, Person p2) {
        if (!isMarried(p1, p2) && isOldEnough(p1, p2)) {
            Ehe ehe = new Ehe(p1,p2);
            register.add(ehe);
            System.out.println("Gratuliere zur Hochzeit!");
            return ehe;
        } else {
            System.out.println("Ups da stimmt was nicht!");
            return null;
        }
    }

    public void printReg(){
        for (Ehe el : register){
            System.out.println(el);
        }
    }

    public void divorce(Ehe ehe) {
        boolean isEhe = false;
        for (Ehe el : register) {
            if (el.equals(ehe)) {
                isEhe = true;
            }
        }
        if(isEhe) {
            ehe.isOk = false;
            ehe.partner1.setMarried(false);
            ehe.partner2.setMarried(false);
            register.remove(ehe);
            System.out.println("Gratuliere Sie sind nun glücklich geschieden!");
        } else {
            System.out.println("Tut mir leid! Sie waren nicht verheiratet");
        }
    }
}
