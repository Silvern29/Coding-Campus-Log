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
        objects.add(new Rectangle(100, 200, 10, 10, true, Color.RED));
        objects.add(new Square(100, 120, 10, false, Color.BLACK));
        objects.add(new Circle(100, 230, 10, false, Color.YELLOW));

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
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
