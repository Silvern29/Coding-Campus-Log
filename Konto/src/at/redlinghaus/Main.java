package at.redlinghaus;

import static at.redlinghaus.Bank.accounts;
import static at.redlinghaus.Bank.customersList;

public class Main {

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
            choice = Bank.input();
            switch (choice) {
                case 1:
                    activeCust = Bank.newCustomer();
                    activeCustNum = activeCust.getCustNum();
                    System.out.println(activeCust);
                    break;
                case 2:
                    activeCustNum = activeCustNum >= 0 ? activeCustNum : Customer.giveCustNum();
                    System.out.println(customersList.get(activeCustNum));
                    break;
                case 3:
                    activeCustNum = activeCustNum >= 0 ? activeCustNum : Customer.giveCustNum();
                    activeAcc = Bank.newAccount(activeCustNum);
                    activeAccNum = activeAcc.getAccNum();
                    activeCust = customersList.get(activeCustNum);
                    activeCust.custAccList.add(activeAcc);
                    System.out.println(accounts.get(activeAcc.getAccNum()));
                    break;
                case 4:
                    activeAccNum = activeAccNum >= 0 ? activeAccNum : Account.giveAccNum();
                    activeAcc = accounts.get(activeAccNum);
                    deposit = Bank.giveAmmount();
                    activeAcc.setBalance(activeAcc.getBalance() + deposit);
                    System.out.printf("Neuer Betrag: %.2f Euro%n", activeAcc.getBalance());
                    activeCustNum = activeAcc.getCust();
                    activeCust = customersList.get(activeCustNum);
                    break;
                case 5:
                    activeAccNum = activeAccNum >= 0 ? activeAccNum : Account.giveAccNum();
                    activeAcc = accounts.get(activeAccNum);
                    deposit = Bank.giveAmmount();
                    activeAcc.setBalance(activeAcc.getBalance() - deposit);
                    System.out.printf("Neuer Betrag: %.2f Euro%n", activeAcc.getBalance());
                    activeCustNum = activeAcc.getCust();
                    activeCust = customersList.get(activeCustNum);
                    break;
                case 6:
                    activeAccNum = activeAccNum >= 0 ? activeAccNum : Account.giveAccNum();
                    activeAcc = accounts.get(activeAccNum);
                    deposit = Bank.giveAmmount();
                    Account sendAcc = accounts.get(Account.giveAccNum());
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
