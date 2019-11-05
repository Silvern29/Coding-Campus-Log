package at.redlinghaus;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape {
    private int radius;

    public Circle(){}

    public Circle(int radius, int offSetX, int offSetY, boolean isFilled, Color color) {
        super(offSetX, offSetY, isFilled, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (int) Math.round(radius * radius * Math.PI);
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.setStroke(color);
        gc.setLineWidth(5);
        gc.fillOval(offSetX, offSetY, radius * 2, radius * 2);

        if(!isFilled) {
            gc.setFill(Color.WHITE);
            gc.fillOval(offSetX + 5, offSetY + 5, radius * 2 - 10, radius * 2 - 10);
        }

        gc.setFill(Color.BLACK);
        gc.fillText(this.toString(), offSetX + 20, offSetY + radius * 2 + 20);
    }

    @Override
    public String toString() {
        return String.format("Circle\nRadius: %d\nArea: %6.2f\nPerimeter: %6.2f", radius, getArea(), getPerimeter());
    }
}
