public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(13.3);
        System.out.println(square);

        square = new Square(31.8, "yellow", true);
        System.out.println(square);
    }
}
