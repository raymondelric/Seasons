package seasonGUI;

import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;

public class Dice extends Group {
    final Rotate rx = new Rotate(0, Rotate.X_AXIS);
    final Rotate ry = new Rotate(0, Rotate.Y_AXIS);
    final Rotate rz = new Rotate(0, Rotate.Z_AXIS);
    public Dice(double size) {
        getTransforms().addAll(rz, ry, rx);
        DiceFace[] faces = new DiceFace[6];
        for (int i = 0; i < 6; i++) {
            faces[i] = new DiceFace(1,1,2,3,true,2);
        }
        faces[0].setTranslateX(-0.5 * size);
        faces[0].setTranslateY(-0.5 * size);
        faces[0].setTranslateZ(0.5 * size);
        faces[1].setTranslateX(-0.5 * size);
        faces[1].setRotationAxis(Rotate.X_AXIS);
        faces[1].setRotate(90);
        faces[2].setTranslateX(-1 * size);
        faces[2].setTranslateY(-0.5 * size);
        faces[2].setRotationAxis(Rotate.Y_AXIS);
        faces[2].setRotate(90);
        faces[3].setTranslateY(-0.5 * size);
        faces[3].setRotationAxis(Rotate.Y_AXIS);
        faces[3].setRotate(90);
        faces[4].setTranslateX(-0.5 * size);
        faces[4].setTranslateY(-1 * size);
        faces[4].setRotationAxis(Rotate.X_AXIS);
        faces[4].setRotate(90);
        faces[5].setTranslateX(-0.5 * size);
        faces[5].setTranslateY(-0.5 * size);
        faces[5].setTranslateZ(-0.5 * size);
        getChildren().addAll(faces[0], faces[1], faces[2], faces[3], faces[4], faces[5]);
    }

    public void roll() {
        System.out.println("meow");
    }
}
class DiceFace extends Canvas{
    public static final int FIRE = 1;
    public static final int WATER = 2;
    public static final int FEATHER = 3;
    public static final int PLANT = 4;
    public static final int STAR = 5;
    public static final int CARD = 6;
    public static final int NONE = 0;
    static Image fire = new Image("/sprite/dice/fire.png");
    static Image water = new Image("/sprite/dice/water.png");
    static Image feather = new Image("/sprite/dice/feather.png");
    static Image plant = new Image("/sprite/dice/plant.png");
    static Image star = new Image("/sprite/dice/star.png");
    static Image turn = new Image("/sprite/dice/turn.png");
    static Image card = new Image("/sprite/dice/card.png");

    public DiceFace(int color, int pattern1, int pattern2, int pattern3, boolean canTurn, int timeProceed){
        super(100,100);
        final GraphicsContext gc = getGraphicsContext2D();
        switch(color){
            case 0:
                gc.setFill(Color.BLUE);
                break;
            case 1:
                gc.setFill(Color.RED);
                break;
            case 2:
                gc.setFill(Color.YELLOW);
                break;
            case 3:
                gc.setFill(Color.GREEN);
                break;
            default:
                break;
        }
        gc.fillRect(0,0,100,100);
        int[] patterns = {pattern1, pattern2, pattern3};
        double[] x = {18, 50, 34};
        double[] y = {50, 50, 18};
        for(int i = 0; i < 3; i++){
            switch(patterns[i]) {
                case FIRE:
                    gc.drawImage(fire, x[i], y[i]);
                    break;
                case WATER:
                    gc.drawImage(water, x[i], y[i]);
                    break;
                case FEATHER:
                    gc.drawImage(feather, x[i], y[i]);
                    break;
                case PLANT:
                    gc.drawImage(plant, x[i], y[i]);
                    break;
                case STAR:
                    gc.drawImage(star, x[i], y[i]);
                    break;
                case CARD:
                    gc.drawImage(card, 2, 2);
                    break;
                default:
                    break;
            }
        }
        switch(timeProceed){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
        if(canTurn){
            gc.drawImage(turn, 2, 2);
        }
    }
}
