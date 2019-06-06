package PointAndMove;

public class MovablePoint extends Point {
    private float xSpeed = 0;
    private float ySpeed = 0;

    public MovablePoint() {}
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] arr = {getxSpeed(),getySpeed()};
        return arr;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return super.toString()
                 + ", Speed=("
                 + getxSpeed()
                + ","
                + getySpeed()
                + ")";
    }

    public MovablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
