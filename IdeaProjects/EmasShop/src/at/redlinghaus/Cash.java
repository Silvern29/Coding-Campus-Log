package at.redlinghaus;

public class Cash {
    private double cash;

    public void getPayed(Customer cust){
        cash += cust.getCustCart().getTotal();
        this.printBon(cust.getCustCart());
    }

    public void printBon(Cart cart) {
        System.out.println("##### Tante Ema's Laden #####");
        for(Product el : cart.getCartList()) {
            System.out.println(el);
        }
        System.out.printf("Gesamtbetrag: %.2f", cart.getTotal());
    }

    public Cash(double cash) {
        this.cash = cash;
    }
}
