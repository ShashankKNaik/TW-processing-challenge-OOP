public class Ball {
    int ballDiameter=10;
    int currentPosition=0;

    public int updatePosition(int units){
        currentPosition+=units;
        return currentPosition;
    }

    public float setHorizontalPosition(int ballNumber){
        return (float)ballNumber/5;
    }
}