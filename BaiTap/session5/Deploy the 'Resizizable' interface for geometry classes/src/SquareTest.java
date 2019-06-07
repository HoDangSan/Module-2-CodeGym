public class SquareTest {
    public static void main(String[] args) {
        Square[] square = new Square[3];
        square[0] = new Square();
        System.out.println(square[0]);

        square[1] = new Square(13.3);
        System.out.println(square[1]);

        square[2] = new Square(31.8, "yellow", true);
        System.out.println(square[2]);

        square[0].resize(43);
        square[1].resize(100);
        square[2].resize(300);
        System.out.println(square[0]);
        System.out.println(square[1]);
        System.out.println(square[2]);

    }
}
