import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Line;

public class Snowman extends Application{

  public void start(Stage stage) {
    //numbers
    int xSide = 500;
    int ySide = 500;
    int topCircleHeight = 120;
    int armEndY = 190;
    int halfXSide = xSide / 2;
    int eyeRadius = 4;
    //shapes
    Rectangle snow = new Rectangle(0, 300, 500, 200);
    Circle bottom = new Circle();
    bottom.setCenterX(halfXSide);
    bottom.setCenterY(260);
    bottom.setRadius(60);
    Circle middle = new Circle();
    middle.setCenterX(halfXSide);
    middle.setCenterY(180);
    middle.setRadius(40);
    Circle top = new Circle();
    top.setCenterX(halfXSide);
    top.setCenterY(topCircleHeight);
    top.setRadius(25);
    Circle eyeLeft = new Circle();
    eyeLeft.setCenterX(235);
    eyeLeft.setCenterY(topCircleHeight);
    eyeLeft.setRadius(eyeRadius);
    Circle eyeRight = new Circle();
    eyeRight.setCenterX(265);
    eyeRight.setCenterY(topCircleHeight);
    eyeRight.setRadius(eyeRadius);
    Circle nose = new Circle();
    nose.setCenterX(halfXSide);
    nose.setCenterY(125);
    nose.setRadius(2);
    Line leftArm = new Line();
    leftArm.setStartX(230);
    leftArm.setStartY(160);
    leftArm.setEndX(190);
    leftArm.setEndY(armEndY);
    Line rightArm = new Line();
    rightArm.setStartX(270);
    rightArm.setStartY(160);
    rightArm.setEndX(310);
    rightArm.setEndY(armEndY);
    Rectangle botHat = new Rectangle(225, 90, 50, 10);
    Rectangle topHat = new Rectangle(235, 70, 30, 20);

    //Color and Fill
    snow.setStroke(Color.WHITE);
    snow.setFill(Color.WHITE);
    bottom.setStroke(Color.WHITE);
    bottom.setFill(Color.WHITE);
    middle.setStroke(Color.WHITE);
    middle.setFill(Color.WHITE);
    top.setStroke(Color.WHITE);
    top.setFill(Color.WHITE);
    eyeLeft.setStroke(Color.BLACK);
    eyeLeft.setFill(Color.BLACK);
    eyeRight.setStroke(Color.BLACK);
    eyeRight.setFill(Color.BLACK);
    nose.setStroke(Color.ORANGE);
    nose.setFill(Color.ORANGE);
    leftArm.setStroke(Color.BLACK);
    rightArm.setStroke(Color.BLACK);
    botHat.setStroke(Color.BLACK);
    botHat.setFill(Color.BLACK);
    topHat.setStroke(Color.BLACK);
    topHat.setFill(Color.BLACK);

    Group root = new Group(snow, bottom, leftArm, rightArm, middle, top, eyeLeft, eyeRight, nose, botHat, topHat);
    Scene scene = new Scene(root, xSide, ySide, Color.LIGHTBLUE);

    stage.setTitle("Snowman");
    stage.setScene(scene);
    stage.show();
  }

  public static void mina(String[] args){
    launch(args);
  }
}
