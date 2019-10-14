package at.redlinghaus;

import java.util.Scanner;

public class Cash {
    private double cash;
    Scanner myScan = new Scanner((System.in));

    public void getPayed(Customer cust){
        boolean ispayed = false;
        do {
            if(cust.pay()){
                cash += cust.getCustCart().getTotal();
                this.printBon(cust);
                ispayed = true;
            } else {
                System.out.println("Zahlung nicht durchgeführt! \nBitte ändern Sie die Zahlungsart.");
                System.out.print("Zahlungsart: ");
                cust.setPayment(myScan.nextLine());
                System.out.print("Verfügungsrahmen: ");
                cust.setAccount(myScan.nextDouble());
                myScan.nextLine();
            }
        } while(!ispayed);
    }

    public void printBon(Customer cust) {
        System.out.println("\n#########  Tante Ema's Laden  #########");
        for(CartItem el : cust.getCustCart().getCartList()){
            System.out.printf(" %d %s  |  %6.2f €%n", el.getAmmount(), el.getProduct(), el.getProductTotal());
        }
        System.out.printf("%n     Gesamtbetrag:             %.2f €%n%n", cust.getCustCart().getTotal());
        System.out.printf("%n     Gewählte Zahlungsart: %-12s              %n", cust.getPayment());
    }

    public Cash(double cash) {
        this.cash = cash;
    }
}
