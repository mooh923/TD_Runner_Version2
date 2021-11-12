import javafx.scene.Group;
import javafx.scene.Scene;

import java.awt.geom.Rectangle2D;

public class GameScene extends Scene {
    private Camera camera;
    private StaticThing left;
    private StaticThing right;

    public GameScene(Group g) {
        super (g);
        left = new StaticThing(0,0,"desert.png");
        g.getChildren().add(left.getImageStatique());
        camera = new Camera(1500, 0);
        render();
    }

    public void render(){
        double offset = camera.getX()%left.getX();

    }
    }


