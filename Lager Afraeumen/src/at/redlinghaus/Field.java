package at.redlinghaus;

import java.util.LinkedList;
import java.util.List;

public class Field {

    private Trolley trolleyOnField;
    private List<Product> productsOnField = new LinkedList<>();

    public int totalWeight(){
        int totalWeight = 0;
        for (Product product : this.productsOnField) {
            totalWeight += product.getWeight();
        }
        return totalWeight;
    }

    public boolean isEmpty(){
        return this.getProductsOnField().size() == 0 && this.getTrolleyOnField() == null;
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

    public void setProductsOnField(List productsOnField) {
        this.productsOnField = productsOnField;
    }

    @Override
    public String toString() {
        return "Field " + '\n' + trolleyOnField + '\n' + "Products " + productsOnField;
    }
}
