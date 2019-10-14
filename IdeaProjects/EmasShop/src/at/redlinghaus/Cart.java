package at.redlinghaus;

import java.util.LinkedList;
import java.util.List;

public class Cart {
    private List<Product> cartList = new LinkedList<>();
    private double total = 0;

    public List<Product> getCartList() {
        return cartList;
    }

    public void addProdToCart(Product product) {
        this.total += product.getPrice();
        this.cartList.add(product);
    }

    public double getTotal() {
        return total;
    }
}
