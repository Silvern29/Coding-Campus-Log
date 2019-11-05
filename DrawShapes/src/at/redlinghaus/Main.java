package at.redlinghaus;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {
    static ArrayList<Shape> objects = new ArrayList<>();

    public static void main(String[] args) {
        MovablePoint mr = new MovablePoint(10, 10);
        MovablePoint msq = new MovablePoint(120, 10);
        MovablePoint mc = new MovablePoint(330, 110);
        Shape sr = new Rectangle(100, 200, mr, false, Color.RED);
        Shape ssq = new Square(100, msq, true, Color.BLUE);
        Shape sc = new Circle(100, mc, true, Color.YELLOW);
        objects.add(sr);
        objects.add(ssq);
        objects.add(sc);

        ((Rectangle) sr).moveRight(100);
        ((Rectangle) sr).moveDown(100);
        ((Square) ssq).moveUp(25);
        ((Square) ssq).moveLeft(100);
        ((Circle) sc).moveLeft(50);

        ((Rectangle) sr).resize(120);
        ((Square) ssq).resize(150);
        ((Circle) sc).resize(80);

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Figures");
        Group root = new Group();
        Canvas canv = new Canvas(600, 500);
        GraphicsContext gc = canv.getGraphicsContext2D();

        drawShapes(gc);

        root.getChildren().add(canv);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void drawShapes(GraphicsContext gc) {
        for (Shape el : objects) {
            el.draw(gc);
        }
    }
}
