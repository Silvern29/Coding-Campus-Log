package at.redlinghaus;

import java.util.Date;

public class Visit {
    private Visitable location;
    private Customer customer;
    private Date date;
    private double totalServiceExpense;
    private double totalProductExpense;
    private int totalRebate;

    public Visit(Visitable location, Customer customer) {
        this.location = location;
        this.customer = customer;
    }

    public void calcTotalService() {
        totalServiceExpense = customer.getCart().totalServiceExpense();
    }
    public void calcTotalProduct() {
        totalProductExpense = customer.getCart().totalProductExpense();
    }

    public void calcTotalRebate(){

    }

}
