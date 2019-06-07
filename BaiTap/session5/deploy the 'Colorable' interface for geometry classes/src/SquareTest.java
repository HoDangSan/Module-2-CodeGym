public class SquareTest {
    public static void main(String[] args) {
        Square[] square = new Square[3];
        square[0] = new Square();
        System.out.println(square[0]);

        square[1] = new Square(2.3);
        System.out.println(square[1]);

        square[2] = new Square(5.8, "yellow", true);
        System.out.println(square[2]);

        square[0].howToColor();
    }
}
