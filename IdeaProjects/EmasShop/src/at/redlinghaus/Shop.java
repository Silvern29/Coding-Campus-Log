package at.redlinghaus;

import java.util.LinkedList;
import java.util.List;

public class Shop {
    public static int custNum = 0;
    public static List<Product> productList = new LinkedList<>();
    public static List<Customer> customerList = new LinkedList<>();

    public static void main(String[] args) {

        new Product("Chips", 1.50);
        new Product("Zigaretten", 4.80);
        new Product("Lolli", 0.30);

        Customer p1 = new Customer("Udo", "Karte", 170000.00);

        p1.getCustCart().addProdToCart(productList.get(0));
        p1.getCustCart().addProdToCart(productList.get(2));
        Cash kasse = new Cash(100.00);

        kasse.getPayed(p1);
    }
}
