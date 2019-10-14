package at.redlinghaus;

public class CartItem {
    Product product;
    int ammount;

    public CartItem(Product product, int ammount){
        this.product = product;
        this.ammount = ammount;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public double getProductTotal() {
       return this.product.getPrice() * this.getAmmount();
    }
}
