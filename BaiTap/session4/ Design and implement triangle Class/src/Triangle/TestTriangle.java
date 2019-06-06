package Triangle;

public class TestTriangle {
    public static void main(String[] args){
        Shape shape = new Shape("Red",true);
        System.out.println(shape);

        Triangle triangle = new Triangle("Blue", true , 4, 5 , 6);
        System.out.println(triangle);
    }
}
