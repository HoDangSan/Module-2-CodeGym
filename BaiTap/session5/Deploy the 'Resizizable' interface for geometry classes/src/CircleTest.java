public class CircleTest {
    public static void main(String[] args) {
        Circle[] circle = new Circle[3];
        circle[0] = new Circle();
        System.out.println(circle[0]);

        circle[1] = new Circle(3.5);
        System.out.println(circle[1]);

        circle[2] = new Circle(3.5, "indigo", false);
        System.out.println(circle[2]);

        circle[0].resize(30);
        circle[1].resize(50);
        circle[2].resize(60);
        System.out.println(circle[0]);
        System.out.println(circle[1]);
        System.out.println(circle[2]);
    }
}
