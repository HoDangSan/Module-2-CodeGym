import java.util.Scanner;

public class MaxArray2Way {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[3][3];

        System.out.println("Enter array: ");

        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print("array[" + i + "]" + "[" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        int max = array[0][0];

        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (max < array[i][j]){
                    max = array[i][j];
                }
            }
        }

        System.out.println("Max array is " + max);
    }
}
