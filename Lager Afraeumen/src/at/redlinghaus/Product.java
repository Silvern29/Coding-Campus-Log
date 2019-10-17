package at.redlinghaus;

public class Product {
    private int weight;

    public Product() {
        weight = (int) Math.floor(Math.random() * 6);
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product " + weight + "kg";
    }
}
