public class Camera {

    private int x=0;
    private int y=0;

    public Camera(int x, int y) {
        this.x = x;
        this.y = x;

    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    @Override
    public String toString(){
        return(this.x+","+this.y);
    }
}
