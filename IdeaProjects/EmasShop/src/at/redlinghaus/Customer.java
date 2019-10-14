package at.redlinghaus;

public class Customer {

    private String payment;
    private  int custNum;
    private double account;
    private Cart custCart;

    public Customer(String payment, double account, Shop shop) {
        this.payment = payment;
        this.custNum = shop.newCustNum();
        this.account = account;
        this.custCart = new Cart();
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public String getPayment() {
        return payment;
    }

    public int getCustNum() {
        return custNum;
    }

    public double getAccount() {
        return account;
    }

    public Cart getCustCart() {
        return custCart;
    }

    public boolean pay() {
        if(custCart.getTotal() < account) {
            account -= custCart.getTotal();
            return true; /*String.format("%6.2f €",custCart.getTotal())*/
        } else {
            return false;
        }
    }
}
