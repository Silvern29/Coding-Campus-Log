package at.redlinghaus;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape implements Movable, Resizable {
    private int radius;

    public Circle() {
    }

    public Circle(int radius, MovablePoint offSet, boolean isFilled, Color color) {
        super(offSet, isFilled, color);
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

        if (isFilled) {
            gc.fillOval(offSet.getxPos() - radius, offSet.getyPos() - radius, radius * 2, radius * 2);
        } else {
            gc.strokeOval(offSet.getxPos() - radius, offSet.getyPos() - radius, radius * 2, radius * 2);
        }

        gc.setFill(Color.BLACK);
        gc.fillText(this.toString(), offSet.getxPos() - radius + 20, offSet.getyPos() - radius + radius * 2 + 20);
    }

    @Override
    public String toString() {
        return String.format("Circle\nRadius: %d\nArea: %6.2f\nPerimeter: %6.2f\nCenter %s", radius, getArea(), getPerimeter(), getPosition());
    }

    @Override
    public void moveUp(int amount) {
        offSet.setyPos(offSet.getyPos() - amount);
    }

    @Override
    public void moveDown(int amount) {
        offSet.setyPos(offSet.getyPos() + amount);
    }

    @Override
    public void moveLeft(int amount) {
        offSet.setxPos(offSet.getxPos() - amount);
    }

    @Override
    public void moveRight(int amount) {
        offSet.setxPos(offSet.getxPos() + amount);
    }

    @Override
    public MovablePoint getPosition() {
        return offSet;
    }

    @Override
    public void resize(double percent) {
        radius *= percent / 100;
    }
}
