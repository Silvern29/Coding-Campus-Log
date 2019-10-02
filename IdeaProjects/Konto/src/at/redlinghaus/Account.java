package at.redlinghaus;

import java.util.Scanner;

import static at.redlinghaus.Bank.customersList;

public class Account {
    private int accNum;
    private int cust;
    private double balance;

    public Account(int custNum) {
        cust = custNum;
        accNum = Bank.nextAccountNumber++;
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

    public static int giveAccNum() {
        Scanner myScan = new Scanner(System.in);
        System.out.printf("Bitte gib die Kontonummer ein: ");
        return myScan.nextInt();
    }
}
