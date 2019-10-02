package at.redlinghaus;

import java.util.Arrays;
import java.util.LinkedList;

public class Customer {
    private int custNum;
    private String fName;
    private String lName;

    public LinkedList<Account> custAccList = new LinkedList<>();
    public static LinkedList<Customer> customersList = new LinkedList<>();

    private static int nextCustomerNumber = 0;
    public Customer(String firstName, String lastName) {
        fName = firstName;
        lName = lastName;
        custNum = Customer.nextCustomerNumber++;
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

    public static LinkedList<Customer> getCustomersList() {
        return customersList;
    }

    public static void setCustomersList(LinkedList<Customer> customersList) {
        Customer.customersList = customersList;
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
}
