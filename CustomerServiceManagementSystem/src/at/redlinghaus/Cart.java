package at.redlinghaus;

import java.util.LinkedList;
import java.util.List;

public class Cart {
    private List<CartItem> shoppedItems = new LinkedList<>();

    public void addToCart (Article article, int ammount) {
        shoppedItems.add(new CartItem(article, ammount));
    }

    public void changeAmmount (Article article, int ammount) {
        for (CartItem el : shoppedItems) {
            if (el.getArticle() == article) {
                el.setAmmount(ammount);
                if (el.getAmmount() == 0) {
                    shoppedItems.remove(el);
                }
            }
        }
    }

    public double totalServiceExpense (){
        double total = 0;
        for (CartItem el : shoppedItems) {
            if (el.getArticle() instanceof Service) {
                total += el.getArticle().getPrice() * el.getAmmount();
            }
        }
        return total;
    }

    public double totalProductExpense () {
        double total = 0;
        for (CartItem el : shoppedItems) {
            if (el.getArticle() instanceof Product) {
                total += el.getArticle().getPrice() * el.getAmmount();
            }
        }
        return total;
    }
}
