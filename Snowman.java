import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Snowman extends Application{

  public void start(Stage stage) {
    int xSide = 500;
    int ySide = 500;
    //shapes
    Rectangle snow = new Rectangle(0, xSide, 300, ySide);

    //Color and Fill
    snow.setStroke(Color.WHITE);

    Group root = new Group(snow);
    Scene scene = new Scene(root, xSide, ySide, Color.LIGHTBLUE);

    stage.setTitle("Snowman");
    stage.setScene(scene);
    stage.show();
  }

  public static void mina(String[] args){
    launch(args);
  }
}
