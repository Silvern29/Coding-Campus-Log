package at.redlinghaus;

import java.util.LinkedList;
import java.util.List;

public class Field {

    private Trolley trolleyOnField;
    private List<Product> productsOnField = new LinkedList<>();

    public int totalWeight() {
        int totalWeight = 0;
        for (Product product : this.productsOnField) {
            totalWeight += product.getWeight();
        }
        return totalWeight;
    }

    public Trolley getTrolleyOnField() {
        return trolleyOnField;
    }

    public void setTrolleyOnField(Trolley trolleyOnField) {
        this.trolleyOnField = trolleyOnField;
    }

    public List<Product> getProductsOnField() {
        return productsOnField;
    }

    @Override
    public String toString() {
        return "Field " + trolleyOnField + "Products " + productsOnField;
    }
}
