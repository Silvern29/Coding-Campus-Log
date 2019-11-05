package at.redlinghaus;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape implements Movable, Resizable {
    protected int width, length;

    public Rectangle() {
    }

    public Rectangle(int width, int length, MovablePoint offSet, boolean isFilled, Color color) {
        super(offSet, isFilled, color);
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
        gc.setStroke(color);

        if (isFilled) {
            gc.fillRect(offSet.getxPos(), offSet.getyPos(), width, length);
        } else {
            gc.strokeRect(offSet.getxPos(), offSet.getyPos(), width, length);
        }

        gc.setFill(Color.BLACK);
        gc.fillText(this.toString(), offSet.getxPos(), offSet.getyPos() + length + 20);
    }

    @Override
    public String toString() {
        return String.format("Rectangle\n%d x %d\nArea: %6.2f\nPerimeter: %6.2f\nAnchor %s", width, length, getArea(), getPerimeter(), getPosition());
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
        width *= percent / 100;
        length *= percent / 100;
    }
}
