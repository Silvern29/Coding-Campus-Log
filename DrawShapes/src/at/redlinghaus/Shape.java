package at.redlinghaus;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {
    protected int offSetX, offSetY;
    protected boolean isFilled;
    protected Color color;

    public Shape(){}

    public Shape(int offSetX, int offSetY, boolean isFilled, Color color) {
        this.offSetX = offSetX;
        this.offSetY = offSetY;
        this.color = color;
        this.isFilled = isFilled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public abstract void draw(GraphicsContext gc);
}
