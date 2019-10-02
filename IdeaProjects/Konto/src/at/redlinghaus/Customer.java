package at.redlinghaus;

import java.util.LinkedList;
import java.util.Scanner;

public class Customer {
    public LinkedList<Account> custAccList = new LinkedList<>();
    private int custNum;
    private String fName;
    private String lName;

    public Customer(String firstName, String lastName) {
        fName = firstName;
        lName = lastName;
        custNum = Bank.nextCustomerNumber++;
    }

    @Override
    public String toString() {
        return "KundenNummer: " + custNum + ", " + fName + " " + lName + ", Konten: " + custAccList;
    }

    public int getCustNum() {
        return custNum;
    }

    public void setCustNum(int custNum) {
        this.custNum = custNum;
    }

    public LinkedList<Account> getCustAccList() {
        return custAccList;
    }

    public void setCustAccList(LinkedList<Account> custAccList) {
        this.custAccList = custAccList;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public static int giveCustNum() {
        Scanner myScan = new Scanner(System.in);
        System.out.printf("Bitte geben Sie Ihre Kundennummer ein: ");
        return myScan.nextInt();
    }
}
