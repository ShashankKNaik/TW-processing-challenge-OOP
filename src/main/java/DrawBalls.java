import processing.core.PApplet;

public class DrawBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    int ballCount=4;

    Ball[] ball=new Ball[ballCount];

    public static void main(String[] args) {
        PApplet.main("DrawBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for(int i=0;i<ballCount;i++){
            ball[i]=new Ball();
        }
    }

    @Override
    public void draw(){
        drawBallWithUpdatingPosition();
    }



    private void drawBallWithUpdatingPosition(){
        for(int i=0;i<ballCount;i++){
            ellipse(ball[i].currentPosition,
                    HEIGHT*ball[i].setHorizontalPosition(i+1),ball[i].ballDiameter,ball[i].ballDiameter);
            ball[i].updatePosition(i+1);
        }
    }

}