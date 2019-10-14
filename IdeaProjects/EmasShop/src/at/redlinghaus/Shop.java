package at.redlinghaus;

import java.util.LinkedList;
import java.util.List;

/**
 * Lösungsidee: Shop besteht aus Einkaufswagen, Produkten und Kasse. Der Kunde holt sich einen neuen Einkaufswagen und legt Produkte rein.
 * Im Einkaufswagen werden die Produkte gespeichert mit der Anzahl und ein Gesamtbetrag wird errechnet. Die Kasse nutzt die Daten der anderen
 * für die Ausgabe des Bons und die Abwicklung der Zahlung.**/

public class Shop {
    private int custNum = 0;
    private List<Product> productList = new LinkedList<>();

    public Product addproduct(String name, double price) {
        Product tmp = new Product(name, price);
        this.productList.add(tmp);
        return tmp;
    }

    public int getCustNum() {
        return custNum;
    }

    public int newCustNum() {
        return this.custNum++;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
