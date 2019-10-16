package at.redlinghaus;

import java.util.Scanner;

public class Game {
    private int pTrolleyY = 0;
    private int pTrolleyX = 0;
    Trolley myTroll;
    Stock myStock;
    Scanner myScan;
    Renderer myRend;
    int moves = 0;
    Grid myGrid;

    public Game(){
        myTroll = new Trolley();
        myStock = new Stock();
        myScan = new Scanner(System.in);
        myRend = new Renderer(myStock.getMatrix());
        changePosition(0,0);
        quake();
        myGrid = new Grid(myStock.getMatrix());
    }

    public void play(){
        while(!myStock.isEmpty()) {
//            myRend.render();
            input();
            if (pTrolleyY == 0 && pTrolleyX == 0){
                myTroll.unload(myStock);
                myStock.switchEmpty();
            } else if (myStock.getMatrix()[pTrolleyY][pTrolleyX].getProductsOnField().size() > 0){
                myTroll.pickUp(myStock.getMatrix()[pTrolleyY][pTrolleyX]);
            }
            moves++;
        }
        myGrid.getPane().revalidate();
        myGrid.getPane().repaint();
//        new Grid(myStock.getMatrix());
//        myRend.render();
        System.out.println("Congratulation! The work is done in " + moves + " moves!");
    }

    public void changePosition(int y, int x) {
        if(y >= 0 && y < myStock.getMatrix().length && x >= 0 && x < myStock.getMatrix()[0].length) {
            myStock.getMatrix()[pTrolleyY][pTrolleyX].setTrolleyOnField(null);
            myStock.getMatrix()[y][x].setTrolleyOnField(myTroll);
            pTrolleyY = y;
            pTrolleyX = x;
        }
    }

    public void quake(){
        for(int k = 0; k < 10; k++) {
            int i = (int) Math.floor(Math.random()*9);
            int j = (int) Math.floor(Math.random()*9);
            myStock.getMatrix()[i][j].getProductsOnField().add(new Product());
        }
    }

    public void input(){
        String key = "";
        key = myScan.nextLine();
        switch (key.toLowerCase()){
            case "w": changePosition(pTrolleyY - 1, pTrolleyX);
            break;
            case "a": changePosition(pTrolleyY, pTrolleyX - 1);
            break;
            case "s": changePosition(pTrolleyY + 1, pTrolleyX);
            break;
            case "d": changePosition(pTrolleyY, pTrolleyX + 1);
            break;
            default: input();
        }
    }

}
