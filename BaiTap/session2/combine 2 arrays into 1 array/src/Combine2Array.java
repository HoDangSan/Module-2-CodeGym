import java.util.Scanner;

public class Combine2Array {
    public static void  main(String[] args){
        // array 1
        int size1;
        int[] array1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size1 = scanner.nextInt();
            if (size1 > 20)
                System.out.println("Size should not exceed 20");
        } while (size1 > 20);

        array1 = new int[size1];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array1[i] = scanner.nextInt();
            i++;
        }
        // array 2
        int size2;
        int[] array2;
        do {
            System.out.print("Enter a size:");
            size2 = scanner.nextInt();
            if (size2 > 20)
                System.out.println("Size should not exceed 20");
        } while (size2 > 20);

        array2 = new int[size2];
        int j = 0;
        while (j < array2.length) {
            System.out.print("Enter element" + (j + 1) + " : ");
            array2[j] = scanner.nextInt();
            j++;
        }
        // array 3
        int[] array3 = new int[size1 + size2];
        // Comebine array 1 with array 2
        for(int k = 0; k < size1; k++){
            array3[k] = array1[k];
        }
        for(int r = size1; r < array3.length; r++){
            array3[r] = array2[r - size1];
        }

        System.out.print("Array 3 is ");
        for (int x: array3) {
            System.out.print(x + "\t");
        }
    }
}
