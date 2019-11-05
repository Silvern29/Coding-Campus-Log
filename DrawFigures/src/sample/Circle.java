package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends GeometricFigure {
    private int radius;

    public Circle(int radius, int offSetX, int offSetY){
        super(offSetX, offSetY);
        this.radius = radius;
    }

    @Override
    public int calculateArea() {
        return (int) Math.round(radius * radius * Math.PI);
    }

    @Override
    public void draw (GraphicsContext gc) {
        gc.setFill(Color.BLUE);
        gc.setStroke(Color.DARKCYAN);
        gc.setLineWidth(5);

        gc.fillOval(offSetX, offSetY, radius * 2, radius * 2);
        gc.fillText(this.calculateArea() + "", offSetX, offSetY);
    }
}
