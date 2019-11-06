package at.redlinghaus;

public class CartItem {
    private Article article;
    private int ammount;

    public CartItem(Article article, int ammount){
        this.article = article;
        this.ammount = ammount;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }
}
