package at.redlinghaus;

import java.util.LinkedList;

import static at.redlinghaus.Customer.customersList;

public class Account {
    private int accNum;
    private int cust;
    private double balance;
    private static int nextAccountNumber = 0;

    public static LinkedList<Account> accounts = new LinkedList<>();


    public Account(int custNum) {
        cust = custNum;
        accNum = Account.nextAccountNumber++;
        balance = 0;
    }

    @Override
    public String toString() {
        return "Kontonummer: " + accNum +
                ", Kundennummer: " + cust +
                ", " + customersList.get(cust).getfName() + " " + customersList.get(cust).getlName() +
                ", Stand: " + balance + " Euro";
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public int getCust() {
        return cust;
    }

    public void setCust(int cust) {
        this.cust = cust;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
