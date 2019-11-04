package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {
    static ArrayList<GeometricFigure> objects = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Drawing Figures");
        Group root = new Group();
        Canvas canv = new Canvas(300, 250);
        GraphicsContext gc = canv.getGraphicsContext2D();

        drawShapes(gc);

        root.getChildren().add(canv);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void drawShapes(GraphicsContext gc) {
        for (GeometricFigure el : objects) {
            el.draw(gc);
        }
    }


    public static void main(String[] args) {
        objects.add(new Rectangle(40, 80, 10, 10));
        objects.add(new Square(40, 50, 10));
        objects.add(new Circle(40, 90, 10));

        launch(args);
    }
}
