package at.redlinghaus;

import java.util.Date;

public class Visit {
    private Venue location;
    private Customer customer;
    private Date date;
    private double totalServiceExpense;
    private double totalProductExpense;

    public Visit(Venue location, Customer customer) {
        this.location = location;
        this.customer = customer;
    }
}
