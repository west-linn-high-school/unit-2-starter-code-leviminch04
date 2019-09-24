import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstFX extends Application{

  public void start(Stage stage){
    Rectangle rect = new Rectangle(50, 50, 150, 150);

    Circle circleM = new Circle();
    circleM.setCenterX(125.0f);
    circleM.setCenterY(125.0f);
    circleM.setRadius(75.0f);

    Circle circleS = new Circle();
    circleS.setCenterX(125.0f);
    circleS.setCenterY(125.0f);
    circleS.setRadius(20.0f);

    Ellipse ellipse = new Ellipse();
    ellipse.setCenterX(125.0f);
    ellipse.setCenterY(125.0f);
    ellipse.setRadiusX(20.0f);
    ellipse.setRadiusY(15.0f);

    rect.setStroke(Color.BLACK);
    rect.setFill(null);
    circleM.setStroke(Color.PURPLE);
    circleM.setFill(null);
    circleS.setStroke(Color.RED);
    //circleS.setFill(null);
    ellipse.setStroke(Color.GREEN);
    ellipse.setFill(null);
    Text test = new Text(110, 128, "WOW");
    test.setStroke(Color.WHITE);

    Group root = new Group(rect, circleM, circleS, ellipse, test);
    Scene scene = new Scene(root, 250, 250, Color.LIGHTBLUE);

    stage.setTitle("FirstFX");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
