package PointAndMove;

public class MovablePointTest {
    public static void main(String[] args){
        MovablePoint movablePoint = new MovablePoint(3,4,1,2);

        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
