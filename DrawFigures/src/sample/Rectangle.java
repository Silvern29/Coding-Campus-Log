package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends GeometricFigure {
    private int sideA, sideB;

    public Rectangle(int sideA, int sideB, int offSetX, int offSetY){
        super(offSetX, offSetY);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int calculateArea() {
        return sideA * sideB;
    }

    @Override
    public void draw (GraphicsContext gc) {
        gc.setFill(Color.DARKGREEN);
        gc.setStroke(Color.DARKCYAN);
        gc.setLineWidth(5);

        gc.fillRect(offSetX, offSetY, sideA, sideB);
        gc.fillText(this.calculateArea() + "", offSetX, offSetY);
    }
}
