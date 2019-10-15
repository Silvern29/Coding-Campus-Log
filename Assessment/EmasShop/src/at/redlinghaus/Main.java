package at.redlinghaus;

public class Main {
    public static void main(String[] args) {
        Shop myShop = new Shop();
        Customer p1 = new Customer( "Karte", 100.00, myShop);
        Cash kasse = new Cash(100.00);

        myShop.addproduct("Handy", 150.00);
        myShop.addproduct("Fleisch", 6.10);
        myShop.addproduct("Bier", 1.00);

        p1.getCustCart().addToCart(myShop.getProductList().get(0), 2);
        p1.getCustCart().addToCart(myShop.getProductList().get(1), 1);
        p1.getCustCart().addToCart(myShop.getProductList().get(2), 3);
        p1.getCustCart().removeFromCart(myShop.getProductList().get(2), 3);

        kasse.getPayed(p1);
    }
}
