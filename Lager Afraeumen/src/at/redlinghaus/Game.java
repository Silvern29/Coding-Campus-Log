package at.redlinghaus;

import java.awt.event.KeyEvent;

public class Game {
    private Trolley myTroll;
    private Stock myStock;
    private int moves = 0;
    private Grid myGrid;
    private int pTrolleyY = 0;
    private int pTrolleyX = 0;

    public Game() {
        myTroll = new Trolley();
        myStock = new Stock();
        changePosition(0, 0);
        quake();
        myGrid = new Grid(this);
    }

    public void play() {
        input(myGrid.getKey());
        if (myStock.isEmpty()) {
            System.out.println("Congratulation! The work is done in " + moves + " moves!");
            System.exit(0);
        }
        if (pTrolleyY == 0 && pTrolleyX == 0) {
            myTroll.unload(myStock);
            myStock.switchEmpty();
        } else if (myStock.getMatrix()[pTrolleyY][pTrolleyX].getProductsOnField().size() > 0) {
            myTroll.pickUp(myStock.getMatrix()[pTrolleyY][pTrolleyX]);
        }
        moves++;
        myGrid.getPane().revalidate();
        myGrid.getPane().repaint();
    }

    public void changePosition(int y, int x) {
        if (y >= 0 && y < myStock.getMatrix().length && x >= 0 && x < myStock.getMatrix()[0].length) {
            myStock.getMatrix()[pTrolleyY][pTrolleyX].setTrolleyOnField(null);
            myStock.getMatrix()[y][x].setTrolleyOnField(myTroll);
            pTrolleyY = y;
            pTrolleyX = x;
        }
    }

    public void quake() {
        for (int k = 0; k < 10; k++) {
            int i = (int) Math.floor(Math.random() * 9);
            int j = (int) Math.floor(Math.random() * 9);
            myStock.getMatrix()[i][j].getProductsOnField().add(new Product());
        }
    }

    public void input(int input) {
        if (!myStock.isEmpty()) {
            switch (input) {
                case KeyEvent.VK_UP:
                    changePosition(pTrolleyY - 1, pTrolleyX);
                    break;
                case KeyEvent.VK_LEFT:
                    changePosition(pTrolleyY, pTrolleyX - 1);
                    break;
                case KeyEvent.VK_DOWN:
                    changePosition(pTrolleyY + 1, pTrolleyX);
                    break;
                case KeyEvent.VK_RIGHT:
                    changePosition(pTrolleyY, pTrolleyX + 1);
                    break;
                default:
                    break;
            }
        }
    }

    public Stock getMyStock() {
        return myStock;
    }
}
