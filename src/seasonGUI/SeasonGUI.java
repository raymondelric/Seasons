package seasonGUI;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.PerspectiveCamera;

public class SeasonGUI extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        stage.setTitle("Cube 3D");

       Dice c = new Dice(100);
        c.rx.setAngle(45);
        c.ry.setAngle(45);
        Dice c2 = new Dice(100);
        c2.setTranslateX(200);
        c2.rx.setAngle(45);
        c2.ry.setAngle(45);
        Dice c3 = new Dice(100);
        c3.setTranslateX(-200);
        c3.rx.setAngle(45);
        c3.ry.setAngle(45);

        Timeline animation = new Timeline();
        animation.getKeyFrames().addAll(
                new KeyFrame(Duration.ZERO,
                        new KeyValue(c.ry.angleProperty(), 0d),
                        new KeyValue(c2.rx.angleProperty(), 0d),
                        new KeyValue(c3.rz.angleProperty(), 0d)
                ),
                new KeyFrame(Duration.seconds(2),
                        new KeyValue(c.ry.angleProperty(), 360d),
                        new KeyValue(c2.rx.angleProperty(), 360d),
                        new KeyValue(c3.rz.angleProperty(), 360d)
                ));
        animation.setCycleCount(Animation.INDEFINITE);
        // create root group
        Group root = new Group(c,c2,c3);
        // translate and rotate group so that origin is center and +Y is up
        root.setTranslateX(640/2);
        root.setTranslateY(480/2);
        root.getTransforms().add(new Rotate(180,Rotate.X_AXIS));
        // create scene
        Scene scene = new Scene(root, 640,480, true);
        scene.setCamera(new PerspectiveCamera());
        stage.setScene(scene);
        stage.show();
        // start spining animation
        animation.play();
        stage.setScene(scene);
        stage.show();
    }


    public static void startGUI(String[] args) {
        launch(args);
    }
}
