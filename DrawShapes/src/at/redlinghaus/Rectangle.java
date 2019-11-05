package at.redlinghaus;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape {
    protected int width, length;

    public Rectangle(){}

    public Rectangle(int width, int length, int offSetX, int offSetY, boolean isFilled, Color color) {
        super(offSetX, offSetY, isFilled, color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return width * 2 + length * 2;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setLineWidth(5);
        gc.setFill(color);
        gc.setStroke(Color.GRAY);
        gc.fillRect(offSetX, offSetY, width, length);

        if (!isFilled) {
            gc.clearRect(offSetX + 5, offSetY + 5, width - 10, length - 10);
        }

        gc.setFill(Color.BLACK);
        gc.fillText(this.toString(), offSetX, offSetY + length + 20);
    }

    @Override
    public String toString() {
        return String.format("Rectangle\n%d x %d\nArea: %6.2f\nPerimeter: %6.2f", width, length, getArea(), getPerimeter());
    }
}
