package at.redlinghaus;

import java.util.LinkedList;
import java.util.List;

public class Cart {
    private List<CartItem> cartList = new LinkedList<>();

    public List<CartItem> getCartList() {
        return cartList;
    }

    public void addToCart(Product product, int ammount) {
        cartList.add(new CartItem(product, ammount));
    }

    public void removeFromCart(Product product, int ammount) {
        for(CartItem el : cartList) {
            if (el.getProduct() == product) {
                el.setAmmount(el.getAmmount() - ammount);
                if (el.getAmmount() <= 0) {
                    cartList.remove(el);
                }
            }
        }
    }

    public double getTotal() {
        double total = 0;
        for (CartItem el : this.cartList) {
            total += el.getProduct().getPrice() * el.getAmmount();
        }
        return total;
    }
}
