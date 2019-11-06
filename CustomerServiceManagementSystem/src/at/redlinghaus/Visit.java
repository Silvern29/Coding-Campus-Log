package at.redlinghaus;

import java.util.Date;

public class Visit {
    private Visitable location;
    private Customer customer;
    private Date date;
    private double totalServiceExpense;
    private double totalProductExpense;

    public Visit(Visitable location, Customer customer) {
        this.location = location;
        this.customer = customer;
        totalProductExpense = customer.getCart().totalProductExpense();
    }

    public double calcTotalService() {
        return customer.getCart().totalServiceExpense();
    }

    public int calcTotalRebate(){

    }

}
