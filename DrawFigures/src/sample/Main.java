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
    ArrayList<GeometricFigure> objects = new ArrayList<>();

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
        gc.setFill(Color.DARKGREEN);
        gc.setStroke(Color.DARKCYAN);
        gc.setLineWidth(5);

        gc.fillOval(10,10, 80 , 80);

        gc.setFill(Color.DARKCYAN);
        gc.fillRoundRect(100,100,80,80, 40, 40);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
