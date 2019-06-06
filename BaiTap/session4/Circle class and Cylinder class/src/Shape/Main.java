package Shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5, "Blue");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(3.5, "Blue", 2.0);
        System.out.println(cylinder);
    }
}
