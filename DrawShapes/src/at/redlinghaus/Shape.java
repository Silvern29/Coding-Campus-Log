package at.redlinghaus;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {
    protected boolean isFilled;
    protected Color color;
    protected MovablePoint offSet;

    public Shape() {
    }

    public Shape(MovablePoint offSet, boolean isFilled, Color color) {
        this.offSet = offSet;
        this.color = color;
        this.isFilled = isFilled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void draw(GraphicsContext gc);
}
