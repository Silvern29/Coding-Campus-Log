package at.redlinghaus;

public class Customer {
    private String name;
    private String membership;
    private int indivdualDiscount;

    public Customer(String name, String membership, int indivdualDiscount){
        this.name = name;
        this.membership = membership;
        this.indivdualDiscount = indivdualDiscount;
    }

    public String getName() {
        return name;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public int getIndivdualDiscount() {
        return indivdualDiscount;
    }

    public void setIndivdualDiscount(int indivdualDiscount) {
        this.indivdualDiscount = indivdualDiscount;
    }
}
