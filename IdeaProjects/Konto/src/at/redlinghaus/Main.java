package at.redlinghaus;

import java.util.Scanner;

import static at.redlinghaus.Account.accounts;
import static at.redlinghaus.Customer.customersList;

public class Main {

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

    public static int giveCustNum() {
        Scanner myScan = new Scanner(System.in);
        System.out.printf("Bitte geben Sie Ihre Kundennummer ein: ");
        return myScan.nextInt();
    }

    public static double giveAmmount() {
        Scanner myScan = new Scanner(System.in);
        System.out.printf("Bitte gib den Betrag ein: ");
        return myScan.nextDouble();
    }

    public static int giveAccNum() {
        Scanner myScan = new Scanner(System.in);
        System.out.printf("Bitte gib die Kontonummer ein: ");
        return myScan.nextInt();
    }

    public static void main(String[] args) {
        Customer cust1 = new Customer("Heinz", "Müller");
        customersList.add(cust1);

        Account acc1 = new Account(0);
        accounts.add(acc1);
        cust1.getCustAccList().add(acc1);

        System.out.println("Herzlich Willkommen!");

        int choice = 0;
        Customer activeCust;
        int activeCustNum = -1;
        int activeAccNum = -1;
        Account activeAcc = null;
        double deposit;

        while (choice != 8) {
            choice = input();
            switch(choice) {
                case 1:
                    activeCust = newCustomer();
                    activeCustNum = activeCust.getCustNum();
                    System.out.println(activeCust);
                    break;
                case 2:
                    activeCustNum = activeCustNum >= 0 ? activeCustNum : giveCustNum();
                    System.out.println(customersList.get(activeCustNum));
                    break;
                case 3:
                    activeCustNum = activeCustNum >= 0 ? activeCustNum : giveCustNum();
                    activeAcc = newAccount(activeCustNum);
                    activeAccNum = activeAcc.getAccNum();
                    activeCust = customersList.get(activeCustNum);
                    activeCust.custAccList.add(activeAcc);
                    System.out.println(accounts.get(activeAcc.getAccNum()));
                    break;
                case 4:
                    activeAccNum = activeAccNum >= 0 ? activeAccNum : giveAccNum();
                    activeAcc = accounts.get(activeAccNum);
                    deposit = giveAmmount();
                    activeAcc.setBalance(activeAcc.getBalance() + deposit);
                    System.out.printf("Neuer Betrag: %.2f Euro%n", activeAcc.getBalance());
                    activeCustNum = activeAcc.getCust();
                    activeCust = customersList.get(activeCustNum);
                    break;
                case 5:
                    activeAccNum = activeAccNum >= 0 ? activeAccNum : giveAccNum();
                    activeAcc = accounts.get(activeAccNum);
                    deposit = giveAmmount();
                    activeAcc.setBalance(activeAcc.getBalance() - deposit);
                    System.out.printf("Neuer Betrag: %.2f Euro%n", activeAcc.getBalance());
                    activeCustNum = activeAcc.getCust();
                    activeCust = customersList.get(activeCustNum);
                    break;
                case 6:
                    activeAccNum = activeAccNum >= 0 ? activeAccNum : giveAccNum();
                    activeAcc = accounts.get(activeAccNum);
                    deposit = giveAmmount();
                    Account sendAcc = accounts.get(giveAccNum());
                    activeAcc.setBalance(activeAcc.getBalance() - deposit);
                    sendAcc.setBalance(sendAcc.getBalance() + deposit);
                    System.out.printf("%.2f Euro gesendet. Neuer Kontostand: %.2f%n", deposit, activeAcc.getBalance());
                    activeCustNum = activeAcc.getCust();
                    activeCust = customersList.get(activeCustNum);
                    break;
                case 7:
                    activeAcc = null;
                    activeCust = null;
                    activeAccNum = -1;
                    activeCustNum = -1;
                    break;
                case 8:
                    System.out.println("Vielen Dank! Auf Wiedersehen!");
                    break;
                default:
                    System.out.println("Da ist etwas schief gegangen. Versuchen Sie es noch einmal.");
                    break;
            }
        }
    }
}
