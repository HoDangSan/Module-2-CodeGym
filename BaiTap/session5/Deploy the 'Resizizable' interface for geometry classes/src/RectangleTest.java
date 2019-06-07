public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangle = new Rectangle[3];
        rectangle[0] = new Rectangle();
        System.out.println(rectangle[0]);

        rectangle[1] = new Rectangle(3.3, 10.3);
        System.out.println(rectangle[1]);

        rectangle[2] = new Rectangle(2.2, 6.6, "orange", false);
        System.out.println(rectangle[2]);

        rectangle[0].resize(23);
        rectangle[1].resize(33);
        rectangle[2].resize(44);
        System.out.println(rectangle[0]);
        System.out.println(rectangle[1]);
        System.out.println(rectangle[2]);
    }
}
