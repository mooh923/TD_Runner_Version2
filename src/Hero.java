import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


import java.util.regex.Pattern;

public class Hero {
    private double x;
    private double y;
    private Image spriteSheet;
    private ImageView sprite;

    public ImageView getSprite() {
        return sprite;
    }

    public Hero(int x, int y, String fileName) {
    if (x>0) {
        if (x < 600) {
            this.x = x;
            this.y = y;
        }
    }
    this.spriteSheet= new Image(fileName);
    this.sprite = new ImageView(spriteSheet);
    this.sprite.setViewport(new Rectangle2D(20,10,60,90));
    this.sprite.setX(100);
    this.sprite.setY(200);

        //sprite.setViewport(new Rectangle2D(20,15,60,80));
    // largeur 60 hauteur 80 à partir du point en haut à gauche 20 15





    }
}
