import java.util.Scanner;

public class ShowGeometric {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Draw rectangle");
        System.out.println("Enter Width: ");
        int width = scanner.nextInt();

        System.out.println("Enter Height: ");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
        // triangle
        System.out.println("Draw triangle");
        System.out.println("Enter Width: ");
        int widthtriangle = scanner.nextInt();

        System.out.println("Enter Height: ");
        int heighttriangle = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < heighttriangle; i++){
            for (int j = 0; j < widthtriangle; j++){
                System.out.print("*");
                if(i == j) break;
            }
            System.out.println("");
        }
    }
}
