package at.redlinghaus;

import javafx.scene.paint.Color;

public class Square extends Rectangle {

    public Square(){}

    public Square(int side, int offSetX, int offSetY, boolean isFilled, Color color) {
        super(side, side, offSetX, offSetY, isFilled, color);
    }

    @Override
    public String toString() {
        return String.format("Square\nSide: %d\nArea: %6.2f\nPerimeter: %6.2f", width, getArea(), getPerimeter());
    }
}
