import java.util.Scanner;

public class UsedClassIllegalTriangleException {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the 3 sides of the triangle: ");
        System.out.print("Enter a: ");
        float a = scanner.nextInt();
        System.out.print("\n Enter b: ");
        float b = scanner.nextInt();
        System.out.print("\n Enter c: ");
        float c = scanner.nextInt();

        if (a <= 0 || b <= 0 || c <= 0 )
        try {
            throw new Exception("Không được nhập vào số âm");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        if (a + b <= c || b + c <= a || c + a <= b )
            try {
                throw new Exception("Các số nhập vào không hợp lệ");
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
    }
}
