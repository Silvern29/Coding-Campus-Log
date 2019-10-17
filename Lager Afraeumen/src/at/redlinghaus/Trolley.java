package at.redlinghaus;

import java.util.LinkedList;
import java.util.List;

public class Trolley {
    private final int MAX_WEIGHT = 20;
    private int weight = 0;
    private List<Product> load = new LinkedList<>();

    public void pickUp(Field field) {
        if (field.totalWeight() <= MAX_WEIGHT - weight) {
            load.addAll(field.getProductsOnField());
            weight += field.totalWeight();
            field.getProductsOnField().clear();
        } else {
            for (Product product : field.getProductsOnField()) {
                if (weight + product.getWeight() <= MAX_WEIGHT) {
                    load.add(product);
                    weight += product.getWeight();
                    field.getProductsOnField().remove(product);
                }
            }
        }
    }

    public void unload(Stock stock) {
        stock.getMatrix()[0][0].getProductsOnField().addAll(this.load);
        load.clear();
        weight = 0;
    }

    @Override
    public String toString() {
        return "Trolley " + weight + "kg Ladung: " + load;
    }
}
