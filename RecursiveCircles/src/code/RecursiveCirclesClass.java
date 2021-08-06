package code;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - August - 06
 */

public class RecursiveCirclesClass extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        drawCircle(group, 500, 500, 500);
        Scene scene = new Scene(group, 1000,1000);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void drawCircle(Group group, float x, float y, float d){
        Circle circle = new Circle(x, y, d);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        group.getChildren().add(circle);
        if (d > 3){
            drawCircle(group, x + (d/2), y, d/2);
            drawCircle(group, x - (d/2), y, d/2);
            drawCircle(group, x, y + (d/2), d/2);
            drawCircle(group, x, y - (d/2), d/2);
        }
    }
}
