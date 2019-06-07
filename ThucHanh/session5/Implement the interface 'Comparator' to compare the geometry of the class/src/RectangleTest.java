public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3.3, 10.3);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.2, 6.6, "orange", false);
        System.out.println(rectangle);
    }
}
