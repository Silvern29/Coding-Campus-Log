package at.redlinghaus;

public class Product {

    private String productName;
    private double price;

    public Product(String productName, double price){
        this.price = price;
        this.productName = productName;
        Shop.productList.add(this);
    }

    @Override
    public String toString() {
        return productName + " - " + price + " €";
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
