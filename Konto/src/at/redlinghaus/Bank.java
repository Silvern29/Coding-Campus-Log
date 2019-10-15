package at.redlinghaus;

import java.util.LinkedList;
import java.util.Scanner;

public class Bank {
    public static LinkedList<Customer> customersList = new LinkedList<>();
    public static int nextCustomerNumber = 0;

    public static int nextAccountNumber = 0;
    public static LinkedList<Account> accounts = new LinkedList<>();

    public static int input() {
        Scanner myScan = new Scanner(System.in);
        int choice;
        System.out.printf("Möchten Sie ein [1] Kundenkonto anlegen [2] Kundenkonto abfragen [3] Konto eröffnen [4] Geld einzahlen [5] Geld abheben [6] Geld überweisen [7] Kundenkonto wechseln [8] Exit? ");
        choice = myScan.nextInt();
        myScan.nextLine();
        return choice;
    }

    public static Customer newCustomer() {
        Scanner myScan = new Scanner(System.in);
        System.out.printf("Bitte geben Sie Ihren Namen ein! %nVorname: ");
        String custFName = myScan.nextLine();
        System.out.printf("Nachname: ");
        String custLName = myScan.nextLine();

        Customer cust = new Customer(custFName, custLName);
        customersList.add(cust);
        return cust;
    }

    public static Account newAccount(int custNum) {
        Account acc = new Account(custNum);
        accounts.add(acc);
        return acc;
    }

    public static double giveAmmount() {
        Scanner myScan = new Scanner(System.in);
        System.out.printf("Bitte gib den Betrag ein: ");
        return myScan.nextDouble();
    }


}
