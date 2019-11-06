package at.redlinghaus;

public class Customer {
    private String name;
    private int membership;
    private int individualDiscount;
    private Cart cart;

    public Customer(String name, int membership, int individualDiscount){
        this.name = name;
        this.membership = membership;
        this.individualDiscount = individualDiscount;
        this.cart = new Cart();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMembership() {
        return membership;
    }

    public void setMembership(int membership) {
        this.membership = membership;
    }

    public int getIndividualDiscount() {
        return individualDiscount;
    }

    public void setIndividualDiscount(int individualDiscount) {
        this.individualDiscount = individualDiscount;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
