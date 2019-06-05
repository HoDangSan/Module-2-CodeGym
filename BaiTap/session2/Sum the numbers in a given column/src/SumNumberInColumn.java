import java.util.Scanner;

public class SumNumberInColumn {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size array square matrix: ");
        int size = scanner.nextInt();

        float[][] array = new float[size][size];
        float sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                System.out.print("array[" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter index colum: ");
        int column = scanner.nextInt();

        for (int i = 0; i < size; i++){
            sum += array[column][i];
        }

        System.out.println("Sum = " + sum);
    }
}
