import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class HelloDemo extends Application{
    // add any usefull package line
    private static final Image SCENERY = new Image("desert.png" ,600,400,true,true);
    final private ImageView imageViewScenereyLeft = new ImageView(SCENERY);

    private Hero hero = new Hero(100,200,"heros.png");
    ImageView heroSprite=hero.getSprite();

       public void start(Stage primaryStage){
           primaryStage.setTitle("demo");
           Group root = new Group();
           Scene scene = new Scene(root, 600, 400);
           primaryStage.setScene(scene);
           primaryStage.show();
           root.getChildren().add(imageViewScenereyLeft);
           root.getChildren().add(heroSprite);

        }
        public static void main(String[] args) {
            launch(args);
            // write your code here
        }
}

