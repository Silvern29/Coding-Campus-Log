package at.redlinghaus;

public class Customer {

    private String name;
    private String payment;
    private  int custNum;
    private double account;
    private Cart custCart;

    public Customer(String name, String payment, double account) {
        this.name = name;
        this.payment = payment;
        this.custNum = Shop.custNum++;
        this.account = account;
        this.custCart = new Cart();
        Shop.customerList.add(this);
    }

    public String getName() {
        return name;
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

    public void pay() {
        if(custCart.getTotal() < account) {
            account -= custCart.getTotal();
        } else {
            System.out.println("Dein Geld reicht leider nicht aus!");
        }
    }
}
