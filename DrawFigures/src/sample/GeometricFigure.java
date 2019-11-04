package sample;

import javafx.scene.canvas.GraphicsContext;

public abstract class GeometricFigure {
    protected int offSetX, offSetY;

    public GeometricFigure(int offSetX, int offSetY){
        this.offSetX = offSetX;
        this.offSetY = offSetY;
    }

    public abstract int calculateArea();

    public abstract void draw (GraphicsContext gc);
}
