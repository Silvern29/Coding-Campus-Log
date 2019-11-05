package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends GeometricFigure {
    private int sideA;

    public Square(int sideA, int offSetX, int offSetY){
        super(offSetX, offSetY);
        this.sideA = sideA;
    }
    @Override
    public int calculateArea() {
        return sideA * sideA;
    }

    @Override
    public void draw (GraphicsContext gc) {
        gc.setFill(Color.INDIANRED);
        gc.setStroke(Color.DARKCYAN);
        gc.setLineWidth(5);

        gc.fillRect(offSetX, offSetY, sideA, sideA);
        gc.fillText(this.calculateArea() + "", offSetX, offSetY);
    }
}
