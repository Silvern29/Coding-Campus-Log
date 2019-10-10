package at.redlinghaus;

public class Main {

    public static void main(String[] args) {
        Amt myAmt = new Amt();
        Person p1 = new Person("Thomas", "Müller", 35);
        Person p2 = new Person("Thomas", "Müller", 35);
//        Ehe myMarriage = new Ehe(p1, p2);
//        System.out.println(myMarriage);

        myAmt.setApp("22.10.2019");
        myAmt.setApp("23.10.2019");
        myAmt.getApp();

        Ehe myMarry = myAmt.marry(p1,p2);
        Ehe myMarry1 = myAmt.marry(p1,p2);

        myAmt.printReg();

        myAmt.divorce(myMarry);
    }
}
